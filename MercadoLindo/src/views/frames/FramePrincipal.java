/**
 *
 *
 * @author Usalmove
 * @since 19 jun. 2021
 * Base
 * FramePrincipal.java
 *
 * @version 0.0 Creacion del archivo.
 */
package views.frames;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import events.PanelTiendaPrincipalEventos;
import events.PrincipalEventos;
import views.panels.PanelTiendaPrincipal;
import views.panels.TestPanel;
import javax.swing.SwingConstants;

/**
 * Clase contenedora del frame general del sistema. Todas las ventanas van a ser
 * cargadas como paneles de este frame.
 *
 * @since 19 jun. 2021
 * @version 0.0 Creacion del archivo.
 *
 *
 */
public class FramePrincipal extends JFrame {
	/**
	 * Numero de version de la clase
	 * @var long serialVersionUID
	 */
	private static final long serialVersionUID = 2964753219416236098L;
	/**
	 * JPanel que se va a cargar
	 *
	 * @var JPanel contentPane
	 */
	private JButton btnAceptar;
	
//	private JPanel contentPane;
	
	private String titulo;
	private PrincipalEventos evento;
//	private PanelTiendaPrincipal panelTienda;
	private JPanel panelContenedor = new JPanel(); //*****!
	private PanelTiendaPrincipal var;

	/**
	 * Constructor de la clase. Create the frame.
	 */
	public FramePrincipal() {

		var = new PanelTiendaPrincipal();
		var.getBtnBuscarArticulo().setHorizontalAlignment(SwingConstants.CENTER);
		var.getBtnBuscarArticulo().setBounds(382, 17, 87, 18);
		var.getBtnSalir().setHorizontalAlignment(SwingConstants.CENTER);
		var.getBtnSalir().setBounds(352, 11, 88, 23);
		var.getBtnLogIn().setBounds(130, 11, 174, 23);
		var.getTable().setBounds(54, 11, 476, 210);
		var.getPanelCentral().setBounds(0, 40, 450, 214);
		var.getPanelBotones().setBounds(0, 253, 479, 47);
		var.getPanelTituloTienda().setBounds(0, 0, 450, 40);
		var.getPanelTitulo().setBounds(0, 0, 479, 40);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 354);
		var.setBorder(new EmptyBorder(5, 5, 5, 5));
		var.setLayout(null);
		var.getEvento();	//que mierda iba aca	"var.getE.."?
		this.evento = new PrincipalEventos(this);
		this.init();
	}

	/**
	 * Esta funcion inicializa todos los elementos del frame y lo muestra.
	 */
	private void init() {
		evento.setVista(this);
        
		setContentPane(var);
		setVisible(true);
	}

	
	
	
	
	
	
	
	
	/**
	 * @return el dato de titulo
	 */
	public String getTitulo() {
		return titulo;
	}

//	/**
//	 * @return el dato de contentPane
//	 */
//	@Override
//	public JPanel getContentPane() {
//		return contentPane;
//	}

	/**
	 * @return el dato de evento
	 */
	public PrincipalEventos getEvento() {
		return evento;
	}

	/**
	 * @return el dato de serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return el dato de btnAceptar
	 */
	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	/**
	 * @return el dato de panelContenedor
	 */
	public JPanel getPanelContenedor() {
		return panelContenedor;
	}

	/**
	 * @return el dato de var
	 */
	public PanelTiendaPrincipal getVar() {
		return var;
	}
	
}
