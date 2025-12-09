package com.sexec.gestao.enums;

public enum ParecerEnum {

  NAO_ANALISADO("Não Analizado"),
  NAO_HOMOLOGADO("Não Homologado"),
  HOMOLOGADO("Homologado");

  private final String desc;

  ParecerEnum(String desc){
    this.desc = desc;
  }

  public String getDesc(){
    return desc;
  }
}
