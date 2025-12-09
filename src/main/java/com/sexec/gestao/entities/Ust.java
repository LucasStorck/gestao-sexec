package com.sexec.gestao.entities;

import com.sexec.gestao.enums.PagamentoEnum;
import com.sexec.gestao.enums.ParecerEnum;
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
  private String quantidadeFaturtar;

  @Column(name = "parecer")
  private ParecerEnum parecer;

  @Column(name = "pagamento")
  private PagamentoEnum pagamento;

  @Column(name = "is_pago")
  private Boolean isPago;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_seplag", referencedColumnName = "id_seplag", insertable = false, updatable = false)
  private Chamado chamado;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "service", referencedColumnName = "service")
  private UstServices ustServices;

  public Ust() {
  }

  public Ust(String service, String name, String quantidadeFaturtar, ParecerEnum parecer, PagamentoEnum pagamento, Boolean isPago, Chamado chamado, UstServices ustServices) {
    this.service = service;
    this.name = name;
    this.quantidadeFaturtar = quantidadeFaturtar;
    this.parecer = parecer;
    this.pagamento = pagamento;
    this.isPago = isPago;
    this.chamado = chamado;
    this.ustServices = ustServices;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
    return quantidadeFaturtar;
  }

  public void setQuantidadeFaturtar(String quantidadeFaturtar) {
    this.quantidadeFaturtar = quantidadeFaturtar;
  }

  public ParecerEnum getParecer() {
    return parecer;
  }

  public void setParecer(ParecerEnum parecer) {
    this.parecer = parecer;
  }

  public PagamentoEnum getPagamento() {
    return pagamento;
  }

  public void setPagamento(PagamentoEnum pagamento) {
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

  public UstServices getUstServices() {
    return ustServices;
  }

  public void setUstServices(UstServices ustServices) {
    this.ustServices = ustServices;
  }
}
