package com.sexec.gestao.dtos;

public record ChamadoDTO(
        Long id,
        String link,
        String entidade,
        String parecer,
        String pagamento,
        Double totalValorUst,
        String ustsName) {
}
