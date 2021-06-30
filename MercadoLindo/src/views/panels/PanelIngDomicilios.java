package views.panels;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import events.PanelTiendaPrincipalEventos;

public class PanelIngDomicilios extends Paneles {

	private JPanel panelTituloLogIn = new JPanel();
	private JLabel lblTituloIngDomicilios = new JLabel("Ingresar domicilios - Mercado Lindo");
	private JPanel panelBotones = new JPanel();
	private JPanel panelCentral = new JPanel();
	private final JButton btnSalir = new JButton("Salir");
	private final JButton btnAceptarDomicilios = new JButton("Aceptar");
	private final JButton btnIngresarDomicilioOK = new JButton("Ingresar domicilio");
	private final JLabel lblNumero = new JLabel("Numero");
	private final JLabel lblCodigoPostal = new JLabel("Codigo postal");
	private final JTextPane textPane_codigoPostal = new JTextPane();
	private final JTextPane textPane_localidad = new JTextPane();
	private final JTextPane textPane_numero = new JTextPane();
	private final JTextPane textPane_calle = new JTextPane();
	private final JLabel lblLocalidad = new JLabel("Localidad");

	/**
	 * Create the panel.
	 */
	public PanelIngDomicilios() {

		// evento.setVista(this);
		evento = new PanelTiendaPrincipalEventos(this);

		setBorder(new LineBorder(SystemColor.desktop));
		setLayout(null);

		panelTituloLogIn.setBounds(0, 0, 450, 40);
		add(panelTituloLogIn);
		panelTituloLogIn.setLayout(null);
		lblTituloIngDomicilios.setBounds(10, 0, 198, 29);

		lblTituloIngDomicilios.setFont(new Font("Arial", Font.PLAIN, 12));
		panelTituloLogIn.add(lblTituloIngDomicilios);

		panelBotones.setBounds(0, 253, 450, 47);
		add(panelBotones);
		panelBotones.setLayout(null);
		btnSalir.setBounds(387, 11, 53, 23);
		panelBotones.add(btnSalir);
		btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);

		panelCentral.setBounds(0, 40, 450, 214);
		add(panelCentral);
		panelCentral.setLayout(null);

		JTextPane textPane_Calle = new JTextPane();
		textPane_Calle.setBounds(135, -1, 119, 22);
		panelCentral.add(textPane_Calle);

		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCalle.setBounds(20, 0, 105, 22);
		panelCentral.add(lblCalle);
		btnAceptarDomicilios.addActionListener(evento);
		btnAceptarDomicilios.setBounds(112, 180, 120, 23);
		panelCentral.add(btnAceptarDomicilios);
		btnIngresarDomicilioOK.addActionListener(evento);
		btnIngresarDomicilioOK.setBounds(78, 146, 176, 23);

		panelCentral.add(btnIngresarDomicilioOK);
		textPane_numero.setBounds(135, 32, 119, 22);

		panelCentral.add(textPane_numero);
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setBounds(20, 33, 105, 22);

		panelCentral.add(lblNumero);
		lblCodigoPostal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigoPostal.setBounds(20, 65, 105, 22);

		panelCentral.add(lblCodigoPostal);
		textPane_codigoPostal.setBounds(135, 65, 119, 22);

		panelCentral.add(textPane_codigoPostal);
		textPane_localidad.setBounds(135, 98, 119, 22);

		panelCentral.add(textPane_localidad);
		lblLocalidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLocalidad.setBounds(20, 98, 105, 22);

		panelCentral.add(lblLocalidad);
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
		return lblTituloIngDomicilios;
	}

	/**
	 * @param lblTitulo the lblTitulo to set
	 */
	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTituloIngDomicilios = lblTitulo;
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
	 * @return el dato de lblTituloIngDomicilios
	 */
	public JLabel getLblTituloIngDomicilios() {
		return lblTituloIngDomicilios;
	}

	/**
	 * @param lblTituloIngDomicilios para cargar en lblTituloIngDomicilios
	 */
	public void setLblTituloIngDomicilios(JLabel lblTituloIngDomicilios) {
		this.lblTituloIngDomicilios = lblTituloIngDomicilios;
	}

	/**
	 * @return el dato de btnSalir
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}

	/**
	 * @return el dato de btnAceptarDomicilios
	 */
	public JButton getBtnAceptarDomicilios() {
		return btnAceptarDomicilios;
	}

	/**
	 * @return el dato de btnIngresarDomicilioOK
	 */
	public JButton getBtnIngresarDomicilioOK() {
		return btnIngresarDomicilioOK;
	}

	/**
	 * @return el dato de textPane_Numero
	 */
	public JTextPane getTextPane_Numero() {
		return textPane_numero;
	}

	/**
	 * @return el dato de lblNumero
	 */
	public JLabel getLblNumero() {
		return lblNumero;
	}

	/**
	 * @return el dato de lblCodigoPostal
	 */
	public JLabel getLblCodigoPostal() {
		return lblCodigoPostal;
	}

	/**
	 * @return el dato de textPane_codigoPostal
	 */
	public JTextPane getTextPane_codigoPostal() {
		return textPane_codigoPostal;
	}

	/**
	 * @return el dato de textPane_localidad
	 */
	public JTextPane getTextPane_localidad() {
		return textPane_localidad;
	}

	/**
	 * @return el dato de lblLocalidad
	 */
	public JLabel getLblLocalidad() {
		return lblLocalidad;
	}

	/**
	 * @return el dato de textPane_Calle
	 */
	public JTextPane getTextPane_Calle() {
		return textPane_calle;
	}
}
