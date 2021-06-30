package events;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import views.frames.FramePrincipal;
import views.panels.PanelPortalReportes;
import views.panels.Paneles;

public class PanelPortalReportesEventos extends Eventos {

	private FramePrincipal frame;

	public PanelPortalReportesEventos(Paneles panel, FramePrincipal frame) {
		super(panel);
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(((PanelPortalReportes) this.panel).getBtnSalir())) {
			int opcion = JOptionPane.showConfirmDialog(this.panel, "¿Seguro que desea salir?", "Salir",
					JOptionPane.YES_NO_OPTION);
			if (opcion == 0) {
				System.exit(0);
			}

		} else if (e.getSource().equals(((PanelPortalReportes) this.panel).getBtnDescargar_Mayores10mil())) {

		} else if (e.getSource().equals(((PanelPortalReportes) this.panel).getTextPane_MasVendido())) {

		} else if (e.getSource().equals(((PanelPortalReportes) this.panel).getBtnDescargar_MasVendido())) {

		} else if (e.getSource().equals(((PanelPortalReportes) this.panel).getTextPane_Ultimas5Compras())) {

		} else if (e.getSource().equals(((PanelPortalReportes) this.panel).getBtnDescargar_Ultimas5Compras())) {

		}

	}

	/**
	 * @return el campo frame
	 */
	public FramePrincipal getFrame() {
		return frame;
	}

	/**
	 * @param frame El parametro frame para setear
	 */
	public void setFrame(FramePrincipal frame) {
		this.frame = frame;
	}

}
