package events;

import java.awt.event.ActionEvent;

import views.panels.PanelPortalReportes;
import views.panels.Paneles;

public class PanelPortalReportesEventos extends Eventos{

	public PanelPortalReportesEventos(Paneles panel) {
		super(panel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(((PanelPortalReportes) this.panel).getBtnSalir())) {
			
		} else if (e.getSource().equals(((PanelPortalReportes) this.panel).getBtnDescargar_Mayores10mil())) {
		
		} else if (e.getSource().equals(((PanelPortalReportes) this.panel).getTextPane_MasVendido())) {
			
		} else if (e.getSource().equals(((PanelPortalReportes) this.panel).getBtnDescargar_MasVendido())) {
			
		} else if (e.getSource().equals(((PanelPortalReportes) this.panel).getTextPane_Ultimas5Compras())) {
			
		} else if (e.getSource().equals(((PanelPortalReportes) this.panel).getBtnDescargar_Ultimas5Compras())) {
			
		}
		
	}


}
