package events;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import views.frames.FramePrincipal;
import views.panels.PanelRegistrarse;
import views.panels.Paneles;

public class PanelRegistrarseEventos extends Eventos {

	private FramePrincipal frame;

	public PanelRegistrarseEventos(Paneles panel, FramePrincipal frame) {
		super(panel);
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(((PanelRegistrarse) this.panel).getBtnSalir())) {
			int opcion = JOptionPane.showConfirmDialog(this.panel, "¿Seguro que desea salir?", "Salir",
					JOptionPane.YES_NO_OPTION);
			if (opcion == 0) {
				System.exit(0);
			}

		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getBtnCrearCuenta())) {

		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getBtnIngDomicilios())) {

		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getBtnIngresarTarjetas())) {

		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getTextPane_dni())) {

		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getPasswordField())) {

		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getTextPane_nombre())) {

		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getTextPane_apellido())) {

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
