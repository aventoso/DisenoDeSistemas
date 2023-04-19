package domain;

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

	

	
}
