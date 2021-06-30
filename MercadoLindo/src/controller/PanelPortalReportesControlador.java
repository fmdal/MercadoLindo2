package controller;

import events.Eventos;
import views.frames.FramePrincipal;
import views.panels.PanelPortalReportes;

public class PanelPortalReportesControlador extends ControladorPaneles {

	public PanelPortalReportesControlador(FramePrincipal frame) {
		vista = new PanelPortalReportes(frame);
	}

	public Object initPanel() {
		((Eventos) vista.getEvento()).setControl(this);

		vista.init();
		vista.setVisible(true);

		return this.vista;
	}

//	metodos

	public void descargar_Mayores10mil() {
	}

	public void descargar_MasVendido() {
	}

	public void descargar_Ultimas5Compras() {
	}

}
