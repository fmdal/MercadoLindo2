package events;

import java.awt.event.ActionEvent;

import views.panels.PanelLogIn;
import views.panels.Paneles;

public class PanelLogInEventos extends Eventos {

	public PanelLogInEventos(Paneles panel) {
		super(panel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(((PanelLogIn) this.panel).getBtnLogIn())) {
			
		} else if (e.getSource().equals(((PanelLogIn) this.panel).getBtnSalir())) {
				
		} else if (e.getSource().equals(((PanelLogIn) this.panel).getPasswordField())) {
			
		} else if (e.getSource().equals(((PanelLogIn) this.panel).getTextPane_dni())) {
		
		}
		
	}



}
