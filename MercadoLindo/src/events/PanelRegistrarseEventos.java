package events;

import java.awt.event.ActionEvent;

import views.panels.PanelRegistrarse;
import views.panels.Paneles;

public class PanelRegistrarseEventos extends Eventos{

	public PanelRegistrarseEventos(Paneles panel) {
		super(panel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(((PanelRegistrarse) this.panel).getBtnSalir())) {
			
		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getBtnCrearCuenta())) {
		
		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getBtnIngDomicilios())) {	
		
		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getBtnIngresarTarjetas())) {
			
		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getTextPane_dni())) {
			
		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getPasswordField())) {
			
		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getTextPane_nombre())) {
			
		} else if (e.getSource().equals(((PanelRegistrarse) this.panel).getTextPane_apellido())) {
		
		}
		
	}



}
