package events;

import java.awt.event.ActionEvent;

import views.panels.PanelIngTarjetas;
import views.panels.Paneles;

public class PanelIngTarjetasEventos extends Eventos {

	public PanelIngTarjetasEventos(Paneles panel) {
		super(panel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(((PanelIngTarjetas) this.panel).getBtnIngresarTarjetaOK())) {
			
		} else if (e.getSource().equals(((PanelIngTarjetas) this.panel).getBtnAceptarTarjeta())) {
		
		} else if (e.getSource().equals(((PanelIngTarjetas) this.panel).getComboBoxTipoTarjeta())) {	
			
		} else if (e.getSource().equals(((PanelIngTarjetas) this.panel).getTextPane_nroTarjeta())) {	
			
		} else if (e.getSource().equals(((PanelIngTarjetas) this.panel).getTextPane_marcaTarjeta())) {	
				
		}
		
	}



}
