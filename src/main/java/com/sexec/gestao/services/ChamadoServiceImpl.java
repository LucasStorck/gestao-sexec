package com.sexec.gestao.services;

import com.sexec.gestao.dtos.ChamadoDTO;
import com.sexec.gestao.mappers.ChamadoMapper;
import com.sexec.gestao.repositories.ChamadoRepository;
import org.springframework.stereotype.Service;

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
    return chamadoRepository.findAll()
            .stream()
            .map(chamadoMapper::toDto)
            .toList();
  }

  @Override
  public ChamadoDTO buscarPorId(Long id) {
    return chamadoRepository.findById(id)
            .map(chamadoMapper::toDto)
            .orElseThrow(() -> new RuntimeException("Chamado Não Encontrado"));

  }
}
