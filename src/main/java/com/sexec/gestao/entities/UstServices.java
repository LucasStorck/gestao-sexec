package com.sexec.gestao.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ust_services")
public class UstServices {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "service")
  private String service;

  @Column(name = "amount")
  private BigDecimal amount;

  @Column(name = "base_valor")
  private BigDecimal baseValor;

  @Column(name = "tipo")
  private String tipo;

  @Column(name = "effective_date")
  private LocalDateTime effectiveDate;

  @OneToMany(mappedBy = "ustService")
  private List<Ust> ust;

  public UstServices() {
  }

  public UstServices(Long id, String service, BigDecimal amount, BigDecimal baseValor, String tipo, LocalDateTime effectiveDate, List<Ust> ust) {
    this.id = id;
    this.service = service;
    this.amount = amount;
    this.baseValor = baseValor;
    this.tipo = tipo;
    this.effectiveDate = effectiveDate;
    this.ust = ust;
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

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BigDecimal getBaseValor() {
    return baseValor;
  }

  public void setBaseValor(BigDecimal baseValor) {
    this.baseValor = baseValor;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public LocalDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(LocalDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public List<Ust> getUst() {
    return ust;
  }

  public void setUst(List<Ust> ust) {
    this.ust = ust;
  }

  public BigDecimal getValorUnitario(){
    return baseValor.multiply(amount);
  }
}
