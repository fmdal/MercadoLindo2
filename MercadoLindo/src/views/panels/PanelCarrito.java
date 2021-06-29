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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

// ActionListener es "evento", que es el que declaramos en el new

public class PanelCarrito extends Paneles {

//	private PanelTiendaPrincipalEventos evento = new PanelTiendaPrincipalEventos(this);

	private JPanel panelTituloMiCarrito = new JPanel();
	private JLabel lblTituloMiCarrito = new JLabel("mi Carrito");
	private JPanel panelBotonesMiCarrito = new JPanel();
	private JButton btnComprarCarrito = new JButton("Comprar carrito");
	private JButton btnCambiarDomicilio = new JButton("Cambiar domicilio");
	private JPanel panelCentralMiCarrito = new JPanel();
	private final JButton btnSalirMiCarrito = new JButton("Salir");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JTable table = new JTable();
	private JButton btnVolverAlaTienda = new JButton("volver a la Tienda");
	private JButton btnCambiarTarjeta = new JButton("Cambiar tarjeta");
	private final JButton btnVaciarCarrito = new JButton("Vaciar carrito");
	/**
	 * Create the panel.
	 */
	public PanelCarrito() {

		//evento.setVista(this);
		evento = new PanelTiendaPrincipalEventos(this);
		
		setBorder(new LineBorder(SystemColor.desktop));
		setLayout(null);

		panelTituloMiCarrito.setBounds(0, 0, 450, 40);
		add(panelTituloMiCarrito);
		panelTituloMiCarrito.setLayout(null);
		lblTituloMiCarrito.setBounds(10, 0, 122, 29);

		lblTituloMiCarrito.setFont(new Font("Arial", Font.PLAIN, 12));
		panelTituloMiCarrito.add(lblTituloMiCarrito);

		JButton btnVolverAlaTienda = new JButton("volver a la Tienda");
		btnVolverAlaTienda.addActionListener(evento);
		btnVolverAlaTienda.setBounds(276, 17, 122, 23);
		panelTituloMiCarrito.add(btnVolverAlaTienda);
		btnSalirMiCarrito.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSalirMiCarrito.setBounds(397, 17, 53, 23);

		panelTituloMiCarrito.add(btnSalirMiCarrito);

		panelBotonesMiCarrito.setBounds(0, 253, 450, 47);
		add(panelBotonesMiCarrito);
		panelBotonesMiCarrito.setLayout(null);
		btnComprarCarrito.addActionListener(evento);
		btnComprarCarrito.addActionListener(evento);

		btnComprarCarrito.setBounds(305, 24, 135, 23);
		panelBotonesMiCarrito.add(btnComprarCarrito);
		btnCambiarDomicilio.addActionListener(evento);
		btnCambiarDomicilio.addActionListener(evento);

		btnCambiarDomicilio.setBounds(10, 11, 127, 23);
		panelBotonesMiCarrito.add(btnCambiarDomicilio);

		JButton btnCambiarTarjeta = new JButton("Cambiar tarjeta");
		btnCambiarTarjeta.setBounds(157, 11, 127, 23);
		panelBotonesMiCarrito.add(btnCambiarTarjeta);
		btnVaciarCarrito.setBounds(305, 0, 135, 23);
		
		panelBotonesMiCarrito.add(btnVaciarCarrito);

		panelCentralMiCarrito.setBounds(0, 40, 450, 214);
		add(panelCentralMiCarrito);
		panelCentralMiCarrito.setLayout(null);
		scrollPane.setBounds(0, 0, 450, 214);

		panelCentralMiCarrito.add(scrollPane);

		table.setBounds(0, 0, 450, 214);
		scrollPane.add(table);

		btnComprarCarrito.addActionListener(evento);
		btnCambiarDomicilio.addActionListener(evento);
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
		return panelTituloMiCarrito;
	}

	/**
	 * @param panelTitulo the panelTitulo to set
	 */
	public void setPanelTitulo(JPanel panelTitulo) {
		this.panelTituloMiCarrito = panelTitulo;
	}

	/**
	 * @return the lblTitulo
	 */
	public JLabel getLblTitulo() {
		return lblTituloMiCarrito;
	}

