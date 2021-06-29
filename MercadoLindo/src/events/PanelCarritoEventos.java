package events;

import java.awt.event.ActionEvent;

import javax.swing.JPanel;

import views.panels.PanelCarrito;
import views.panels.Paneles;

public class PanelCarritoEventos extends Eventos {

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
	 * Create the panel.
	 */


}
