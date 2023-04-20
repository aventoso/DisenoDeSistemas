package domain;

import java.util.Arrays;

public enum TiposPrendas {
	REMERA("remera","manga corta"),PANTALON("pantalon","parte inferior");//habria que agregar todos;
	
	private String tipo;
	private String categoria;

	TiposPrendas(String tipo, String categoria) {
		this.tipo = tipo;
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public static boolean esConocido(String tipo, String categoria) {
		return Arrays.asList(TiposPrendas.values()).stream().anyMatch(t -> t.getTipo().equals(tipo) && t.getCategoria().equals(categoria));
	}
	

	
}
