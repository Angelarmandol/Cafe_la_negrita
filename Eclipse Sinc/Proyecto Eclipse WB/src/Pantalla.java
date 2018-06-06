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
import java.awt.Toolkit;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

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
		frame.setForeground(new Color(51, 255, 51));
		frame.setBounds(0, 0, 562, 394);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Limpio\\Desktop\\Cafe_la_negrita-master\\Eclipse Sinc\\Imagenes\\voc-coffee-break-background-1.6.jpg"));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setBounds(0, 0, 1300, 660);
		final JPanel panel = new JPanel();
		panel.setBounds(0, 0, 20, 10);
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
		panel.setBackground(new Color(153, 102, 51));
		
		JLabel lblCafExpresso = new JLabel("CAF\u00C9 EXPRESSO");
		lblCafExpresso.setBounds(509, 64, 270, 50);
		lblCafExpresso.setForeground(Color.WHITE);
		lblCafExpresso.setFont(new Font("Gill Sans MT", Font.PLAIN, 35));
		
		JLabel label_4 = new JLabel("Expresso");
		label_4.setBounds(572, 117, 207, 143);
		
		JLabel label_5 = new JLabel("$30M.N.");
		label_5.setBounds(572, 263, 154, 41);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Batang", Font.BOLD, 35));
		
		JLabel lblNewLabel = new JLabel("Expresso");
		lblNewLabel.setBounds(76, 64, 175, 143);
		lblNewLabel.setIcon(new ImageIcon(Pantalla.class.getResource("/Imagenes/CASA.jpg")));
		
		String textExpresso= "preguntar ";
		try {
			textExpresso="$"+ conexion.consultaPrecio("sku00014").toString()+"M.N.";
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JLabel lblExpresso = new JLabel("EXPRESSO");
		lblExpresso.setBounds(76, 19, 175, 42);
		lblExpresso.setForeground(new Color(255, 255, 255));
		lblExpresso.setFont(new Font("Gill Sans MT", Font.PLAIN, 35));
		
		
		JLabel label = new JLabel(textExpresso);
		label.setBounds(97, 210, 309, 50);
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Batang", Font.BOLD, 35));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(1122, 0, 220, 260);
		lblNewLabel_2.setIcon(new ImageIcon(Pantalla.class.getResource("/Imagenes/logorzics.png")));
		
		JLabel lblCafMoka = new JLabel("CAFÉ AMERICANO");
		lblCafMoka.setBounds(292, 19, 294, 42);
		lblCafMoka.setForeground(Color.WHITE);
		lblCafMoka.setFont(new Font("Gill Sans MT", Font.PLAIN, 35));
		
		JLabel label_2 = new JLabel("Expresso");
		label_2.setBounds(292, 64, 207, 143);
		label_2.setIcon(new ImageIcon(Pantalla.class.getResource("/Imagenes/cafe-americano.jpg")));
		
		
		///////////////////////////////////////////////////////////////////////////
		String textam= "preguntar ";
		try {
			textam ="$"+ conexion.consultaPrecio("sku00015").toString()+"M.N."; ////////////////SKU00015 ES EL AMERICANO
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		///////////////////////////////////////////////////////////////
		
		JLabel label_3 = new JLabel(textam);
		label_3.setBounds(360, 210, 309, 50);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Batang", Font.BOLD, 35));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 1374, 775);
		lblNewLabel_1.setIcon(new ImageIcon(Pantalla.class.getResource("/Imagenes/voc-coffee-break-background-1.6.jpg")));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		frame.getContentPane().add(lblNewLabel_2);
		frame.getContentPane().add(label_2);
		frame.getContentPane().add(label);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblExpresso);
		frame.getContentPane().add(lblCafMoka);
		frame.getContentPane().add(label_5);
		frame.getContentPane().add(label_3);
		frame.getContentPane().add(label_4);
		frame.getContentPane().add(lblCafExpresso);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 615, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setVisible(true);
	}
}
