package com.sexec.gestao.enums;

public enum PrioridadeEnum {

  ALTA("Alta"),
  MEDIA("Média"),
  BAIXA("Baixa");

  private final String desc;

  PrioridadeEnum(String desc) {
    this.desc = desc;
  }

  public String getDesc() {
    return desc;
  }
}
