package controller;

import java.util.ArrayList;

import dominio.Cliente;
import events.Eventos;
import excepcions.logginException;
import views.panels.PanelLogIn;

public class PanelLogInControlador extends ControladorPaneles {

	public PanelLogInControlador() {
		vista = new PanelLogIn();
	}

	/**
	 * @param ventana
	 */
	public PanelLogInControlador(PanelLogIn ventana) {
		vista = ventana;
	}

	@Override
	public Object initPanel() {
		((Eventos) vista.getEvento()).setControl(this);
		System.out.println(2);

		vista.init();
		vista.setVisible(true);

		return this.vista;
	}

	public void logIn() {
	}

	public Cliente loggearse(ArrayList<Cliente> clientes, Long dni, String pass) throws logginException {

		boolean f1 = true;
		boolean f2 = true;

		for (Cliente cli : clientes) {
			if (cli.getDni() == dni) {
				f2 = false;
				if (cli.getContrasenia().equals(pass)) {
					return cli;
				}
			}
		}
		if (f2) {
			throw new logginException("usuario no encontrado.");
		}
		if (f1) {
			throw new logginException("Contraseña incorrecta.");
		}
		return null;
	}
}
