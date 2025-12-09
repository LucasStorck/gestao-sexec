package com.sexec.gestao.entities;

import com.sexec.gestao.enums.PrioridadeEnum;
import com.sexec.gestao.enums.SituacaoEnum;
import com.sexec.gestao.enums.SubModuloEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "mudanca")
public class Mudanca {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "chamado")
  private String chamado;

  @Column(name = "sistema")
  private String sistema;

  @Column(name = "solicitante")
  private String solicitante;

  @Column(name = "responsavel")
  private String responsavel;

  @Column(name = "telefone")
  private String telefone;

  @Column(name = "finalidade")
  private String finalidade;

  @Enumerated(EnumType.STRING)
  @Column(name = "prioridade")
  private PrioridadeEnum prioridade;

  @Column(name = "indisponibilidade")
  private Boolean indisponibilidade;

  @Column(name = "realizar_comunicado")
  private Boolean realizarComunicado;

  @Column(name = "tempo_indisponibilidade")
  private Integer tempoIndisponibilidade;

  @Column(name = "justificativa")
  private String justificativa;

  @Column(name = "pre_requisitos_implementacao")
  private String preRequisitosImplementacao;

  @Column(name = "requisitos_implementacao")
  private String requisitosImplementacao;

  private String usuarioAprovador;

  private String evidenciaTeste;

  private String planoRollback;

  private String testeVolta;

  private String comunicacaoUsuario;

  private String responsavelComunicacao;

  private String modulo;

  @Enumerated(EnumType.STRING)
  @Column(name = "sub_modulo")
  private SubModuloEnum subModulo;

  @Enumerated(EnumType.STRING)
  @Column(name = "situacao")
  private SituacaoEnum situacao;

  private String tipoGmud;

  private String comunicado;

  @OneToOne
  @JoinColumn(name = "id_user_aprovador")
  private User user;

}
