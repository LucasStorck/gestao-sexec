package com.sexec.gestao.enums;

public enum ModuloEnum {
  ASSISTENCIA_SOCIAL("Assistência Social"),
  CIDADAO("Cidadão"),
  CONFIGURACAO("Configuração"),
  EDUCACAO("Educação"),
  FINANCEIRO("Financeiro"),
  GESTOR("Gestor"),
  INTEGRACOES("Integrações"),
  PATRIMONIAL("Patrimonial"),
  RECURSOS_HUMANOS("Recursos Humanos"),
  SAUDE("Saúde"),
  TRIBUTARIO("Tributário");

  public final String desc;

  ModuloEnum(String desc) {
    this.desc = desc;
  }

  public String getDesc() {
    return desc;
  }
}
