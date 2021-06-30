package views.panels;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import events.PanelTiendaPrincipalEventos;

public class PanelPortalReportes extends Paneles {

//	private PanelTiendaPrincipalEventos evento = new PanelTiendaPrincipalEventos(this);

	private JPanel panelTituloLogIn = new JPanel();
	private JPanel panelBotones = new JPanel();
	private JPanel panelCentral = new JPanel();
	
	private JLabel lblTituloReportes = new JLabel("Portal Reportes - Mercado Lindo");
	private JLabel lblMayores10mil = new JLabel(
			"<html>Obtener el nombre y dni de los clientes que realizaron compras por m\u00E1s de $10.000</html>");
	private final JLabel lblMasVendido = new JLabel(
			"<html>Obtener el art\u00EDculo m\u00E1s comercializado  a partir del nombre de una empresa:</html>");
	private final JLabel lblUltimas5Compras = new JLabel(
			"<html>A partir del dni de un cliente, obtener las \u00FAltimas 5 compras realizadas mostrando:  </html>");

	private final JButton btnSalir = new JButton("Salir");
	private final JButton btnDescargar_Mayores10mil = new JButton("Descargar reporte");
	private final JButton btnDescargar_MasVendido = new JButton("Descargar");
	private final JButton btnDescargar_Ultimas5Compras = new JButton("Descargar");
	
	private final JTextPane textPane_MasVendido = new JTextPane();
	private final JTextPane textPane_Ultimas5Compras = new JTextPane();

	/**
	 * Create the panel.
	 */
	public PanelPortalReportes() {

//		evento.setVista(this);
		evento = new PanelTiendaPrincipalEventos(this);

		setBorder(new LineBorder(SystemColor.desktop));
		setLayout(null);

		panelTituloLogIn.setBounds(0, 0, 450, 40);
		panelTituloLogIn.setLayout(null);
		panelTituloLogIn.add(lblTituloReportes);
		panelBotones.setBounds(0, 253, 450, 47);
		panelBotones.setLayout(null);
		panelCentral.setBounds(0, 40, 450, 214);
		panelCentral.setLayout(null);
		
		lblTituloReportes.setBounds(10, 0, 303, 29);
		lblTituloReportes.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMayores10mil.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMayores10mil.setBounds(10, 11, 224, 75);
		lblMasVendido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMasVendido.setBounds(10, 49, 224, 75);
		lblUltimas5Compras.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUltimas5Compras.setBounds(10, 89, 224, 75);

		btnSalir.setBounds(387, 11, 53, 23);
		btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSalir.addActionListener(evento);
		
		btnDescargar_Mayores10mil.addActionListener(evento);
		btnDescargar_Mayores10mil.setBounds(244, 30, 130, 23);
		
		btnDescargar_MasVendido.setBounds(369, 73, 81, 23);
		btnDescargar_MasVendido.addActionListener(evento);
		
		btnDescargar_Ultimas5Compras.addActionListener(evento);
		btnDescargar_Ultimas5Compras.setBounds(369, 117, 81, 23);
		
		textPane_MasVendido.setBounds(244, 74, 115, 22);
		textPane_Ultimas5Compras.setBounds(244, 118, 115, 22);
	
		panelCentral.add(lblMayores10mil);
		panelCentral.add(btnDescargar_Mayores10mil);
		panelCentral.add(lblMasVendido);
		panelCentral.add(textPane_MasVendido);
		panelCentral.add(lblUltimas5Compras);
		panelCentral.add(textPane_Ultimas5Compras);
		panelCentral.add(btnDescargar_MasVendido);
		panelCentral.add(btnDescargar_Ultimas5Compras);
		panelBotones.add(btnSalir);
		
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
		return lblTituloReportes;
	}

	/**
	 * @param lblTitulo the lblTitulo to set
	 */
	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTituloReportes = lblTitulo;
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
	 * @return el dato de lblTituloReportes
	 */
	public JLabel getLblTituloReportes() {
		return lblTituloReportes;
	}

	/**
	 * @param lblTituloReportes para cargar en lblTituloReportes
	 */
	public void setLblTituloReportes(JLabel lblTituloReportes) {
		this.lblTituloReportes = lblTituloReportes;
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
		return btnDescargar_Mayores10mil;
	}

	/**
	 * @return el dato de lblArticuloMasVendido
	 */
	public JLabel getLblArticuloMasVendido() {
		return lblMasVendido;
	}

	/**
	 * @return el dato de textPane_Numero
	 */
	public JTextPane getTextPane_Numero() {
		return textPane_MasVendido;
	}

	/**
	 * @return el dato de lblObtenerUltimas5Compras
	 */
	public JLabel getLblObtenerUltimas5Compras() {
		return lblUltimas5Compras;
	}

	/**
	 * @return el dato de textPane_Numero_1
	 */
	public JTextPane getTextPane_Numero_1() {
		return textPane_Ultimas5Compras;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	/**
	 * @return el dato de lblMasVendido
	 */
	public JLabel getLblMasVendido() {
		return lblMasVendido;
	}

	/**
	 * @return el dato de lblUltimas5Compras
	 */
	public JLabel getLblUltimas5Compras() {
		return lblUltimas5Compras;
	}

	/**
	 * @return el dato de btnDescargar_Mayores10mil
	 */
	public JButton getBtnDescargar_Mayores10mil() {
		return btnDescargar_Mayores10mil;
	}

	/**
	 * @return el dato de textPane_MasVendido
	 */
	public JTextPane getTextPane_MasVendido() {
		return textPane_MasVendido;
	}

	/**
	 * @return el dato de btnDescargar_MasVendido
	 */
	public JButton getBtnDescargar_MasVendido() {
		return btnDescargar_MasVendido;
	}

	/**
	 * @return el dato de textPane_Ultimas5Compras
	 */
	public JTextPane getTextPane_Ultimas5Compras() {
		return textPane_Ultimas5Compras;
	}

	/**
	 * @return el dato de btnDescargar_Ultimas5Compras
	 */
	public JButton getBtnDescargar_Ultimas5Compras() {
		return btnDescargar_Ultimas5Compras;
	}
}
