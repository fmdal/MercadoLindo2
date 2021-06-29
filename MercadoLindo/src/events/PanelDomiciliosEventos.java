package events;

import java.awt.event.ActionEvent;

import views.panels.PanelIngDomicilios;
import views.panels.Paneles;

public class PanelDomiciliosEventos extends Eventos{

	public PanelDomiciliosEventos(Paneles panel) {
		super(panel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(((PanelIngDomicilios) this.panel).getBtnIngresarDomicilioOK())) {
			
		} else if (e.getSource().equals(((PanelIngDomicilios) this.panel).getBtnAceptarDomicilios())) {
		
		} else if (e.getSource().equals(((PanelIngDomicilios) this.panel).getBtnSalir())) {	
		
		} else if (e.getSource().equals(((PanelIngDomicilios) this.panel).getTextPane_Numero())) {	
		
		} else if (e.getSource().equals(((PanelIngDomicilios) this.panel).getTextPane_Calle())) {	
			
		} else if (e.getSource().equals(((PanelIngDomicilios) this.panel).getTextPane_localidad())) {	
			
		} else if (e.getSource().equals(((PanelIngDomicilios) this.panel).getTextPane_codigoPostal())) {	
		
		}
		
	}



}
