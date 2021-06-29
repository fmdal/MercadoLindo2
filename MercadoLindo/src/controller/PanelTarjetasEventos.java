package controller;

import events.Eventos;
import views.panels.PanelIngTarjetas;
import views.panels.PanelRegistrarse;

public class PanelTarjetasEventos extends ControladorPaneles{

	public PanelTarjetasEventos() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object initPanel() {
		vista = new PanelIngTarjetas();
		((Eventos) vista.getEvento()).setControl(this);
		vista.setVisible(true);

		return this.vista;
	}

//	metodos
	
	public void ingresarTarjetaOK(){}
	public void aceptarTarjeta(){}
	
}
