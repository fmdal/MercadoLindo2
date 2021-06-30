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
	private JPanel panelBotones = new JPanel();
	private JPanel panelCentral = new JPanel();
	
	private JLabel lblTituloIngDomicilios = new JLabel("Ingresar domicilios - Mercado Lindo");
	
	private JLabel lblCalle = new JLabel("Calle");
	private JLabel lblNumero = new JLabel("Numero");
	private JLabel lblCodigoPostal = new JLabel("Codigo postal");
	private JLabel lblLocalidad = new JLabel("Localidad");
	
	private final JButton btnSalir = new JButton("Salir");
	private final JButton btnAceptarDomicilios = new JButton("Aceptar");
	private final JButton btnIngresarDomicilioOK = new JButton("Ingresar domicilio");
	
	private final JTextPane textPane_codigoPostal = new JTextPane();
	private final JTextPane textPane_localidad = new JTextPane();
	private final JTextPane textPane_numero = new JTextPane();
	private final JTextPane textPane_Calle = new JTextPane();
	

	/**
	 * Create the panel.
	 */
	public PanelIngDomicilios() {

		// evento.setVista(this);
		evento = new PanelTiendaPrincipalEventos(this);

		setBorder(new LineBorder(SystemColor.desktop));
		setLayout(null);
		
		lblTituloIngDomicilios.setBounds(10, 0, 198, 29);
		lblTituloIngDomicilios.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setBounds(20, 33, 105, 22);
		lblCodigoPostal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigoPostal.setBounds(20, 65, 105, 22);
		lblLocalidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLocalidad.setBounds(20, 98, 105, 22);
		lblCalle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCalle.setBounds(20, 0, 105, 22);

		panelTituloLogIn.setBounds(0, 0, 450, 40);
		panelTituloLogIn.setLayout(null);
		panelBotones.setBounds(0, 253, 450, 47);
		panelBotones.setLayout(null);
		
		panelCentral.setBounds(0, 40, 450, 214);
		panelCentral.setLayout(null);
		
		btnSalir.addActionListener(evento);
		btnSalir.setBounds(387, 11, 53, 23);
		btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);
		btnAceptarDomicilios.addActionListener(evento);
		btnAceptarDomicilios.setBounds(112, 180, 120, 23);
		btnIngresarDomicilioOK.addActionListener(evento);
		btnIngresarDomicilioOK.setBounds(78, 146, 176, 23);
		
		textPane_Calle.setBounds(135, -1, 119, 22);
		textPane_numero.setBounds(135, 32, 119, 22);
		textPane_codigoPostal.setBounds(135, 65, 119, 22);	
		textPane_localidad.setBounds(135, 98, 119, 22);
		
		panelTituloLogIn.add(lblTituloIngDomicilios);
		panelBotones.add(btnSalir);
		panelCentral.add(btnAceptarDomicilios);
		panelCentral.add(btnIngresarDomicilioOK);
		panelCentral.add(lblCalle);
		panelCentral.add(lblNumero);
		panelCentral.add(lblCodigoPostal);
		panelCentral.add(lblLocalidad);
		panelCentral.add(textPane_Calle);
		panelCentral.add(textPane_numero);
		panelCentral.add(textPane_codigoPostal);
		panelCentral.add(textPane_localidad);
		
		add(panelTituloLogIn);
		add(panelBotones);
		add(panelCentral);
		
//		System.out.println("esto");
		this.setVisible(true);
	}

//	Getters & Setters
	
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
	 * @return el dato de lblCalle
	 */
	public JLabel getLblCalle() {
		return lblCalle;
	}

	/**
	 * @param lblCalle para cargar en lblCalle
	 */
	public void setLblCalle(JLabel lblCalle) {
		this.lblCalle = lblCalle;
	}

	/**
	 * @return el dato de textPane_numero
	 */
	public JTextPane getTextPane_numero() {
		return textPane_numero;
	}

	/**
	 * @return el dato de textPane_Calle
	 */
	public JTextPane getTextPane_Calle() {
		return textPane_Calle;
	}

	/**
	 * @param lblNumero para cargar en lblNumero
	 */
	public void setLblNumero(JLabel lblNumero) {
		this.lblNumero = lblNumero;
	}

	/**
	 * @param lblCodigoPostal para cargar en lblCodigoPostal
	 */
	public void setLblCodigoPostal(JLabel lblCodigoPostal) {
		this.lblCodigoPostal = lblCodigoPostal;
	}

	/**
	 * @param lblLocalidad para cargar en lblLocalidad
	 */
	public void setLblLocalidad(JLabel lblLocalidad) {
		this.lblLocalidad = lblLocalidad;
	}
}
