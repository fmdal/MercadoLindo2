package controller;

import events.Eventos;
import views.panels.PanelIngDomicilios;

public class PanelDomiciliosControlador extends ControladorPaneles {

	public PanelDomiciliosControlador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object initPanel() {

		vista = new PanelIngDomicilios();
		((Eventos) vista.getEvento()).setControl(this);
		vista.setVisible(true);

		return this.vista;
	}

//	metodos
	
	public void ingresarDomicilioOK(){}
	public void aceptarDomicilios(){}
	
}
