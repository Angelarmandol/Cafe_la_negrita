package paquetaxo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.sql.SQLException;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;

public class Pantalla {

	private JFrame frame;
	
	Conexion conexion = new Conexion();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla window = new Pantalla();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			 
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
			 
			 
		 
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(Color.RED);
			}
			 
			 
			public void mouseExited(MouseEvent e) {
				panel.setBackground(Color.WHITE);
			}
		});
		panel.setBackground(Color.WHITE);
		
		panel.setBounds(0, 0, 20, 23);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Pantalla.class.getResource("/Imagenes/CASA.jpg")));
		lblNewLabel.setBounds(96, 57, 132, 142);
	 
		frame.getContentPane().add(lblNewLabel);
		
		String textExpresso= "preguntar ";
		try {
			textExpresso="$"+ conexion.consultaPrecio("sku00014").toString()+"M.N.";
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		JLabel label = new JLabel(textExpresso);
		label.setBounds(68, 210, 200, 50);
		frame.getContentPane().add(label);
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 615, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setVisible(true);
	}
}
