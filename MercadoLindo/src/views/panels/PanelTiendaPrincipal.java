package views.panels;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import dominio.Articulo;
import events.PanelTiendaPrincipalEventos;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
import javax.swing.JTextPane;

public class PanelTiendaPrincipal extends Paneles {

//	private PanelTiendaPrincipalEventos evento = new PanelTiendaPrincipalEventos(this);
	private ArrayList<Articulo> listaArticulos;
	
	private JPanel panelTituloTienda = new JPanel();
	private JPanel panelBotones = new JPanel();
	private JPanel panelCentral = new JPanel();
	private JLabel lblTitulo = new JLabel("Tienda Mercado Lindo");
		
	private final JButton btnVerCarritoDeTienda = new JButton("ver Carrito");
	
	private final JButton btnBuscarArticulo = new JButton("Buscar ");
	private final JTextPane textPane_buscar = new JTextPane();
	
	private final JButton btnSalir = new JButton("Salir");
	private final JButton btnLogIn = new JButton("Iniciar Sesion");
	
	private final JTable table = new JTable();

	
	/**
	 * Create the panel.
	 */
	public PanelTiendaPrincipal() {
		
//		evento.setVista(this);
		evento = new PanelTiendaPrincipalEventos(this);
		
		setBorder(new LineBorder(SystemColor.desktop));
		setLayout(null);
		
		panelTituloTienda.setBounds(0, 0, 450, 40);
		add(panelTituloTienda);
		panelTituloTienda.setLayout(null);
		lblTitulo.setBounds(10, 0, 132, 29);
		
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 12));
		panelTituloTienda.add(lblTitulo);
		
		JButton btnVerCarritoDeTienda = new JButton("ver Carrito");
		btnVerCarritoDeTienda.addActionListener(evento);
		btnVerCarritoDeTienda.setBounds(152, 17, 89, 18);
		panelTituloTienda.add(btnVerCarritoDeTienda);
		btnBuscarArticulo.addActionListener(evento);
		btnBuscarArticulo.setHorizontalAlignment(SwingConstants.LEFT);
		btnBuscarArticulo.setBounds(382, 17, 68, 18);
		
		panelTituloTienda.add(btnBuscarArticulo);
		
		JTextPane textPane_buscar = new JTextPane();
		textPane_buscar.setBounds(251, 15, 128, 20);
		panelTituloTienda.add(textPane_buscar);
		
	
		panelBotones.setBounds(0, 253, 450, 47);
		add(panelBotones);
		panelBotones.setLayout(null);
		btnSalir.setBounds(387, 11, 53, 23);
		panelBotones.add(btnSalir);
		btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);
		btnLogIn.setBounds(282, 11, 95, 23);
		
		panelBotones.add(btnLogIn);
		

		panelCentral.setBounds(0, 40, 450, 214);
		add(panelCentral);
		panelCentral.setLayout(null);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(0, 0, 450, 214);
		panelCentral.add(scrollPane);
		table.setBounds(0, 0, 450, 214);
		
		scrollPane.add(table);
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

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
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
}
