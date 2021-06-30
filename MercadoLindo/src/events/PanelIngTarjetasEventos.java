package events;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

import controller.PanelCarritoControlador;
import controller.PanelTarjetasControlador;
import views.frames.FramePrincipal;
import views.panels.PanelIngTarjetas;
import views.panels.Paneles;

public class PanelIngTarjetasEventos extends Eventos {

	private FramePrincipal frame;

	public PanelIngTarjetasEventos(Paneles panel, FramePrincipal frame) {
		super(panel);
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(((PanelIngTarjetas) this.panel).getBtnIngresarTarjetaOK())) {
			((PanelTarjetasControlador) control).ingresarTarjetaOK();

		} else if (e.getSource().equals(((PanelIngTarjetas) this.panel).getBtnAceptarTarjeta())) {
			((PanelTarjetasControlador) control).aceptarTarjeta();

		}
		PanelCarritoControlador carritoControlador = new PanelCarritoControlador(frame);

		frame.getPanelContenedor().removeAll();
		frame.getPanelContenedor().repaint();

		frame.getContentPane().add((Component) carritoControlador.initPanel());

		// FIXME no tengo ni idea de porque esto
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);

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
