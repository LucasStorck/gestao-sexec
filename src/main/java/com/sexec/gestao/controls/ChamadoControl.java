package com.sexec.gestao.controls;

import com.sexec.gestao.dtos.ChamadoDTO;
import com.sexec.gestao.services.ChamadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chamado")
public class ChamadoControl {

  private final ChamadoService chamadoService;

  public ChamadoControl(ChamadoService chamadoService) {
    this.chamadoService = chamadoService;
  }

  @GetMapping
  public List<ChamadoDTO> listar() {
    return chamadoService.listarTodos();
  }

  @GetMapping("/{id}")
  public ChamadoDTO buscarPorId(@PathVariable Long id) {
    return chamadoService.buscarPorId(id);
  }
}
