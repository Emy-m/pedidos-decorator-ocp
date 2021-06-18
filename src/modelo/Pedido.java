package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Orden {
	private List<Producto> productos;

	public Pedido(List<Producto> productos) {
		this.productos = productos;
	}

	public Pedido() {
		this.productos = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public double devolverPrecio() {
		double monto = 0;

		for (Producto producto : productos) {
			monto += producto.getPrecio();
		}

		return monto;
	}
}
