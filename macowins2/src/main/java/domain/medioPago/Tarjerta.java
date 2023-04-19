package domain.medioPago;

import domain.MedioPago;
import domain.Prenda;

public class Tarjerta implements MedioPago{
	
	private Integer cuotas;
	private Integer coef;

	@Override
	public Integer recargo(Prenda prenda) {
		return (int) (this.cuotas*coef*0.01*prenda.precio()); 
	}

}
