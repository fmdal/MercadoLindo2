/**
 * 
 *
 * @author Usalmove
 * @since 26 jun. 2021
 * hhhh
 * kijki.java
 *
 * @version 0.0 Creacion del archivo.
 */
package Demo;
//Kiki
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import views.panels.PanelTiendaPrincipal;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Clase de  
 *
 * @author Usalmove
 * @since 26 jun. 2021
 * @version 0.0 Creacion del archivo.
 *
 *
 */
public class MainDemo extends JFrame {

	private JPanel contentPane = new JPanel();
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu botonMenu = new JMenu("MenuTitulo");
	private JMenuItem itemMenuAlgo = new JMenuItem("Item del menu");
	private JPanel panel = new JPanel();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDemo frame = new MainDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setJMenuBar(menuBar);
	
		menuBar.add(botonMenu);
		itemMenuAlgo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.add(new PanelTiendaPrincipal());
			}
		});
		
		botonMenu.add(itemMenuAlgo);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	}

	/**
	 * @return el dato de contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}

	/**
	 * @param contentPane para cargar en contentPane
	 */
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	/**
	 * @param menuBar para cargar en menuBar
	 */
	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	/**
	 * @return el dato de botonMenu
	 */
	public JMenu getBotonMenu() {
		return botonMenu;
	}

	/**
	 * @param botonMenu para cargar en botonMenu
	 */
	public void setBotonMenu(JMenu botonMenu) {
		this.botonMenu = botonMenu;
	}

	/**
	 * @return el dato de itemMenuAlgo
	 */
	public JMenuItem getItemMenuAlgo() {
		return itemMenuAlgo;
	}

	/**
	 * @param itemMenuAlgo para cargar en itemMenuAlgo
	 */
	public void setItemMenuAlgo(JMenuItem itemMenuAlgo) {
		this.itemMenuAlgo = itemMenuAlgo;
	}

	/**
	 * @return el dato de panel
	 */
	public JPanel getPanel() {
		return panel;
	}

	/**
	 * @param panel para cargar en panel
	 */
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
}
