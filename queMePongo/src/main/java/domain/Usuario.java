package domain;

import java.util.List;

public class Usuario {
  private List<Prenda> atuendo;

  public void setAtuendo(List<Prenda> atuendo) {
    this.atuendo = atuendo;
  }

  public List<Prenda> getAtuendo() {
    return atuendo;
  }

  public void agregarPrenda(Prenda prenda){
    atuendo.add(prenda);
  }
}
