package controller;

import events.Eventos;
import views.frames.FramePrincipal;
import views.panels.PanelTiendaPrincipal;

public class PanelTiendaPrincipalControlador extends ControladorPaneles {

	public PanelTiendaPrincipalControlador(FramePrincipal frame) {
		vista = new PanelTiendaPrincipal(frame);
	}

	public Object initPanel() {
		((Eventos) vista.getEvento()).setControl(this);

		vista.init();
		vista.setVisible(true);

		return this.vista;
	}

//	metodos
	public void verCarritoDeTienda() {
	}

	public void buscarArticulo() {
	}

	public void agregarArticuloCarrito() {
	}

	public void quitarArticuloCarrito() {
	}

}
