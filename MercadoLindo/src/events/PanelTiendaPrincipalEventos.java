/**
 * 
 */
package events;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.PanelCarritoControlador;
import controller.PanelLogInControlador;
import dominio.Articulo;
import views.frames.FramePrincipal;
import views.panels.PanelCarrito;
import views.panels.PanelLogIn;
import views.panels.PanelTiendaPrincipal;
import views.panels.Paneles;

/**
 * @author Grososetti
 *
 */
public class PanelTiendaPrincipalEventos extends Eventos {

	private FramePrincipal frame;

	public PanelTiendaPrincipalEventos(Paneles panel) {
		super(panel);
		// TODO Auto-generated constructor stub
	}

	/**
	 *  
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("PanelTiendaPrincipalEventos");
		System.out.println(frame);

		if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnSalir())) {
			int opcion = JOptionPane.showConfirmDialog(this.panel, "¿Seguro que desea salir?", "Salir",
					JOptionPane.YES_NO_OPTION);
			if (opcion == 0) {
				System.exit(0);
			}

		} else if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnVerCarritoDeTienda())) {
//
//			if (frame.getEvento().getDatos().getModelo().getUsuario() == null) {
//
//				PanelLogIn ventana = new PanelLogIn();
//				PanelLogInControlador control = new PanelLogInControlador(ventana);
//				ventana.getEvento().setFrame(frame);
//
//				frame.getPanelContenedor().removeAll();
//				frame.getPanelContenedor().repaint();
//
//				frame.getContentPane().add((Component) control.initPanel());
//
//				// FIXME no tengo ni idea de porque esto
//				JPanel panel = new JPanel();
//				frame.getContentPane().add(panel);
//
//			} else {
			PanelCarrito carrito = new PanelCarrito();
			PanelCarritoControlador carritoControlador = new PanelCarritoControlador(carrito);

			frame.getPanelContenedor().removeAll();
			frame.getPanelContenedor().repaint();

			frame.getContentPane().add((Component) carritoControlador.initPanel());

			// FIXME no tengo ni idea de porque esto
			JPanel panel = new JPanel();
			frame.getContentPane().add(panel);
//			}
		} else if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnBuscarArticulo())) {

			ArrayList<Articulo> articuno = getVista().getListaArticulos();

			List<Articulo> arts = articuno.stream()
					.filter(a -> (a.getNombre().equalsIgnoreCase(getVista().getTextPane_buscar().getText()))).sorted()
					.collect(Collectors.toList());

			String[] columnas = { "Nombre", "Descripcion", "Categoria", "Cantidad", "Precio", "Agregar" };
			DefaultTableModel tableModel = new DefaultTableModel(columnas, 0);

			for (Articulo articulo : arts) {

				Object[] data = { articulo.getNombre(), articulo.getDescripcion(), articulo.getCantidad(),
						articulo.getCantidad(), articulo.getPrecio() };

				tableModel.addRow(data);
			}

			JTable table = new JTable(tableModel);

			table.setBounds(0, 0, 450, 214);

			getVista().getScrollPane().setBounds(0, 0, 450, 214);
			getVista().getScrollPane().add(table);

		} else if (e.getSource().equals(((PanelTiendaPrincipal) this.panel).getBtnLogIn())) {

			System.out.println(1);

			PanelLogIn ventana = new PanelLogIn();
			PanelLogInControlador control = new PanelLogInControlador(ventana);
			ventana.getEvento().setFrame(frame);

			frame.getPanelContenedor().removeAll();
			frame.getPanelContenedor().repaint();

			frame.getContentPane().add((Component) control.initPanel());

			// FIXME no tengo ni idea de porque esto
			JPanel panel = new JPanel();
			frame.getContentPane().add(panel);
		}

	}

	/**
	 * @return el dato de frame
	 */
	public FramePrincipal getFrame() {
		return frame;
	}

	/**
	 * @param frame para cargar en frame
	 */
	public void setFrame(FramePrincipal frame) {
		this.frame = frame;
	}

	public PanelTiendaPrincipal getVista() {
		return (PanelTiendaPrincipal) panel;
	}

	public void setVista(PanelTiendaPrincipal vista) {
		this.panel = vista;
	}
}
