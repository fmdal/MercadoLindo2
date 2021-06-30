package events;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.PanelCarritoControlador;
import controller.PanelDomiciliosControlador;
import controller.PanelTarjetasControlador;
import controller.PanelTiendaPrincipalControlador;
import views.frames.FramePrincipal;
import views.panels.PanelCarrito;
import views.panels.PanelTiendaPrincipal;
import views.panels.Paneles;

public class PanelCarritoEventos extends Eventos {

	private FramePrincipal frame;

	public PanelCarritoEventos(Paneles panel, FramePrincipal frame) {
		super(panel);
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(((PanelCarrito) this.panel).getBtnSalirMiCarrito())) {
			int opcion = JOptionPane.showConfirmDialog(this.panel, "¿Seguro que desea salir?", "Salir",
					JOptionPane.YES_NO_OPTION);
			if (opcion == 0) {
				System.exit(0);
			}

		} else if (e.getSource().equals(((PanelCarrito) this.panel).getBtnComprarCarrito())) {
			((PanelCarritoControlador) control).comprarCarrito();
		} else if (e.getSource().equals(((PanelCarrito) this.panel).getBtnCambiarDomicilio())) {

			PanelDomiciliosControlador contol = new PanelDomiciliosControlador(frame);

			frame.getPanelContenedor().removeAll();
			frame.getPanelContenedor().repaint();

			frame.getContentPane().add((Component) contol.initPanel());

			// FIXME no tengo ni idea de porque esto
			JPanel panel = new JPanel();
			frame.getContentPane().add(panel);
		} else if (e.getSource().equals(((PanelCarrito) this.panel).getBtnVolverAlaTienda())) {

			PanelTiendaPrincipalControlador contol = new PanelTiendaPrincipalControlador(frame);

			((PanelTiendaPrincipal) contol.getVista())
					.setListaArticulos(frame.getEvento().getDatos().getModelo().getArticulos());

			frame.getPanelContenedor().removeAll();
			frame.getPanelContenedor().repaint();

			frame.getContentPane().add((Component) contol.initPanel());

			// FIXME no tengo ni idea de porque esto
			JPanel panel = new JPanel();
			frame.getContentPane().add(panel);

		} else if (e.getSource().equals(((PanelCarrito) this.panel).getBtnCambiarTarjeta())) {

			PanelTarjetasControlador contol = new PanelTarjetasControlador(frame);

			frame.getPanelContenedor().removeAll();
			frame.getPanelContenedor().repaint();

			frame.getContentPane().add((Component) contol.initPanel());

			// FIXME no tengo ni idea de porque esto
			JPanel panel = new JPanel();
			frame.getContentPane().add(panel);

		} else if (e.getSource().equals(((PanelCarrito) this.panel).getBtnVaciarCarrito())) {
			((PanelCarritoControlador) control).vaciarCarrito();
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
