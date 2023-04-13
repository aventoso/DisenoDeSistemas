package domain;

import java.util.Objects;

public abstract class Prenda {
  public Prenda(String nombre,String tipoPrenda, String categoria, String material, String colorPrincipal, String colorSecundario) {
    this.nombre = nombre;
    this.tipoPrenda = validarTipoPrenda(tipoPrenda);
    this.categoria = validar(categoria);
    this.material = validar(material);
    this.colorPrincipal = validar(colorPrincipal);
    this.colorSecundario = colorSecundario;
  }

  private String nombre;
  private String tipoPrenda;
  private String categoria;
  private String material;
  private String colorPrincipal;
  private String colorSecundario;


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTipoPrenda() {
    return tipoPrenda;
  }

  public void setTipoPrenda(String tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getColorPrincipal() {
    return colorPrincipal;
  }

  public void setColorPrincipal(String colorPrincipal) {
    this.colorPrincipal = colorPrincipal;
  }

  public String getColorSecundario() {
    return colorSecundario;
  }

  public void setColorSecundario(String colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  private String validar(String elemento){
    if(Objects.isNull(elemento)){
      throw new RuntimeException("No puede ser null");
    }
    return elemento;
  }
  public abstract String validarTipoPrenda(String tipo);
}
