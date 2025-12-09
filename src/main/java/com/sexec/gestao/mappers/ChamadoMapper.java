package com.sexec.gestao.mappers;

import com.sexec.gestao.dtos.ChamadoDTO;
import com.sexec.gestao.entities.Chamado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChamadoMapper {
  ChamadoDTO toDto(Chamado chamado);
  Chamado toEntity(ChamadoDTO chamadoDTO);
}
