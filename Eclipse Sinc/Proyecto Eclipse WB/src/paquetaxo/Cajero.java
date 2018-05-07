package paquetaxo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;

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
		subTot.setBounds(478, 29, 89, 23);
		frmCajero.getContentPane().add(subTot);
		
		JButton tot = new JButton("Total");
		tot.setBounds(577, 29, 89, 23);
		frmCajero.getContentPane().add(tot);
		
		JButton caff = new JButton("Cafe");
		caff.setBounds(10, 75, 89, 23);
		frmCajero.getContentPane().add(caff);
		
		JButton polv = new JButton("Polvos");
		polv.setBounds(109, 75, 89, 23);
		frmCajero.getContentPane().add(polv);
		
		JButton t3 = new JButton("T\u00E9");
		t3.setBounds(208, 75, 89, 23);
		frmCajero.getContentPane().add(t3);
		
		JButton esen = new JButton("Esencias");
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
		btnRes.setBounds(700, 258, 65, 23);
		frmCajero.getContentPane().add(btnRes);
		
		JButton btnMul = new JButton("*");
		btnMul.setBounds(511, 260, 89, 23);
		frmCajero.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(610, 260, 80, 23);
		frmCajero.getContentPane().add(btnDiv);
		
		JButton btnPunt = new JButton(".");
		btnPunt.setBounds(610, 388, 80, 23);
		frmCajero.getContentPane().add(btnPunt);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(700, 320, 65, 91);
		frmCajero.getContentPane().add(btnEnter);
		
		//Botones de la sesion
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(10, 11, 89, 23);
		frmCajero.getContentPane().add(btnAyuda);
		
		JButton btnCerrarSecion = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSecion.setBounds(109, 11, 110, 23);
		frmCajero.getContentPane().add(btnCerrarSecion);
	}
}
