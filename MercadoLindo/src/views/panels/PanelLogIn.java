package views.panels;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import events.PanelLogInEventos;

public class PanelLogIn extends Paneles {

	/**
	 * @var long - serialVersionUID
	 */
	private static final long serialVersionUID = 4776532445734707636L;

	private JPanel panelTituloLogIn = new JPanel();
	private JPanel panelBotones = new JPanel();
	private JPanel panelCentral = new JPanel();
	private JButton btnSalir = new JButton("Salir");
	private JButton btnLogIn = new JButton("Iniciar Sesion");
	private JPasswordField passwordField = new JPasswordField();
	private JTextPane textPane_dni = new JTextPane();
	private JLabel lblTituloLogIn = new JLabel("Iniciar Sesion - Mercado Lindo");
	private JLabel lblContrasena = new JLabel("Contrase\u00F1a");
	private JLabel lblUsuarioLogIn = new JLabel("DNI");

	/**
	 * Create the panel.
	 */
	public PanelLogIn() {
		System.out.println(3);
		evento = new PanelLogInEventos(this);

		setBorder(new LineBorder(SystemColor.desktop));
		setLayout(null);

	}

	@Override
	public void init() {

		lblTituloLogIn.setBounds(10, 0, 171, 29);
		lblTituloLogIn.setFont(new Font("Arial", Font.PLAIN, 12));

		panelTituloLogIn.add(lblTituloLogIn);
		panelTituloLogIn.setBounds(0, 0, 450, 40);
		panelTituloLogIn.setLayout(null);

		btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSalir.setBounds(387, 11, 53, 23);
		btnSalir.addActionListener(evento);

		panelBotones.add(btnSalir);
		panelBotones.setBounds(0, 253, 450, 47);
		panelBotones.setLayout(null);

		passwordField.setBounds(220, 99, 120, 22);

		panelCentral.setBounds(0, 40, 450, 214);
		panelCentral.setLayout(null);
		panelCentral.add(passwordField);

		textPane_dni.setBounds(220, 66, 119, 22);

		lblUsuarioLogIn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuarioLogIn.setBounds(167, 66, 46, 22);

		btnLogIn.setBounds(230, 132, 95, 23);
		btnLogIn.addActionListener(evento);

		lblContrasena.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasena.setBounds(157, 99, 56, 22);

		panelCentral.add(textPane_dni);
		panelCentral.add(lblUsuarioLogIn);
		panelCentral.add(lblContrasena);
		panelCentral.add(btnLogIn);

		add(panelTituloLogIn);
		add(panelCentral);
		add(panelBotones);

		this.setVisible(true);
	}

	/**
	 * @return the evento
	 */
	@Override
	public PanelLogInEventos getEvento() {
		return (PanelLogInEventos) evento;
	}

	/**
	 * @param evento the evento to set
	 */
	public void setEvento(PanelLogInEventos evento) {
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
