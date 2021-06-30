package views.panels;

import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import dominio.DemoPrincipal;
import controller.PanelTiendaPrincipalControlador;
import dominio.Articulo;
import dominio.Cliente;
import dominio.Usuario;
import events.PanelCarritoEventos;
import views.frames.FramePrincipal;

// ActionListener es "evento", que es el que declaramos en el new

public class PanelCarrito extends Paneles {
	
	private ArrayList<Articulo> listaArticulos;
	private ArrayList<Cliente> listaUsuarios;
	private JPanel panelBotonesMiCarrito = new JPanel();
	private JPanel panelCentralMiCarrito = new JPanel();
	private JPanel panelTituloMiCarrito = new JPanel();
	private JLabel lblTituloMiCarrito = new JLabel("mi Carrito");
	private JScrollPane scrollPane = new JScrollPane();
	private JTable table = new JTable();
	private JButton btnSalirMiCarrito = new JButton("Salir");
	private JButton btnComprarCarrito = new JButton("Comprar carrito");
	private JButton btnCambiarDomicilio = new JButton("Cambiar domicilio");
	private JButton btnVolverAlaTienda = new JButton("volver a la Tienda");
	private JButton btnCambiarTarjeta = new JButton("Cambiar tarjeta");
	private JButton btnVaciarCarrito = new JButton("Vaciar carrito");
	private String[] columnas = { "Nombre" };
	private DefaultTableModel tableModel;
	private long dni;
	private ArrayList<Cliente> d;
	/**
	 * Create the panel.
	 */
	public PanelCarrito(FramePrincipal frame) {

		evento = new PanelCarritoEventos(this, frame);

		setBorder(new LineBorder(SystemColor.desktop));
		setLayout(null);

	}

	@Override
	public void init() {

		lblTituloMiCarrito.setBounds(10, 0, 122, 29);
		lblTituloMiCarrito.setFont(new Font("Arial", Font.PLAIN, 12));

		btnVolverAlaTienda.addActionListener(evento);
		btnVolverAlaTienda.setBounds(276, 17, 122, 23);

		btnSalirMiCarrito.addActionListener(evento);
		btnSalirMiCarrito.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSalirMiCarrito.setBounds(397, 17, 53, 23);

		btnComprarCarrito.addActionListener(evento);
		btnComprarCarrito.setBounds(305, 24, 135, 23);

		btnVaciarCarrito.addActionListener(evento);
		btnVaciarCarrito.setBounds(305, 0, 135, 23);

		btnCambiarDomicilio.addActionListener(evento);
		btnCambiarDomicilio.setBounds(10, 11, 127, 23);

		btnCambiarTarjeta.addActionListener(evento);
		btnCambiarTarjeta.setBounds(157, 11, 127, 23);

		panelTituloMiCarrito.setBounds(10, 0, 450, 40);
		panelTituloMiCarrito.setLayout(null);
		panelBotonesMiCarrito.setBounds(10, 253, 450, 47);
		panelBotonesMiCarrito.setLayout(null);
		panelCentralMiCarrito.setBounds(10, 40, 450, 214);
		panelCentralMiCarrito.setLayout(null);

		panelTituloMiCarrito.add(lblTituloMiCarrito);
		panelTituloMiCarrito.add(btnVolverAlaTienda);
		panelTituloMiCarrito.add(btnSalirMiCarrito);
		panelBotonesMiCarrito.add(btnComprarCarrito);
		panelBotonesMiCarrito.add(btnCambiarTarjeta);
		panelBotonesMiCarrito.add(btnVaciarCarrito);
		panelBotonesMiCarrito.add(btnCambiarDomicilio);
		panelCentralMiCarrito.add(scrollPane);
		scrollPane.setBounds(10, 0, 450, 214);
		dni = ((PanelCarritoEventos) evento).getFrame().getEvento().getDatos().getModelo().getUsuario().getDni();
		listaUsuarios = ((PanelCarritoEventos) evento).getFrame().getEvento().getDatos().getModelo().getClientes();
		llenarTabla(dni);
		table.setBounds(0, 0, 450, 214);
		scrollPane.add(table);

		add(panelTituloMiCarrito);
		add(panelCentralMiCarrito);
		add(panelBotonesMiCarrito);
	}
	
	
	public void llenarTabla(long dni) {
		tableModel = new DefaultTableModel(columnas, 0);
		System.out.println("USUARIOSSSSSS "+listaUsuarios);
		for (Cliente u : listaUsuarios) {
			if (u.getDni()==dni) {
				if (((Usuario)u).getUsuarioCarrito()==null) {
					JOptionPane.showMessageDialog(null, "No posee articulos en su carrito");
				} else {
					((Usuario)u).getUsuarioCarrito().getListaArticulos(); 
					for (int i =0; i<((Usuario)u).getUsuarioCarrito().getListaArticulos().size(); i++){
	
						Object[] data = { ((Usuario)u).getUsuarioCarrito().getListaArticulos().get(i).getNombre() };
						tableModel.addRow(data);
					}
				}
			}
		}
		table = new JTable(tableModel);
		table.setBounds(0, 0, 450, 214);

		scrollPane.setBounds(0, 0, 450, 214);
		scrollPane.add(table);

		panelCentralMiCarrito.add(scrollPane);

	}

//	Getters & Setters

	/**
	 * @return the evento
	 */
	@Override
	public PanelCarritoEventos getEvento() {
		return (PanelCarritoEventos) evento;
	}

	/**
	 * @param evento the evento to set
	 */
	public void setEvento(PanelCarritoEventos evento) {
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
	/**
	 * @return el dato de listaArticulos
	 */
	public ArrayList<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	/**
	 * @param listaArticulos para cargar en listaArticulos
	 */
	public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}
	
	public ArrayList<Cliente> getListaUsuarios() {
		return listaUsuarios;
	}

	/**
	 * @param listaArticulos para cargar en listaArticulos
	 */
	public void setListaUsuarios(ArrayList<Cliente> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
}
