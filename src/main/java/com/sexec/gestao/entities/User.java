package com.sexec.gestao.entities;

import com.sexec.gestao.enums.RoleEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String email;

  private String password;

  private RoleEnum role;
}
