package ar.unrn.model;

public class RemeraNacional extends Remera{
	private double bonificacion;

	public RemeraNacional(double precio, Recargo recargo, MargenGanancia margenGanancia, double bonificacion){
		super(precio, recargo, margenGanancia);
		this.bonificacion = bonificacion;
	}

	@Override
	public double aplicarMargenGanancia(double precioProducto) {
		return margenGanancia.aplicar(precioProducto);
	}
	@Override
	public double aplicarRecargo(double precioProducto) {
		return recargo.aplicar(precioProducto);
	}
	@Override
	public double aplicarImpuesto(double precioProducto) {
		return precioProducto;
	}
	@Override
	public double aplicarBonificacion(double precioProducto) {
		return precioProducto - (bonificacion/100) * precioProducto;
	}
}
