package controller;

import events.Eventos;
import views.panels.PanelIngDomicilios;
import views.panels.PanelLogIn;

public class PanelLogInControlador extends ControladorPaneles{

	public PanelLogInControlador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object initPanel() {
		vista = new PanelLogIn();
		((Eventos) vista.getEvento()).setControl(this);
		vista.setVisible(true);

		return this.vista;
	}

//	metodos
	
public void logIn(){}

	
}
