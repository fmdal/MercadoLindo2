package controller;

import events.Eventos;
import views.panels.PanelCarrito;

public class PanelCarritoControlador extends ControladorPaneles {

	public PanelCarritoControlador(PanelCarrito carrito) {
		this.vista = carrito;
	}

	@Override
	public Object initPanel() {
		((Eventos) vista.getEvento()).setControl(this);

		vista.setVisible(true);

		return this.vista;
	}

//	metodos

	public void volverAlaTienda() {
	}

	public void cambiarDomicilio() {
	}

	public void cambiarTarjeta() {
	}

	public void comprarCarrito() {
	}

	public void vaciarCarrito() {
	}

	public void montoTotal() {
	}

}
