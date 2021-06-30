package controller;

import events.Eventos;
import views.frames.FramePrincipal;
import views.panels.PanelIngDomicilios;

public class PanelDomiciliosControlador extends ControladorPaneles {

	public PanelDomiciliosControlador(FramePrincipal frame) {
		vista = new PanelIngDomicilios(frame);
	}

	public Object initPanel() {

		((Eventos) vista.getEvento()).setControl(this);

		vista.init();
		vista.setVisible(true);

		return this.vista;
	}

//	metodos

	public void ingresarDomicilioOK() {

		System.out.println("Ingresamos el domicilio");
	}

	public void aceptarDomicilios() {

		System.out.println("Aceptamos el domicilio");
	}

}
