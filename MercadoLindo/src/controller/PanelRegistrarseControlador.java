package controller;

import events.Eventos;
import views.frames.FramePrincipal;
import views.panels.PanelRegistrarse;

public class PanelRegistrarseControlador extends ControladorPaneles {

	public PanelRegistrarseControlador(FramePrincipal frame) {
		vista = new PanelRegistrarse(frame);
	}

	public Object initPanel() {
		((Eventos) vista.getEvento()).setControl(this);

		vista.init();
		vista.setVisible(true);

		return this.vista;
	}

//	metodos

	public void ingresarTarjetas() {
	}

	public void ingDomicilios() {
	}

	public void crearCuenta() {
	}

}
