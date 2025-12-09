package com.sexec.gestao.entities;

import com.sexec.gestao.enums.PagamentoEnum;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "chamados")
public class Chamado {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "link")
  private String link;

  @Column(name = "entidade")
  private String entidade;

  @Column(name = "data_fechamento")
  private LocalDateTime dataFechamento;

  @Column(name = "tempo_solucao_progresso")
  private LocalDateTime tempoSolucaoProgresso;

  @Column(name = "categorias")
  private String categorias;

  @Enumerated(EnumType.STRING)
  @Column(name = "pagamento")
  private PagamentoEnum pagamento;

  @OneToMany
  @JoinColumn(name = "id_seplag", referencedColumnName = "id_seplag")
  @OrderBy("service ASC")
  private List<Ust> usts;

  public Chamado() {
  }

  public Chamado(String link, String entidade, LocalDateTime dataFechamento, LocalDateTime tempoSolucaoProgresso, String categorias, PagamentoEnum pagamento, List<Ust> usts) {
    this.link = link;
    this.entidade = entidade;
    this.dataFechamento = dataFechamento;
    this.tempoSolucaoProgresso = tempoSolucaoProgresso;
    this.categorias = categorias;
    this.pagamento = pagamento;
    this.usts = usts;
  }

  public Long getId() {
    return id;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getEntidade() {
    return entidade;
  }

  public void setEntidade(String entidade) {
    this.entidade = entidade;
  }

  public LocalDateTime getDataFechamento() {
    return dataFechamento;
  }

  public void setDataFechamento(LocalDateTime dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  public LocalDateTime getTempoSolucaoProgresso() {
    return tempoSolucaoProgresso;
  }

  public void setTempoSolucaoProgresso(LocalDateTime tempoSolucaoProgresso) {
    this.tempoSolucaoProgresso = tempoSolucaoProgresso;
  }

  public String getCategorias() {
    return categorias;
  }

  public void setCategorias(String categorias) {
    this.categorias = categorias;
  }

  public void setPagamento(PagamentoEnum pagamento) {
    this.pagamento = pagamento;
  }

  public List<Ust> getUsts() {
    return usts;
  }

  public void setUsts(List<Ust> usts) {
    this.usts = usts;
  }
}

