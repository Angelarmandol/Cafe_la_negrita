package paquetaxo;

import java.awt.Color;
import java.awt.Event;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
	private void initialize() {
		frmCajero = new JFrame();
		frmCajero.setEnabled(true);
		
	
	
		
		
	
		frmCajero.setTitle("Cajero");
		frmCajero.setBounds(100, 100, 791, 461);
		frmCajero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCajero.getContentPane().setLayout(null);
		
		JLabel lblImgcajero = new JLabel("imgcajero");
		lblImgcajero.setBounds(676, 0, 84, 80);
		lblImgcajero.setIcon(new ImageIcon("C:\\Users\\neko_\\Documents\\GitHub\\Cafe_la_negrita\\Eclipse Sinc\\Imagenes\\cafenegrita.png"));
		frmCajero.getContentPane().add(lblImgcajero);
		
		//Cuadro de operacion
		
		JTextPane txtpnPruebaDeCaja = new JTextPane();
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
		
		JButton t3 = new JButton("[T\u00E9]");
		t3.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		t3.setBounds(208, 75, 89, 23);
		frmCajero.getContentPane().add(t3);
		
		JButton esen = new JButton("[E]sencias");
		esen.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		esen.setBounds(307, 75, 89, 23);
		frmCajero.getContentPane().add(esen);
		
		//Calculadora integrada
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(511, 388, 89, 23);
		frmCajero.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(511, 354, 53, 23);
		frmCajero.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(574, 354, 53, 23);
		frmCajero.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(637, 354, 53, 23);
		frmCajero.getContentPane().add(btn3);
		
		JButton bt4 = new JButton("4");
		bt4.setBounds(511, 320, 53, 23);
		frmCajero.getContentPane().add(bt4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(574, 320, 53, 23);
		frmCajero.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(637, 320, 53, 23);
		frmCajero.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addKeyListener(new KeyAdapter() {
			 
			public void keyPressed(KeyEvent arg0) {
			 
			}
		});
		btn7.setBounds(511, 289, 53, 23);
		frmCajero.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(574, 289, 53, 23);
		frmCajero.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(637, 289, 53, 23);
		frmCajero.getContentPane().add(btn9);
		
		JButton btnSum = new JButton("+");
		btnSum.setBounds(700, 289, 65, 23);
		frmCajero.getContentPane().add(btnSum);
		
		JButton btnRes = new JButton("-");
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRes.addKeyListener(new KeyAdapter() {
			 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		btnRes.setBounds(700, 258, 65, 23);
		frmCajero.getContentPane().add(btnRes);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	  
		btnMul.setBounds(511, 260, 89, 23);
		frmCajero.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		 
		btnDiv.setBounds(610, 260, 80, 23);
		frmCajero.getContentPane().add(btnDiv);
		
		JButton btnPunt = new JButton(".");
		btnPunt.setBounds(610, 388, 80, 23);
		frmCajero.getContentPane().add(btnPunt);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(700, 320, 65, 91);
		frmCajero.getContentPane().add(btnEnter);
		
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
		
	 
	}
	
	public void pulso(int tecla){
		System.out.println(tecla);
		switch(tecla){
		
		case 99: //C
			System.out.println("Se ha precionado C");
			
			
		case 112: //P
			System.out.println("Se ha precionado P");
			
			
		case 84: //T
			System.out.println("Se ha precionado T");
			
		case 101: //E
			System.out.println("Se ha precionado E");
			
		case 97: //A
			System.out.println("Se ha precionado A");
			
			
		case 27: //ESC
			System.out.println("Se ha precionado ESC");
		
		case 115: //S
			System.out.println("Se ha precionado S");	
				
		case 111: //O
			System.out.println("Se ha precionado O");		
			
		}
		
	}
	
	
	public void calculadora(){
		
	}
}
