package events;

import java.awt.event.ActionEvent;

import views.frames.FramePrincipal;
import views.panels.PanelCarrito;
import views.panels.Paneles;

public class PanelCarritoEventos extends Eventos {

	private FramePrincipal frame;

	public PanelCarritoEventos(Paneles panel) {
		super(panel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(((PanelCarrito) this.panel).getBtnComprarCarrito())) {

		} else if (e.getSource().equals(((PanelCarrito) this.panel).getBtnCambiarDomicilio())) {

		} else if (e.getSource().equals(((PanelCarrito) this.panel).getBtnSalirMiCarrito())) {

		} else if (e.getSource().equals(((PanelCarrito) this.panel).getBtnVolverAlaTienda())) {

		} else if (e.getSource().equals(((PanelCarrito) this.panel).getBtnCambiarTarjeta())) {

		} else if (e.getSource().equals(((PanelCarrito) this.panel).getBtnVaciarCarrito())) {

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

	/**
	 * Create the panel.
	 */

}
