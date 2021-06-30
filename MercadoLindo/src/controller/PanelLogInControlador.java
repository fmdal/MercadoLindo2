package controller;

import java.util.ArrayList;

import dominio.Cliente;
import events.Eventos;
import excepcions.logginException;
import views.frames.FramePrincipal;
import views.panels.PanelLogIn;

public class PanelLogInControlador extends ControladorPaneles {

	public PanelLogInControlador(FramePrincipal frame) {
		vista = new PanelLogIn(frame);
	}

	public Object initPanel() {

		((Eventos) vista.getEvento()).setControl(this);

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
