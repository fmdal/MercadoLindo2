package controller;

import events.Eventos;
import views.panels.PanelTiendaPrincipal;

public class PanelTiendaPrincipalControlador extends ControladorPaneles {

	public PanelTiendaPrincipalControlador() {
		vista = new PanelTiendaPrincipal();
	}

	@Override
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
