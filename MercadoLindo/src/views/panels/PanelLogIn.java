package views.panels;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import events.PanelTiendaPrincipalEventos;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.List;
import java.awt.Scrollbar;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;

public class PanelLogIn extends Paneles {

//	private PanelTiendaPrincipalEventos evento = new PanelTiendaPrincipalEventos(this);
	
	private JPanel panelTituloLogIn = new JPanel();
	private JLabel lblTituloLogIn = new JLabel("Iniciar Sesion - Mercado Lindo");
	private JPanel panelBotones = new JPanel();
	private JPanel panelCentral = new JPanel();
	private final JButton btnSalir = new JButton("Salir");
	private final JButton btnLogIn = new JButton("Iniciar Sesion");
	private JPasswordField passwordField;
	private final JTextPane textPane_dni = new JTextPane();
	
	/**
	 * Create the panel.
	 */
	public PanelLogIn() {
		
//		evento.setVista(this);
		evento = new PanelTiendaPrincipalEventos(this);
		
		setBorder(new LineBorder(SystemColor.desktop));
		setLayout(null);
		
		panelTituloLogIn.setBounds(0, 0, 450, 40);
		add(panelTituloLogIn);
		panelTituloLogIn.setLayout(null);
		lblTituloLogIn.setBounds(10, 0, 171, 29);
		
		lblTituloLogIn.setFont(new Font("Arial", Font.PLAIN, 12));
		panelTituloLogIn.add(lblTituloLogIn);
		
	
		panelBotones.setBounds(0, 253, 450, 47);
		add(panelBotones);
		panelBotones.setLayout(null);
		btnSalir.setBounds(387, 11, 53, 23);
		panelBotones.add(btnSalir);
		btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);
		

		panelCentral.setBounds(0, 40, 450, 214);
		add(panelCentral);
		panelCentral.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(220, 99, 120, 22);
		panelCentral.add(passwordField);
		
		JTextPane textPane_dni = new JTextPane();
		textPane_dni.setBounds(220, 66, 119, 22);
		panelCentral.add(textPane_dni);
		
		JLabel lblUsuarioLogIn = new JLabel("DNI");
		lblUsuarioLogIn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuarioLogIn.setBounds(167, 66, 46, 22);
		panelCentral.add(lblUsuarioLogIn);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasena.setBounds(157, 99, 56, 22);
		panelCentral.add(lblContrasena);
		btnLogIn.setBounds(230, 132, 95, 23);
		panelCentral.add(btnLogIn);
		System.out.println("esto");
		this.setVisible(true);
	}

	/**
	 * @return the evento
	 */
	public PanelTiendaPrincipalEventos getEvento() {
		return (PanelTiendaPrincipalEventos) evento;
	}

	/**
	 * @param evento the evento to set
	 */
	public void setEvento(PanelTiendaPrincipalEventos evento) {
		this.evento = evento;
	}

	/**
	 * @return the panelTitulo
	 */
	public JPanel getPanelTitulo() {
		return panelTituloLogIn;
	}

	/**
	 * @param panelTitulo the panelTitulo to set
	 */
	public void setPanelTitulo(JPanel panelTitulo) {
		this.panelTituloLogIn = panelTitulo;
	}

	/**
	 * @return the lblTitulo
	 */
	public JLabel getLblTitulo() {
		return lblTituloLogIn;
	}

	/**
	 * @param lblTitulo the lblTitulo to set
	 */
	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTituloLogIn = lblTitulo;
	}

	/**
	 * @return the panelBotones
	 */
	public JPanel getPanelBotones() {
		return panelBotones;
	}

	/**
	 * @param panelBotones the panelBotones to set
	 */
	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotones = panelBotones;
	}

	/**
	 * @return the panelCentral
	 */
	public JPanel getPanelCentral() {
		return panelCentral;
	}

	/**
	 * @param panelCentral the panelCentral to set
	 */
	public void setPanelCentral(JPanel panelCentral) {
		this.panelCentral = panelCentral;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return el dato de panelTituloLogIn
	 */
	public JPanel getPanelTituloLogIn() {
		return panelTituloLogIn;
	}

	/**
	 * @param panelTituloLogIn para cargar en panelTituloLogIn
	 */
	public void setPanelTituloLogIn(JPanel panelTituloLogIn) {
		this.panelTituloLogIn = panelTituloLogIn;
	}

	/**
	 * @return el dato de lblTituloLogIn
	 */
	public JLabel getLblTituloLogIn() {
		return lblTituloLogIn;
	}

	/**
	 * @param lblTituloLogIn para cargar en lblTituloLogIn
	 */
	public void setLblTituloLogIn(JLabel lblTituloLogIn) {
		this.lblTituloLogIn = lblTituloLogIn;
	}

	/**
	 * @return el dato de passwordField
	 */
	public JPasswordField getPasswordField() {
		return passwordField;
	}

	/**
	 * @param passwordField para cargar en passwordField
	 */
	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	/**
	 * @return el dato de btnSalir
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}

	/**
	 * @return el dato de btnLogIn
	 */
	public JButton getBtnLogIn() {
		return btnLogIn;
	}

	/**
	 * @return el dato de textPane_dni
	 */
	public JTextPane getTextPane_dni() {
		return textPane_dni;
	}
}
