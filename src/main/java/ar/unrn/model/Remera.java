package ar.unrn.model;

public abstract class Remera {
	protected double precio;
	protected Recargo recargo;
	protected MargenGanancia margenGanancia;

	public Remera(double precio, Recargo recargo, MargenGanancia margenGanancia){
		this.precio = precio;
		this.recargo = recargo;
		this.margenGanancia = margenGanancia;
	}

	public final double precioFinal(){
		double precioFinal = precio;
		precioFinal = aplicarMargenGanancia(
				      aplicarBonificacion(
					  aplicarImpuesto(
					  aplicarRecargo(precioFinal))));
		return  precioFinal;
	}

	public abstract double aplicarMargenGanancia(double precioProducto);
	public abstract double aplicarRecargo(double precioProducto);
	public abstract double aplicarImpuesto(double precioProducto);
	public abstract double aplicarBonificacion(double precioProducto);


}
