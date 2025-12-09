package com.sexec.gestao.services;

import com.sexec.gestao.dtos.ChamadoDTO;
import com.sexec.gestao.entities.Chamado;
import com.sexec.gestao.entities.Ust;
import com.sexec.gestao.enums.PagamentoEnum;
import com.sexec.gestao.enums.ParecerEnum;
import com.sexec.gestao.mappers.ChamadoMapper;
import com.sexec.gestao.repositories.ChamadoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ChamadoServiceImpl implements ChamadoService {

  private final ChamadoRepository chamadoRepository;
  private final ChamadoMapper chamadoMapper;

  public ChamadoServiceImpl(ChamadoRepository chamadoRepository, ChamadoMapper chamadoMapper) {
    this.chamadoRepository = chamadoRepository;
    this.chamadoMapper = chamadoMapper;
  }

  @Override
  public List<ChamadoDTO> listarTodos() {
    return chamadoRepository.findAll().stream().map(chamadoMapper::toDto).toList();
  }

  @Override
  public ChamadoDTO buscarPorId(Long id) {
    return chamadoRepository.findById(id).map(chamadoMapper::toDto).orElseThrow(() -> new RuntimeException("Chamado Não Encontrado"));
  }

  private String calcularParecer(Chamado chamado) {
    var pareceres = chamado.getUsts().stream().map(Ust::getParecer).toList();

    if (pareceres.contains(ParecerEnum.NAO_ANALISADO)) {
      return ParecerEnum.NAO_ANALISADO.name();
    }
    if (pareceres.contains(ParecerEnum.NAO_HOMOLOGADO)) {
      return ParecerEnum.NAO_HOMOLOGADO.name();
    }
    return ParecerEnum.HOMOLOGADO.name();
  }

  private String calcularPagamento(Chamado chamado) {
    var pagamentos = chamado.getUsts().stream().map(Ust::getPagamento).toList();

    if (pagamentos.contains(PagamentoEnum.NAO_ANALISADO)) {
      return PagamentoEnum.NAO_ANALISADO.name();
    }
    if (pagamentos.contains(PagamentoEnum.NAO_FAVORAVEL_PAGAMENTO)) {
      return PagamentoEnum.NAO_FAVORAVEL_PAGAMENTO.name();
    }
    return PagamentoEnum.FAVORAVEL_PAGEMENTO.name();
  }

  private BigDecimal calcularTotalUst(Chamado chamado) {
    return chamado.getUsts().stream().filter(u -> u.getUstServices() != null).map(u -> u.getUstServices().getBaseValor().multiply(u.getUstServices().getAmount())).reduce(BigDecimal.ZERO, BigDecimal::add);
  }


  private String gerarNomesUst(Chamado chamado) {
    return chamado.getUsts().stream().map(Ust::getName).reduce((a, b) -> a + " | " + b).orElse("");
  }
}
