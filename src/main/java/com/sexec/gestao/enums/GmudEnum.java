package com.sexec.gestao.enums;

public enum GmudEnum {

  APROVADO("Aprovado"),
  APROVADO_COM_RESSALVAS("Aprovado Com Ressalvas"),
  ANALISANDO("Analisando"),
  RECUSADO("Recusado");

  public final String desc;

  GmudEnum(String desc) {
    this.desc = desc;
  }

  public String getDesc() {
    return desc;
  }
}
