package views.panels;

import java.awt.Font;
import java.awt.ScrollPane;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import dominio.Articulo;
import events.PanelTiendaPrincipalEventos;
import views.frames.FramePrincipal;

public class PanelTiendaPrincipal extends Paneles {

	/**
	 * @var long - serialVersionUID
	 */
	private static final long serialVersionUID = -2361110886891829996L;

	private ArrayList<Articulo> listaArticulos;

	private JPanel panelTituloTienda = new JPanel();
	private JPanel panelBotones = new JPanel();
	private JPanel panelCentral = new JPanel();

	private JLabel lblTitulo = new JLabel("Tienda Mercado Lindo");

	private JTextPane textPane_buscar = new JTextPane();

	private ScrollPane scrollPane = new ScrollPane();

	private JButton btnBuscarArticulo = new JButton("Buscar ");
	private JButton btnVerCarritoDeTienda = new JButton("ver Carrito");
	private JButton btnSalir = new JButton("Salir");
	private JButton btnLogIn = new JButton("Iniciar Sesion");

	private JTable table;
	private String[] columnas = { "Nombre", "Descripcion", "Categoria", "Cantidad", "Precio", "Agregar" };
	private DefaultTableModel tableModel;

	/**
	 * Create the panel.
	 */
	public PanelTiendaPrincipal(FramePrincipal frame) {

		evento = new PanelTiendaPrincipalEventos(this, frame);

		setLayout(null);
	}

	@Override
	public void init() {

		lblTitulo.setBounds(10, 0, 132, 29);
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 12));

		btnVerCarritoDeTienda.addActionListener(evento);
		btnVerCarritoDeTienda.setBounds(152, 17, 89, 18);

		textPane_buscar.setBounds(251, 15, 128, 20);

		panelTituloTienda.setBounds(10, 0, 450, 40);
		panelTituloTienda.setLayout(null);
		panelTituloTienda.add(textPane_buscar);
		panelTituloTienda.add(lblTitulo);
		panelTituloTienda.add(btnVerCarritoDeTienda);
		panelTituloTienda.add(btnBuscarArticulo);

		btnBuscarArticulo.setHorizontalAlignment(SwingConstants.LEFT);
		btnBuscarArticulo.setBounds(382, 17, 68, 18);
		btnBuscarArticulo.addActionListener(evento);

		btnSalir.setBounds(387, 11, 53, 23);
		btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSalir.addActionListener(evento);

		btnLogIn.setBounds(282, 11, 95, 23);
		btnLogIn.addActionListener(evento);

		panelBotones.setBounds(10, 253, 450, 47);
		panelBotones.setLayout(null);
		panelBotones.add(btnSalir);

		if (((PanelTiendaPrincipalEventos) evento).getFrame().getEvento().getDatos().getModelo().getUsuario() == null) {
			panelBotones.add(btnLogIn);
		}

		llenartela(listaArticulos);

		panelCentral.setBounds(10, 40, 450, 214);
		panelCentral.setLayout(null);

		add(panelCentral);
		add(panelBotones);
		add(panelTituloTienda);

		this.setVisible(true);
	}

	public void llenartela(ArrayList<Articulo> lista) {

		tableModel = new DefaultTableModel(columnas, 0);

		for (Articulo articulo : lista) {

			Object[] data = { articulo.getNombre(), articulo.getDescripcion(), articulo.getCantidad(),
					articulo.getCantidad(), articulo.getPrecio() };

			tableModel.addRow(data);
		}

		table = new JTable(tableModel);
		table.setBounds(0, 0, 450, 214);

		scrollPane.setBounds(0, 0, 450, 214);
		scrollPane.add(table);

		panelCentral.add(scrollPane);

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
		return panelTituloTienda;
	}

	/**
	 * @param panelTitulo the panelTitulo to set
	 */
	public void setPanelTitulo(JPanel panelTitulo) {
		this.panelTituloTienda = panelTitulo;
	}

	/**
	 * @return the lblTitulo
	 */
	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	/**
	 * @param lblTitulo the lblTitulo to set
	 */
	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
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

	/**
	 * @return el dato de panelTituloTienda
	 */
	public JPanel getPanelTituloTienda() {
		return panelTituloTienda;
	}

	/**
	 * @param panelTituloTienda para cargar en panelTituloTienda
	 */
	public void setPanelTituloTienda(JPanel panelTituloTienda) {
		this.panelTituloTienda = panelTituloTienda;
	}

	/**
	 * @return el dato de btnBuscarArticulo
	 */
	public JButton getBtnBuscarArticulo() {
		return btnBuscarArticulo;
	}

	/**
	 * @return el dato de btnSalir
	 */
	public JButton getBtnSalir() {
		return btnSalir;
	}

	/**
	 * @return el dato de table
	 */
	public JTable getTable() {
		return table;
	}

	/**
	 * @return el dato de btnLogIn
	 */
	public JButton getBtnLogIn() {
		return btnLogIn;
	}

	/**
	 * @return el dato de btnVerCarritoDeTienda
	 */
	public JButton getBtnVerCarritoDeTienda() {
		return btnVerCarritoDeTienda;
	}

	/**
	 * @return el dato de textPane_buscar
	 */
	public JTextPane getTextPane_buscar() {
		return textPane_buscar;
	}

	/**
	 * @return el campo columnas
	 */
	public String[] getColumnas() {
		return columnas;
	}

	/**
	 * @param columnas El parametro columnas para setear
	 */
	public void setColumnas(String[] columnas) {
		this.columnas = columnas;
	}

	/**
	 * @return el campo tableModel
	 */
	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	/**
	 * @param tableModel El parametro tableModel para setear
	 */
	public void setTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
	}

	/**
	 * @param textPane_buscar El parametro textPane_buscar para setear
	 */
	public void setTextPane_buscar(JTextPane textPane_buscar) {
		this.textPane_buscar = textPane_buscar;
	}

	/**
	 * @param btnBuscarArticulo El parametro btnBuscarArticulo para setear
	 */
	public void setBtnBuscarArticulo(JButton btnBuscarArticulo) {
		this.btnBuscarArticulo = btnBuscarArticulo;
	}

	/**
	 * @param btnVerCarritoDeTienda El parametro btnVerCarritoDeTienda para setear
	 */
	public void setBtnVerCarritoDeTienda(JButton btnVerCarritoDeTienda) {
		this.btnVerCarritoDeTienda = btnVerCarritoDeTienda;
	}

	/**
	 * @param btnSalir El parametro btnSalir para setear
	 */
	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	/**
	 * @param btnLogIn El parametro btnLogIn para setear
	 */
	public void setBtnLogIn(JButton btnLogIn) {
		this.btnLogIn = btnLogIn;
	}

	/**
	 * @param table El parametro table para setear
	 */
	public void setTable(JTable table) {
		this.table = table;
	}

	/**
	 * @return el campo scrollPane
	 */
	public ScrollPane getScrollPane() {
		return scrollPane;
	}

	/**
	 * @param scrollPane El parametro scrollPane para setear
	 */
	public void setScrollPane(ScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
}
