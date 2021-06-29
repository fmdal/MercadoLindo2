package controller;

import events.Eventos;
import views.panels.PanelLogIn;
import views.panels.PanelPortalReportes;

public class PanelPortalReportesControlador extends ControladorPaneles{

	public PanelPortalReportesControlador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object initPanel() {
		vista = new PanelPortalReportes();
		((Eventos) vista.getEvento()).setControl(this);
		vista.setVisible(true);

		return this.vista;
	}
	
//	metodos

	public void descargar_Mayores10mil(){}
	public void descargar_MasVendido(){}
	public void descargar_Ultimas5Compras(){}


}
