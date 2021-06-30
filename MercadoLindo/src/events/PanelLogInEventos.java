package events;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.PanelLogInControlador;
import controller.PanelTiendaPrincipalControlador;
import excepcions.logginException;
import views.frames.FramePrincipal;
import views.panels.PanelLogIn;
import views.panels.PanelTiendaPrincipal;
import views.panels.Paneles;

public class PanelLogInEventos extends Eventos {

	private FramePrincipal frame;

	public PanelLogInEventos(Paneles panel) {
		super(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("panelLogin");
		System.out.println(frame);

		if (e.getSource().equals(((PanelLogIn) this.panel).getBtnSalir())) {
			int opcion = JOptionPane.showConfirmDialog(this.panel, "¿Seguro que desea salir?", "Salir",
					JOptionPane.YES_NO_OPTION);
			if (opcion == 0) {
				System.exit(0);
			}

		} else if (e.getSource().equals(((PanelLogIn) this.panel).getBtnLogIn())) {

			try {
				frame.getEvento().getDatos().getModelo()
						.setUsuario(((PanelLogInControlador) control).loggearse(
								frame.getEvento().getDatos().getModelo().getClientes(),
								Long.parseLong(((PanelLogIn) panel).getTextPane_dni().getText()),
								((PanelLogIn) panel).getPasswordField().getText()));

				PanelTiendaPrincipal ventana = new PanelTiendaPrincipal();
				PanelTiendaPrincipalControlador contol = new PanelTiendaPrincipalControlador();
				control.setVista(ventana);

				ventana.getEvento().setFrame(frame);

				((PanelTiendaPrincipal) contol.getVista())
						.setListaArticulos(frame.getEvento().getDatos().getModelo().getArticulos());

				frame.getPanelContenedor().removeAll();
				frame.getPanelContenedor().repaint();

				frame.getContentPane().add((Component) contol.initPanel());

				// FIXME no tengo ni idea de porque esto
				JPanel panel = new JPanel();
				frame.getContentPane().add(panel);

			} catch (NumberFormatException | logginException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}

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
