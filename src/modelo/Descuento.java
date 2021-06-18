package modelo;

public class Descuento implements Orden {

	private Orden orden;
	private double precioMinimoDescuento;
	private double porcentajeDescuento;

	public Descuento(Orden orden, double precioMinimoDescuento, double porcentajeDescuento) {
		this.orden = orden;
		this.precioMinimoDescuento = precioMinimoDescuento;
		this.porcentajeDescuento = porcentajeDescuento;
	}

	@Override
	public void agregarProducto(Producto producto) {
		orden.agregarProducto(producto);
	}

	@Override
	public double devolverPrecio() {
		double monto = orden.devolverPrecio();

		if (monto > precioMinimoDescuento) {
			monto *= (1 - porcentajeDescuento);
		}

		return monto;
	}

}
