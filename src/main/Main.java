package main;

import java.util.ArrayList;

import modelo.Descuento;
import modelo.Pedido;
import modelo.Producto;

public class Main {

	public static void main(String[] args) {
		Producto papasFritas = new Producto("Papas Fritas", 100);
		Producto hamburguesa = new Producto("Hamburguesa", 200);
		Producto cerveza = new Producto("Cerveza", 75);
		Producto helado = new Producto("Helado", 150);
		ArrayList<Producto> pedidos = new ArrayList<Producto>();
		pedidos.add(papasFritas);
		pedidos.add(hamburguesa);
		pedidos.add(cerveza);
		pedidos.add(cerveza);
		pedidos.add(helado);

		Pedido pedido = new Pedido(pedidos);
		Descuento descuento = new Descuento(pedido, 500, 0.1);

		System.out.println("Pedido original: " + pedido.devolverPrecio());
		System.out.println("Pedido descuento: " + descuento.devolverPrecio());
	}

}
