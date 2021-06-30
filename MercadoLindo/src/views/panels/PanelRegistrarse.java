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

import events.PanelTiendaPrincipalEventos;

public class PanelRegistrarse extends Paneles {

//	private PanelTiendaPrincipalEventos evento = new PanelTiendaPrincipalEventos(this);

	private JPanel panelTituloLogIn = new JPanel();
	private JPanel panelBotones = new JPanel();
	private JPanel panelCentral = new JPanel();

	private JLabel lblTituloRegistrarse = new JLabel("Registrarse - Mercado Lindo");
	private final JLabel lblNombre = new JLabel("Nombre");
	private final JLabel lblApellido = new JLabel("Apellido");

	private final JButton btnSalir = new JButton("Salir");
	private final JButton btnCrearCuenta = new JButton("Crear Cuenta");

	private JPasswordField passwordField;
	private final JTextPane textPane_nombre = new JTextPane();
	private final JTextPane textPane_apellido = new JTextPane();
	private final JTextPane textPane_dni = new JTextPane();

	private final JButton btnIngDomicilios = new JButton("Ingresar Domicilios");
	private final JButton btnIngresarTarjetas = new JButton("Ingresar tarjetas");

	/**
	 * Create the panel.
	 */
	public PanelRegistrarse() {

//		evento.setVista(this);
		evento = new PanelTiendaPrincipalEventos(this);

		setBorder(new LineBorder(SystemColor.desktop));
		setLayout(null);

		panelTituloLogIn.setBounds(0, 0, 450, 40);
		add(panelTituloLogIn);
		panelTituloLogIn.setLayout(null);
		lblTituloRegistrarse.setBounds(10, 0, 188, 29);

		lblTituloRegistrarse.setFont(new Font("Arial", Font.PLAIN, 12));
		panelTituloLogIn.add(lblTituloRegistrarse);

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
		passwordField.setBounds(76, 32, 120, 22);
		panelCentral.add(passwordField);

		JTextPane textPane_dni = new JTextPane();
		textPane_dni.setBounds(76, 0, 119, 22);
		panelCentral.add(textPane_dni);

		JLabel lblDniLogIn = new JLabel("DNI");
		lblDniLogIn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDniLogIn.setBounds(20, 0, 46, 22);
		panelCentral.add(lblDniLogIn);

		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasena.setBounds(10, 32, 56, 22);
		panelCentral.add(lblContrasena);
		btnCrearCuenta.setBounds(49, 191, 120, 23);
		panelCentral.add(btnCrearCuenta);
		textPane_nombre.setBounds(76, 65, 119, 22);

		panelCentral.add(textPane_nombre);
		textPane_apellido.setBounds(76, 98, 119, 22);

		panelCentral.add(textPane_apellido);
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 65, 56, 22);

		panelCentral.add(lblNombre);
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setBounds(10, 98, 56, 22);

		panelCentral.add(lblApellido);
		btnIngDomicilios.setBounds(20, 159, 176, 23);

		panelCentral.add(btnIngDomicilios);
		btnIngresarTarjetas.setBounds(20, 130, 176, 23);

		panelCentral.add(btnIngresarTarjetas);
//		System.out.println("esto");
		this.setVisible(true);
	}

	/**
	 * @return the evento
	 */
	@Override
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
		return lblTituloRegistrarse;
	}

	/**
	 * @param lblTitulo the lblTitulo to set
	 */
	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTituloRegistrarse = lblTitulo;
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
	 * @return el dato de lblTituloRegistrarse
	 */
	public JLabel getLblTituloRegistrarse() {
		return lblTituloRegistrarse;
	}

	/**
	 * @param lblTituloRegistrarse para cargar en lblTituloRegistrarse
	 */
	public void setLblTituloRegistrarse(JLabel lblTituloRegistrarse) {
		this.lblTituloRegistrarse = lblTituloRegistrarse;
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
	 * @return el dato de btnCrearCuenta
	 */
	public JButton getBtnCrearCuenta() {
		return btnCrearCuenta;
	}

	/**
	 * @return el dato de textPane_nombre
	 */
	public JTextPane getTextPane_nombre() {
		return textPane_nombre;
	}

	/**
	 * @return el dato de textPane_apellido
	 */
	public JTextPane getTextPane_apellido() {
		return textPane_apellido;
	}

	/**
	 * @return el dato de lblNombre
	 */
	public JLabel getLblNombre() {
		return lblNombre;
	}

	/**
	 * @return el dato de lblApellido
	 */
	public JLabel getLblApellido() {
		return lblApellido;
	}

	/**
	 * @return el dato de btnIngDomicilios
	 */
	public JButton getBtnIngDomicilios() {
		return btnIngDomicilios;
	}

	/**
	 * @return el dato de btnIngresarTarjetas
	 */
	public JButton getBtnIngresarTarjetas() {
		return btnIngresarTarjetas;
	}

	/**
	 * @return el dato de textPane_dni
	 */
	public JTextPane getTextPane_dni() {
		return textPane_dni;
	}
}
