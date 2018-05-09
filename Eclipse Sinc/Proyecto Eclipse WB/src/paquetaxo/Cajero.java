package paquetaxo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

public class Cajero {

	private JFrame frmCajero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cajero window = new Cajero();
					window.frmCajero.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cajero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	JTextPane textPane = new JTextPane();
	private void initialize() {
		frmCajero = new JFrame();
		frmCajero.setEnabled(true);
		
		frmCajero.setResizable(false);
	
		
		
	
		frmCajero.setTitle("Cajero");
		frmCajero.setBounds(100, 100, 822, 476);
		frmCajero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCajero.getContentPane().setLayout(null);
		
		JLabel lblImgcajero = new JLabel("imgcajero");
		lblImgcajero.setBounds(676, 0, 84, 80);
		lblImgcajero.setIcon(new ImageIcon("C:\\Users\\neko_\\Documents\\GitHub\\Cafe_la_negrita\\Eclipse Sinc\\Imagenes\\cafenegrita.png"));
		frmCajero.getContentPane().add(lblImgcajero);
		
		//Cuadro de operacion
		
		JTextPane txtpnPruebaDeCaja = new JTextPane();
		txtpnPruebaDeCaja.setEnabled(false);
		txtpnPruebaDeCaja.setBounds(511, 75, 254, 172);
		txtpnPruebaDeCaja.setText("Prueba de caja\r\nproducto prueba $23.90\r\niva %16\r\ntotal: $72.50\r\nRecibe: $100.00\r\ncambio: 27.50");
		frmCajero.getContentPane().add(txtpnPruebaDeCaja);
		
		JButton subTot = new JButton("SubTotal");
		subTot.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		subTot.setBounds(478, 29, 89, 23);
		frmCajero.getContentPane().add(subTot);
		
		JButton tot = new JButton("T[o]tal");
		tot.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		tot.setBounds(577, 29, 89, 23);
		frmCajero.getContentPane().add(tot);
		
		JButton caff = new JButton("[C]afe");
		caff.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		
		
		
		caff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText(textPane.getText()+"Puto \n");
			}
		});
		caff.setBounds(10, 75, 89, 23);
		frmCajero.getContentPane().add(caff);
		
		JButton polv = new JButton("[P]olvos");
		polv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		polv.addKeyListener(new KeyAdapter() {
			 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		polv.setBounds(109, 75, 89, 23);
		frmCajero.getContentPane().add(polv);
		
		JButton t3 = new JButton("[T]\u00E9");
		t3.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		t3.setBounds(208, 75, 89, 23);
		frmCajero.getContentPane().add(t3);
		
		JButton esen = new JButton("[E]sencias");
		esen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		esen.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		esen.setBounds(307, 75, 89, 23);
		frmCajero.getContentPane().add(esen);
		
		//Botones de la sesion
		
		JButton btnAyuda = new JButton("[A]yuda");
		btnAyuda.addKeyListener(new KeyAdapter() {
		
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		btnAyuda.setBounds(10, 11, 89, 23);
		frmCajero.getContentPane().add(btnAyuda);
		
		JButton btnCerrarSecion = new JButton("Cerrar sesi\u00F3n[ESC]");
		btnCerrarSecion.setBounds(109, 11, 110, 23);
		frmCajero.getContentPane().add(btnCerrarSecion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(10, 109, 387, 327);
		frmCajero.getContentPane().add(scrollPane);
		
		JInternalFrame internalFrame = new JInternalFrame("Lista");
		scrollPane.setViewportView(internalFrame);
		internalFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		textPane.setEditable(false);
		
	 
		internalFrame.getContentPane().add(textPane, BorderLayout.CENTER);
		internalFrame.setVisible(true);
		
	
	}
	
	public void pulso(int tecla){
		System.out.println(tecla);
		switch(tecla){
		
		case 99: //C
			System.out.println("Se ha precionado C");
			textPane.setText(textPane.getText()+"Puto \n");
			break;
		case 112: //P
			System.out.println("Se ha precionado P");
			break;
			
		case 84: //T
			System.out.println("Se ha precionado T");
			break;
		case 101: //E
			System.out.println("Se ha precionado E");
			break;
		case 97: //A
			System.out.println("Se ha precionado A");
			break;
			
		case 27: //ESC
			System.out.println("Se ha precionado ESC");
			break;
		case 115: //S
			System.out.println("Se ha precionado S");	
			break;
		case 111: //O
			System.out.println("Se ha precionado O");	
			break;
		default:
			// nulo
			break;
		}
		
	}
	
	
	public void calculadora(){
		
	}
}
