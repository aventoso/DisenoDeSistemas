package domain.Estados;

import domain.Estado;

public class Nuevo implements Estado {

  private Integer descuento;
  @Override
  public Integer estado() {
    return descuento;
  }
}
