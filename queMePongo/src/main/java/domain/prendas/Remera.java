package domain.prendas;

import domain.Prenda;
import java.util.Objects;

public class Remera extends Prenda {


  public Remera(String nombre, String tipoPrenda, String categoria, String material, String colorPrincipal, String colorSecundario) {
    super(nombre, tipoPrenda, categoria, material, colorPrincipal, colorSecundario);
  }

  @Override
  public String validarTipoPrenda(String tipo) {
    if(tipo.equals("remera")){
      return tipo;
    }
    throw new RuntimeException("No coinciden los tipos de prendas");
  }
}
