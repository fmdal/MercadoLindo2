package events;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.PanelCarritoControlador;
import controller.PanelDomiciliosControlador;
import views.frames.FramePrincipal;
import views.panels.PanelIngDomicilios;
import views.panels.Paneles;

public class PanelDomiciliosEventos extends Eventos {

	private FramePrincipal frame;

	public PanelDomiciliosEventos(Paneles panel, FramePrincipal frame) {
		super(panel);
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(((PanelIngDomicilios) this.panel).getBtnSalir())) {
			int opcion = JOptionPane.showConfirmDialog(this.panel, "¿Seguro que desea salir?", "Salir",
					JOptionPane.YES_NO_OPTION);
			if (opcion == 0) {
				System.exit(0);
			}
		} else if (e.getSource().equals(((PanelIngDomicilios) this.panel).getBtnIngresarDomicilioOK())) {
			((PanelDomiciliosControlador) control).ingresarDomicilioOK();
		} else if (e.getSource().equals(((PanelIngDomicilios) this.panel).getBtnAceptarDomicilios())) {
			((PanelDomiciliosControlador) control).aceptarDomicilios();
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
