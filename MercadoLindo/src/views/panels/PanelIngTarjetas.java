package views.panels;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import events.PanelIngTarjetasEventos;
import views.frames.FramePrincipal;

public class PanelIngTarjetas extends Paneles {

//	private PanelTiendaPrincipalEventos evento = new PanelTiendaPrincipalEventos(this);

	private final JLabel lblMarcaTarjeta = new JLabel("Marca de tarjeta");
	private final JLabel lblTipoTarjeta = new JLabel("Tipo de tarjeta");
	private JLabel lblTituloRegistrarse = new JLabel("Ingresar tarjetas - Mercado Lindo");
	private JLabel lblNumeroTarjeta = new JLabel("Numero de tarjeta");

	private JPanel panelIngTarjeta = new JPanel();
	private JPanel panelBotones = new JPanel();
	private JPanel panelCentral = new JPanel();

	private JComboBox comboBoxTipoTarjeta = new JComboBox();

	private final JButton btnSalirTarjeta = new JButton("Salir");
	private final JButton btnAceptarTarjeta = new JButton("Aceptar");
	private final JButton btnIngresarTarjetaOK = new JButton("Ingresar tarjeta");
	private final JTextPane textPane_marcaTarjeta = new JTextPane();
	private final JTextPane textPane_nroTarjeta = new JTextPane();

	/**
	 * Create the panel.
	 */
	public PanelIngTarjetas(FramePrincipal frame) {

		evento = new PanelIngTarjetasEventos(this, frame);

		setBorder(new LineBorder(SystemColor.desktop));
		setLayout(null);

		lblTituloRegistrarse.setBounds(10, 0, 198, 29);
		lblTituloRegistrarse.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNumeroTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroTarjeta.setBounds(20, 0, 105, 22);
		lblMarcaTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarcaTarjeta.setBounds(20, 33, 105, 22);
		lblTipoTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoTarjeta.setBounds(20, 65, 105, 22);

		panelIngTarjeta.setBounds(0, 0, 450, 40);
		panelIngTarjeta.setLayout(null);
		panelIngTarjeta.add(lblTituloRegistrarse);
		panelBotones.setBounds(0, 253, 450, 47);
		panelBotones.setLayout(null);
		panelCentral.setBounds(0, 40, 450, 214);
		panelCentral.setLayout(null);

		textPane_nroTarjeta.setBounds(135, -1, 119, 22);
		textPane_marcaTarjeta.setBounds(135, 32, 119, 22);

		panelBotones.add(btnSalirTarjeta);
		panelCentral.add(textPane_nroTarjeta);
		panelCentral.add(lblNumeroTarjeta);
		panelCentral.add(btnAceptarTarjeta);
		panelCentral.add(btnIngresarTarjetaOK);
		panelCentral.add(textPane_marcaTarjeta);
		panelCentral.add(lblMarcaTarjeta);
		panelCentral.add(lblTipoTarjeta);
		panelCentral.add(comboBoxTipoTarjeta);

		comboBoxTipoTarjeta.setBounds(135, 65, 119, 22);

		comboBoxTipoTarjeta.addItem("Credito");
		comboBoxTipoTarjeta.addItem("Debito");
		comboBoxTipoTarjeta.addItem("Prepaga");

		btnSalirTarjeta.setBounds(387, 11, 53, 23);
		btnSalirTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSalirTarjeta.addActionListener(evento);
		btnAceptarTarjeta.setBounds(62, 132, 120, 23);
		btnAceptarTarjeta.addActionListener(evento);
		btnIngresarTarjetaOK.addActionListener(evento);
		btnIngresarTarjetaOK.setBounds(40, 98, 176, 23);

		add(panelIngTarjeta);
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
	public PanelIngTarjetasEventos getEvento() {
		return (PanelIngTarjetasEventos) evento;
	}

	/**
	 * @param evento the evento to set
	 */
	public void setEvento(PanelIngTarjetasEventos evento) {
		this.evento = evento;
	}

	/**
	 * @return the panelTitulo
	 */
	public JPanel getPanelTitulo() {
		return panelIngTarjeta;
	}

	/**
	 * @param panelTitulo the panelTitulo to set
	 */
	public void setPanelTitulo(JPanel panelTitulo) {
		this.panelIngTarjeta = panelTitulo;
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
	 * @return the btnAceptar
	 */

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
	 * @return el dato de panelIngTarjeta
	 */
	public JPanel getPanelIngTarjeta() {
		return panelIngTarjeta;
	}

	/**
	 * @param panelIngTarjeta para cargar en panelIngTarjeta
	 */
	public void setPanelIngTarjeta(JPanel panelIngTarjeta) {
		this.panelIngTarjeta = panelIngTarjeta;
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
	 * @return el dato de btnSalirTarjeta
	 */
	public JButton getBtnSalirTarjeta() {
		return btnSalirTarjeta;
	}

	/**
	 * @return el dato de btnAceptarTarjeta
	 */
	public JButton getBtnAceptarTarjeta() {
		return btnAceptarTarjeta;
	}

	/**
	 * @return el dato de btnIngresarTarjetaOK
	 */
	public JButton getBtnIngresarTarjetaOK() {
		return btnIngresarTarjetaOK;
	}

	/**
	 * @return el dato de textPane_marcaTarjeta
	 */
	public JTextPane getTextPane_marcaTarjeta() {
		return textPane_marcaTarjeta;
	}

	/**
	 * @return el dato de lblMarcaTarjeta
	 */
	public JLabel getLblMarcaTarjeta() {
		return lblMarcaTarjeta;
	}

	/**
	 * @return el dato de lblTipoTarjeta
	 */
	public JLabel getLblTipoTarjeta() {
		return lblTipoTarjeta;
	}

	/**
	 * @return el dato de comboBoxTipoTarjeta
	 */
	public JComboBox getComboBoxTipoTarjeta() {
		return comboBoxTipoTarjeta;
	}

	/**
	 * @param comboBoxTipoTarjeta para cargar en comboBoxTipoTarjeta
	 */
	public void setComboBoxTipoTarjeta(JComboBox comboBoxTipoTarjeta) {
		this.comboBoxTipoTarjeta = comboBoxTipoTarjeta;
	}

	/**
	 * @return el dato de textPane_nroTarjeta
	 */
	public JTextPane getTextPane_nroTarjeta() {
		return textPane_nroTarjeta;
	}
}
