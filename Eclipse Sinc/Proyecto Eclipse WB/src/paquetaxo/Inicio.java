package paquetaxo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.sql.SQLException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Inicio {

	private JFrame frame;
	private JTextField txtUsuario;
	private JTextField txtContrasea;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	
	static Inicio window = new Inicio();
	Ventanas control = new Ventanas();
	Conexion conexion = new Conexion();
	public static void main(String[] args) {

		 
		EventQueue.invokeLater(new Runnable() {
		
			public void run() {
		
				try {
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public Inicio() {
		initialize();
	}

	Object puto;
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()  {
		conexion.getConnection();
		
		///////////////////////////////-- conexion bd
		
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 153, 51));
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 363, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 263, 327, 33);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Administrador");
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_1);
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Cajero");
		buttonGroup.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton);
		final Administracion admin = new Administracion();
		final EditarInventario ed = new EditarInventario();
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent arg0) {
			
			if(rdbtnNewRadioButton_1.isSelected()) {
				
				
			// login
				
				try {
					conexion.login(txtUsuario.getText(), txtContrasea.getText(), 1);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
				
				 
				
				
		 if(conexion.login) {

				JOptionPane.showMessageDialog(null, "Inicia jar Administrador y consulta");
				control.mostrarPantallaAdmin();
				JOptionPane.showMessageDialog(null, "Se cierra esta ventana");
				window.frame.setVisible(false);
				
			 
			
		 }
			
			else {
				JOptionPane.showMessageDialog(null, "Usuario pass incorrecto");
			}
			
		 
				
			
			
			
			}
			
			if(rdbtnNewRadioButton.isSelected()) {
				
				
				try {
					conexion.login(txtUsuario.getText(), txtContrasea.getText(), 2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
				
				
				 if(conexion.login) {
				
				JOptionPane.showMessageDialog(null, "Inicia jar cajero");
				control.mostrarCajaRegis();
				JOptionPane.showMessageDialog(null, "Se cierra esta ventana");
				
				 }else {
						JOptionPane.showMessageDialog(null, "Usuario pass cajero incorrecto");
				 }
				 
				
				
				window.frame.setVisible(false);
			}else {
				if(rdbtnNewRadioButton_1.isSelected()) {}else {
				JOptionPane.showMessageDialog(null, "No se selecciono nada");
			}
			}
		 
			
			}// fin de moue cliked
		});
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIniciar.setBounds(57, 408, 89, 23);
		frame.getContentPane().add(btnIniciar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.addMouseListener(new MouseAdapter() {
 
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
			}
			
			 
			
		});
		btnCancelar.setBounds(203, 408, 89, 23);
		frame.getContentPane().add(btnCancelar);
		
		txtUsuario = new JTextField();
		txtUsuario.addKeyListener(new KeyAdapter() {
		 
			public void keyTyped(KeyEvent tecla) {
				System.out.println(	tecla.getExtendedKeyCode());
			}
		});
	 
		txtUsuario.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
				txtUsuario.setText("");
			}
		});
		txtUsuario.setText("Usuario");
		txtUsuario.setToolTipText("Contrase\u00F1a");
		txtUsuario.setBounds(60, 324, 228, 20);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasea = new JTextField();
	 
		txtContrasea.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent arg0) {
				txtContrasea.setText("");
			}
		});
		txtContrasea.setText("Contrase\u00F1a");
		txtContrasea.setToolTipText("Contrase\u00F1a");
		txtContrasea.setBounds(60, 355, 219, 20);
		frame.getContentPane().add(txtContrasea);
		txtContrasea.setColumns(10);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon("C:\\Users\\Inspiron3647\\Documents\\GitHub\\Cafe_la_negrita\\Eclipse Sinc\\Proyecto Eclipse WB\\src\\Imagenes\\logorzics.png"));
		lblLogo.setBounds(10, 11, 327, 241);
		frame.getContentPane().add(lblLogo);
	}
	
	public void ocultarVentana(){
		
	}
}
/**
 * 
 * "Por que las mentes agudas que
 * han inventado una m�quina que haga
 * el trabajo de 60 hombres, deben
 * ahora encontrar la forma de conservar
 * y buscar trabajo a los desplazados."
 * 
 * Robert O'Brien | Colexion cientifica de TimeLife |
 *  M�quinas | 1979 | Pagina 188
 */
