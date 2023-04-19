package domain;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Prenda {
  public Prenda(String tipoPrenda, String categoria, String material, String colorPrincipal, Optional<String> colorSecundario) throws Exception {
	  this.categoria = validar(categoria);
	  this.tipoPrenda = validarTipoPrenda(tipoPrenda,categoria);
	  this.material = validar(material);
	  this.colorPrincipal = validar(colorPrincipal);
	  this.colorSecundario = colorSecundario;
  }

 
  private String tipoPrenda;
  private String categoria;
  private String material;
  private String colorPrincipal;
  private Optional<String> colorSecundario;




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

  public Optional<String> getColorSecundario() {
    return colorSecundario;
  }

  public void setColorSecundario(Optional<String> colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  private String validar(String elemento) throws Exception{
    if(Objects.isNull(elemento)){
      throw new Exception("No puede ser null");
    }
    return elemento;
  }
  
 
  
  private String validarTipoPrenda(String tipo, String categoria) throws Exception {
	  if(Arrays.asList(TiposPrendas.values()).stream().anyMatch(t -> t.getTipo().equals(tipo) && t.getCategoria().equals(categoria)) || Objects.isNull(tipo)) {
		  return tipo;
	  }
	  throw new Exception("No es un tipo conocido");
  }
}
