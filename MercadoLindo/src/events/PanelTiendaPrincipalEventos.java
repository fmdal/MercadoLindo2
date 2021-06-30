/**
 * 
 */
package events;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.PanelCarritoControlador;
import controller.PanelLogInControlador;
import dominio.Articulo;
import views.frames.FramePrincipal;
import views.panels.PanelTiendaPrincipal;
import views.panels.Paneles;

/**
 * @author Grososetti
 *
 */
public class PanelTiendaPrincipalEventos extends Eventos {

	private FramePrincipal frame;

	public PanelTiendaPrincipalEventos(Paneles panel, FramePrincipal frame) {
		super(panel);
		this.frame = frame;
	}

	/**
	 *  
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("PanelTiendaPrincipalEventos");
		System.out.println(frame);

		if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnSalir())) {
			int opcion = JOptionPane.showConfirmDialog(this.panel, "¿Seguro que desea salir?", "Salir",
					JOptionPane.YES_NO_OPTION);
			if (opcion == 0) {
				System.exit(0);
			}

		} else if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnVerCarritoDeTienda())) {

			if (frame.getEvento().getDatos().getModelo().getUsuario() == null) {

				PanelLogInControlador control = new PanelLogInControlador(frame);

				frame.getPanelContenedor().removeAll();
				frame.getPanelContenedor().repaint();

				frame.getContentPane().add((Component) control.initPanel());

				// FIXME no tengo ni idea de porque esto
				JPanel panel = new JPanel();
				frame.getContentPane().add(panel);

			} else {
				PanelCarritoControlador carritoControlador = new PanelCarritoControlador(frame);

				frame.getPanelContenedor().removeAll();
				frame.getPanelContenedor().repaint();

				frame.getContentPane().add((Component) carritoControlador.initPanel());

				// FIXME no tengo ni idea de porque esto
				JPanel panel = new JPanel();
				frame.getContentPane().add(panel);
			}
		} else if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnBuscarArticulo())) {
			ArrayList<Articulo> articuno = getVista().getListaArticulos();

			List<Articulo> arts = articuno.stream()
					.filter(a -> (a.getNombre().equalsIgnoreCase(getVista().getTextPane_buscar().getText()))).sorted()
					.collect(Collectors.toList());

			getVista().llenartela((ArrayList<Articulo>) arts);

		} else if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnLogIn())) {
			PanelLogInControlador control = new PanelLogInControlador(frame);

			frame.getPanelContenedor().removeAll();
			frame.getPanelContenedor().repaint();

			frame.getContentPane().add((Component) control.initPanel());

			// FIXME no tengo ni idea de porque esto
			JPanel panel = new JPanel();
			frame.getContentPane().add(panel);
		}

	}

	/**
	 * @return el dato de frame
	 */
	public FramePrincipal getFrame() {
		return frame;
	}

	/**
	 * @param frame para cargar en frame
	 */
	public void setFrame(FramePrincipal frame) {
		this.frame = frame;
	}

	public PanelTiendaPrincipal getVista() {
		return (PanelTiendaPrincipal) panel;
	}

	public void setVista(PanelTiendaPrincipal vista) {
		this.panel = vista;
	}
}
