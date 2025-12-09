package com.sexec.gestao.enums;

public enum PagamentoEnum {

  NAO_ANALISADO("Não Analizado"),
  NAO_FAVORAVEL_PAGAMENTO("Não Favorável ao Pagamento"),
  FAVORAVEL_PAGAMENTO("Favorável ao Pagamento");

  private final String desc;

  PagamentoEnum(String desc) {
    this.desc = desc;
  }
}
