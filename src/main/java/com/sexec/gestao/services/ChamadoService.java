package com.sexec.gestao.services;

import com.sexec.gestao.dtos.ChamadoDTO;
import java.util.List;

public interface ChamadoService {

  List<ChamadoDTO> listarTodos();
  ChamadoDTO buscarPorId(Long id);
}
