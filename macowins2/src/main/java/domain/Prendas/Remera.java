package domain.Prendas;

import domain.Estado;
import domain.Prenda;

public class Remera implements Prenda {

  private Integer precio;
  private Estado estado;
  @Override
  public Integer precio() {
    return precio + precio*estado.estado();
  }
}
