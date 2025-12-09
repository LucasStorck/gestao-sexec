package com.sexec.gestao.enums;

public enum SituacaoEnum {

  AGUARDANDO("Aguardando"),
  PROCESSANDO("Processando"),
  PROCESSADO("Processado"),
  ERROR("Erro");

  private final String desc;

  SituacaoEnum(String desc) {
    this.desc = desc;
  }

  public String getDesc(){
    return desc;
  }
}
