package ar.unrn.model;

public class MargenGanancia {
	private double porcentaje;

	public MargenGanancia(double porcentaje){
		this.porcentaje = porcentaje;
	}

	public double aplicar(double monto){
		return monto + (porcentaje/100) * monto;
	}
}
