package controller;

import events.Eventos;
import views.frames.FramePrincipal;
import views.panels.PanelCarrito;

public class PanelCarritoControlador extends ControladorPaneles {

	public PanelCarritoControlador(FramePrincipal frame) {

		vista = new PanelCarrito(frame);
	}

	public Object initPanel() {

		((Eventos) vista.getEvento()).setControl(this);

		vista.init();
		vista.setVisible(true);

		return this.vista;
	}

	public void comprarCarrito() {
		System.out.println("Compramos el carrito");
	}

	public void vaciarCarrito() {
		System.out.println("Vaciamos el carrito");
	}

	public void montoTotal() {

	}

}
