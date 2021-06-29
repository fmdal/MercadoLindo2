/**
 * 
 */
package events;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import controller.PanelCarritoControlador;
import views.frames.FramePrincipal;
import views.panels.PanelCarrito;
import views.panels.PanelTiendaPrincipal;
import views.panels.Paneles;

/**
 * @author Grososetti
 *
 */
public class PanelTiendaPrincipalEventos extends Eventos {
//implements ActionListener
	private FramePrincipal frame;
//	private PanelTiendaPrincipal vista;
	public PanelTiendaPrincipalEventos(Paneles panel) {
		super(panel);
		System.out.println(panel);
		// TODO Auto-generated constructor stub
		}

	
	public PanelTiendaPrincipal getVista() {
		return (PanelTiendaPrincipal) panel;
	}

	public void setVista(PanelTiendaPrincipal vista) {
		this.panel = vista;
	}

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnVerCarritoDeTienda())) {
			PanelCarrito carrito = new PanelCarrito();
			PanelCarritoControlador carritoControlador = new PanelCarritoControlador(carrito);
			this.panel.removeAll();
			frame.getPanelContenedor().repaint();
			
			this.frame.getContentPane().add((Component) carritoControlador.initPanel());
			
		} else if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnBuscarArticulo())) {
		
		} else if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getTextPane_buscar())) {	
		
		} else if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnSalir())) {
			
			int opcion = JOptionPane.showConfirmDialog(this.panel, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
			if(opcion == 0) {
				System.exit(0);
			}
			
		} else if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnLogIn())) {
		
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
	
	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// compara el evento "e" con el boton de la vista.
//		// Recibe el objeto que recibe la vista
//		// TODO Auto-generated method stub
//		if (e.getSource().equals(this.vista.getBtnAceptar())) { // comprobar e.getsource
//			System.out.println("Aceptado");
//		} else if (e.getSource().equals(this.vista.getBtnCancelar())) { // comprobar e.getsource
//			System.out.println("Cancelado");
//		}
//	}

}
