package domain;

import java.util.Date;
import java.util.List;

public class Venta {
	
	private List<Prenda> prendas;
	private Integer cantidad;
	private Date fecha;
	private MedioPago medio;
	
	
	public Integer precioVenta() {
		return prendas.stream().mapToInt(p -> p.precio() + medio.recargo(p)).sum();
	}


	public List<Prenda> getPrendas() {
		return prendas;
	}


	public void setPrendas(List<Prenda> prendas) {
		this.prendas = prendas;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public MedioPago getMedio() {
		return medio;
	}


	public void setMedio(MedioPago medio) {
		this.medio = medio;
	}
	
	
	

}