	/**
	 * @param lblTitulo the lblTitulo to set
	 */
	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTituloMiCarrito = lblTitulo;
	}

	/**
	 * @return the panelBotones
	 */
	public JPanel getPanelBotones() {
		return panelBotonesMiCarrito;
	}

	/**
	 * @param panelBotones the panelBotones to set
	 */
	public void setPanelBotones(JPanel panelBotones) {
		this.panelBotonesMiCarrito = panelBotones;
	}

	/**
	 * @return the btnAceptar
	 */
	public JButton getBtnComprarCarrito() {
		return btnComprarCarrito;
	}

	/**
	 * @param btnAceptar the btnAceptar to set
	 */
	public void setBtnComprarCarrito(JButton btnAceptar) {
		this.btnComprarCarrito = btnAceptar;
	}

	/**
	 * @return the btnCancelar
	 */
	public JButton getBtnCambiarDomicilio() {
		return btnCambiarDomicilio;
	}

	/**
	 * @param btnCancelar the btnCancelar to set
	 */
	public void setBtnCambiarDomicilio(JButton CambiarDomicilio) {
		this.btnCambiarDomicilio = CambiarDomicilio;
	}

	/**
	 * @return the panelCentral
	 */
	public JPanel getPanelCentral() {
		return panelCentralMiCarrito;
	}

	/**
	 * @param panelCentral the panelCentral to set
	 */
	public void setPanelCentral(JPanel panelCentral) {
		this.panelCentralMiCarrito = panelCentral;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return el dato de panelTituloMiCarrito
	 */
	public JPanel getPanelTituloMiCarrito() {
		return panelTituloMiCarrito;
	}

	/**
	 * @param panelTituloMiCarrito para cargar en panelTituloMiCarrito
	 */
	public void setPanelTituloMiCarrito(JPanel panelTituloMiCarrito) {
		this.panelTituloMiCarrito = panelTituloMiCarrito;
	}

	/**
	 * @return el dato de lblTituloMiCarrito
	 */
	public JLabel getLblTituloMiCarrito() {
		return lblTituloMiCarrito;
	}

	/**
	 * @param lblTituloMiCarrito para cargar en lblTituloMiCarrito
	 */
	public void setLblTituloMiCarrito(JLabel lblTituloMiCarrito) {
		this.lblTituloMiCarrito = lblTituloMiCarrito;
	}

	/**
	 * @return el dato de panelBotonesMiCarrito
	 */
	public JPanel getPanelBotonesMiCarrito() {
		return panelBotonesMiCarrito;
	}

	/**
	 * @param panelBotonesMiCarrito para cargar en panelBotonesMiCarrito
	 */
	public void setPanelBotonesMiCarrito(JPanel panelBotonesMiCarrito) {
		this.panelBotonesMiCarrito = panelBotonesMiCarrito;
	}

	/**
	 * @return el dato de panelCentralMiCarrito
	 */
	public JPanel getPanelCentralMiCarrito() {
		return panelCentralMiCarrito;
	}

	/**
	 * @param panelCentralMiCarrito para cargar en panelCentralMiCarrito
	 */
	public void setPanelCentralMiCarrito(JPanel panelCentralMiCarrito) {
		this.panelCentralMiCarrito = panelCentralMiCarrito;
	}

	/**
	 * @return el dato de btnSalirMiCarrito
	 */
	public JButton getBtnSalirMiCarrito() {
		return btnSalirMiCarrito;
	}

	/**
	 * @return el dato de scrollPane
	 */
	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	/**
	 * @return el dato de table
	 */
	public JTable getTable() {
		return table;
	}

	/**
	 * @return el dato de btnVolverAlaTienda
	 */
	public JButton getBtnVolverAlaTienda() {
		return btnVolverAlaTienda;
	}

	/**
	 * @param btnVolverAlaTienda para cargar en btnVolverAlaTienda
	 */
	public void setBtnVolverAlaTienda(JButton btnVolverAlaTienda) {
		this.btnVolverAlaTienda = btnVolverAlaTienda;
	}

	public JButton getBtnCambiarTarjeta() {
		return btnCambiarTarjeta;
	}

	public void setBtnCambiarTarjeta(JButton btnCambiarTarjeta) {
		this.btnCambiarTarjeta = btnCambiarTarjeta;
	}

	/**
	 * @return el dato de btnVaciarCarrito
	 */
	public JButton getBtnVaciarCarrito() {
		return btnVaciarCarrito;
	}
}
