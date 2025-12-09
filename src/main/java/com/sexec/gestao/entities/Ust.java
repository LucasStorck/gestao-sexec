package com.sexec.gestao.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ust")
public class Ust {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "service")
  private String service;

  @Column(name = "name")
  private String name;

  @Column(name = "quantidade_faturar")
  private String QuantidadeFaturtar;

  @Column(name = "parecer")
  private String parecer;

  @Column(name = "pagamento")
  private String pagamento;

  @Column(name = "is_pago")
  private Boolean isPago;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_seplag", referencedColumnName = "id_seplag", insertable = false, updatable = false)
  private Chamado chamado;

  public Ust() {
  }

  public Ust(String service, String name, String quantidadeFaturtar, String parecer, String pagamento, Boolean isPago, Chamado chamado) {
    this.service = service;
    this.name = name;
    QuantidadeFaturtar = quantidadeFaturtar;
    this.parecer = parecer;
    this.pagamento = pagamento;
    this.isPago = isPago;
    this.chamado = chamado;
  }

  public Long getId() {
    return id;
  }

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getQuantidadeFaturtar() {
    return QuantidadeFaturtar;
  }

  public void setQuantidadeFaturtar(String quantidadeFaturtar) {
    QuantidadeFaturtar = quantidadeFaturtar;
  }

  public String getParecer() {
    return parecer;
  }

  public void setParecer(String parecer) {
    this.parecer = parecer;
  }

  public String getPagamento() {
    return pagamento;
  }

  public void setPagamento(String pagamento) {
    this.pagamento = pagamento;
  }

  public Boolean getPago() {
    return isPago;
  }

  public void setPago(Boolean pago) {
    isPago = pago;
  }

  public Chamado getChamado() {
    return chamado;
  }

  public void setChamado(Chamado chamado) {
    this.chamado = chamado;
  }
}
