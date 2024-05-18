package ar.unrn.model;

public class RemeraImportada extends Remera{
	private double impuesto;

	public RemeraImportada(double precio, Recargo recargo, MargenGanancia margenGanancia,double impuesto){
		super(precio, recargo, margenGanancia);
		this.impuesto = impuesto;
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
		return precioProducto + (impuesto/100) * precioProducto;
	}
	@Override
	public double aplicarBonificacion(double precioProducto) {
		return precioProducto;
	}
}
