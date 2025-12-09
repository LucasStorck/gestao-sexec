package com.sexec.gestao.enums;

public enum SubModuloEnum {
  HABILITACAO("Habilitação"),
  SOCIAL("Social"),
  PREFEITURA_ONLINE("Prefeitura Online"),
  CONFIGURACAO("Configuração"),
  ALIMENTACAO_ESCOLAR("Alimentação Escolar"),
  BIBLIOTECA("Biblioteca"),
  ESCOLA("Escola"),
  MATRICULA_ONLINE("Matricula Online"),
  SECRETARIA("Secretaria"),
  TRANSPORTE_ESCOLAR("Transporte escolar"),
  CONTABILIDADE("Contabilidade"),
  CUSTOS("Custos"),
  EMPENHO("Empenho"),
  ORCAMENTO("Orçamento"),
  PLANEJAMENTO("Planejamento"),
  TESOURARIA("Tesouraria"),
  GESTOR("Gestor"),
  EFD_REINF("EFD REINF"),
  COMPRAS("Compras"),
  CONTRATOS("Contratos"),
  LICITACOES("Licitações"),
  MATERIAL("Material"),
  OUVIDORIA("Ouvidoria"),
  PATRIMONIO("Patrimônio"),
  PNCP("PNCP"),
  PROTOCOLO("Protocolo"),
  VEICULOS("Veículos"),
  ESOCIAL("Esocial"),
  EST_PROBATORIO("EST Probatório"),
  PESSOAL("Pessoal"),
  RH("RH"),
  AGENDAMENTO("Agendamento"),
  AMBULATORIAL("Ambulatorial"),
  FARMACIA("Farmácia"),
  FUNDO_ASSISTENCIA_MEDICA("Fundo de Assistência Médica"),
  HIPERDIA("Hiperdia"),
  LABORATORIO("Laboratório"),
  TFD("TFD"),
  VACINAS("Vacinas"),
  AGUA("Água"),
  ARRECADACAO("Arrecadação"),
  CADASTRO("Cadastro"),
  CEMITERIO("Cemitério"),
  CONTRIBUICAO("Contribuição"),
  DIVERSOS("Diversos"),
  DIVIDA_ATIVA("Dívida Ativa"),
  FISCAL("Fiscal"),
  INFLATORES("Inflatores"),
  ISSQN("ISSQN"),
  ITBI("ITBI"),
  JURIDICO("Jurídico"),
  MARCAS("Marcas"),
  MEIO_AMBIENTE("Meio Ambiente"),
  NOTIFICACOES("Notificações"),
  PROJETOS("Projetos");

  private final String desc;

  SubModuloEnum(String desc) {
    this.desc = desc;
  }

  public String getDescricao() {
    return desc;
  }
}
