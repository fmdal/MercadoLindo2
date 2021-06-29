package views.panels;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import dominio.Articulo;
import events.PanelTiendaPrincipalEventos;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.*;
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

public class TestPanel extends Paneles {

	private JPanel panel = new JPanel();
	
	public TestPanel() {
		setLayout(null);
		
		
		panel.setBackground(Color.YELLOW);
		panel.setBounds(0, 0, 450, 300);
		add(panel);
//		panel.setLayout(null);
		
		this.setVisible(true);
}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
}