package controller;

import events.Eventos;
import views.panels.PanelTiendaPrincipal;

public class PanelTiendaPrincipalControlador extends ControladorPaneles{

	public PanelTiendaPrincipalControlador() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public Object initPanel() {
		vista = new PanelTiendaPrincipal();
		((Eventos) vista.getEvento()).setControl(this);
		vista.setVisible(true);

		return this.vista;
	}

//	metodos
	public void verCarritoDeTienda(){}
	public void buscarArticulo(){}
	public void agregarArticuloCarrito(){}
	public void quitarArticuloCarrito(){}
}
