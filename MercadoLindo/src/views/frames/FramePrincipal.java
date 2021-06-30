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

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import controller.PanelTiendaPrincipalControlador;
import events.PrincipalEventos;
import views.panels.PanelTiendaPrincipal;

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
	 * 
	 * @var long serialVersionUID
	 */
	private static final long serialVersionUID = 2964753219416236098L;

	private JButton btnAceptar;
	private String titulo;
	private PrincipalEventos evento;
	private JPanel panelContenedor = new JPanel();

	/**
	 * Constructor de la clase. Create the frame.
	 */
	public FramePrincipal() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);

		panelContenedor.setBorder(new LineBorder(SystemColor.desktop));
		panelContenedor.setBackground(new Color(135, 206, 235));
		panelContenedor.setLayout(new CardLayout(0, 0));

		this.evento = new PrincipalEventos(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {

				PanelTiendaPrincipalControlador pTPC = new PanelTiendaPrincipalControlador((FramePrincipal) getThis());

				((PanelTiendaPrincipal) pTPC.getVista())
						.setListaArticulos(evento.getDatos().getModelo().getArticulos());

				getContentPane().add((Component) pTPC.initPanel());

//				((PanelTiendaPrincipalEventos) pTPC.getVista().getEvento()).setFrame((FramePrincipal) getThis());

				// FIXME no tengo ni idea de porque esto
				JPanel panel = new JPanel();
				panelContenedor.add(panel);
			}
		});
	}

	/**
	 * Esta funcion inicializa todos los elementos del frame y lo muestra.
	 */
	public void init() {
		evento.setVista(this);

		setContentPane(panelContenedor);
		setVisible(true);
	}

	/**
	 * @return el dato de titulo
	 */
	public String getTitulo() {
		return titulo;
	}

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
	public JPanel getVar() {
		return panelContenedor;
	}

	public JFrame getThis() {
		return this;

	}
}
