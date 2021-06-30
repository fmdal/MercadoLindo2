package controller;

import events.Eventos;
import views.frames.FramePrincipal;
import views.panels.PanelIngTarjetas;

public class PanelTarjetasControlador extends ControladorPaneles {

	public PanelTarjetasControlador(FramePrincipal frame) {
		vista = new PanelIngTarjetas(frame);
	}

	public Object initPanel() {
		((Eventos) vista.getEvento()).setControl(this);

		vista.init();
		vista.setVisible(true);

		return this.vista;
	}

//	metodos

	public void ingresarTarjetaOK() {
		System.out.println("Ingresamos la tarjeta");
	}

	public void aceptarTarjeta() {
		System.out.println("Aceptamos la tarjeta");
	}

}
