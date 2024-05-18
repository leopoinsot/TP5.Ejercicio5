package ar.unrn.model;

public class Recargo {
	private double porcentaje;

	public Recargo(double porcentaje){
		this.porcentaje = porcentaje;
	}

	public double aplicar(double monto){
		return monto + (porcentaje/100) * monto;
	}
}
