package controller;

import events.Eventos;
import views.panels.PanelPortalReportes;
import views.panels.PanelRegistrarse;

public class PanelRegistrarseControlador extends ControladorPaneles{

	public PanelRegistrarseControlador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object initPanel() {
		vista = new PanelRegistrarse();
		((Eventos) vista.getEvento()).setControl(this);
		vista.setVisible(true);

		return this.vista;
	}

//	metodos
	
	public void ingresarTarjetas(){}
	public void ingDomicilios(){}
	public void crearCuenta(){}
	
}
