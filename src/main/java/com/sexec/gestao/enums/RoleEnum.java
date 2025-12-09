package com.sexec.gestao.enums;

public enum RoleEnum {
  ADMIN("admin"),
  FISCAL("fiscal"),
  TICKET_MANAGER("ticket_manger"),
  GMUD("gmud"),
  DEFAULT("default");

  public final String desc;

  RoleEnum(String desc) {
    this.desc = desc;
  }

  public static RoleEnum fromValue(String value) {
    for (RoleEnum role : values()) {
      if (role.desc.equalsIgnoreCase(value)) {
        return role;
      }
    }
    throw new IllegalArgumentException("Role Inválida: " + value);
  }

  public String getDesc() {
    return desc;
  }
}
