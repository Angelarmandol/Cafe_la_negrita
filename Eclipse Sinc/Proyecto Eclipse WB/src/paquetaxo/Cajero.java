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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

public class Cajero {

	int thot = 0;
	int total = 0;
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

	private void initialize() {
		JFormattedTextField formattedTextField = new JFormattedTextField();

		frmCajero = new JFrame();
		frmCajero.setEnabled(true);

		frmCajero.setResizable(false);

		frmCajero.setTitle("Cajero");
		frmCajero.setBounds(100, 100, 890, 530);
		frmCajero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCajero.getContentPane().setLayout(null);

		JLabel lblImgcajero = new JLabel("imgcajero");
		lblImgcajero.setBounds(790, 0, 84, 80);
		lblImgcajero.setIcon(new ImageIcon(
				"C:\\Users\\neko_\\Documents\\GitHub\\Cafe_la_negrita\\Eclipse Sinc\\Imagenes\\cafenegrita.png"));
		frmCajero.getContentPane().add(lblImgcajero);

		// Cuadro de operacion

		JTextPane screenCaja = new JTextPane();
		// screenCaja.setText("a");
		screenCaja.setEnabled(false);
		screenCaja.setText("Cafe la Negrita");
		screenCaja.setBounds(577, 87, 254, 276);
		frmCajero.getContentPane().add(screenCaja);

		JButton subTot = new JButton("SubTotal");
		subTot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nSubtotal: $" + total);
			}
		});
		subTot.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		subTot.setBounds(577, 29, 89, 23);
		frmCajero.getContentPane().add(subTot);

		JButton tot = new JButton("T[o]tal");
		tot.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if (formattedTextField.getText() != null) {
					int valor = Integer.parseInt(formattedTextField.getText());
					screenCaja.setText(screenCaja.getText() + "\nEfectivo: $" + valor);
					thot = valor - total;
					screenCaja.setText(screenCaja.getText() + "\nCambio: $" + thot);
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, introdusca una cantidad en efectivo");
				}
			}
		});
		tot.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		tot.setBounds(676, 29, 89, 23);
		frmCajero.getContentPane().add(tot);

		// Botones de la sesion

		JButton btnAyuda = new JButton("[A]yuda");
		btnAyuda.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		btnAyuda.setBounds(10, 11, 89, 23);
		frmCajero.getContentPane().add(btnAyuda);

		JButton btnCerrarSecion = new JButton("Cerrar sesi\u00F3n[ESC]");
		btnCerrarSecion.setBounds(109, 11, 158, 23);
		frmCajero.getContentPane().add(btnCerrarSecion);

		// Frame de ventana cafe

		JInternalFrame internalFrame1 = new JInternalFrame("Cafes");
		internalFrame1.setBounds(10, 109, 183, 348);
		frmCajero.getContentPane().add(internalFrame1);
		internalFrame1.getContentPane().setLayout(null);

		// Opciones cafe

		JButton cb1 = new JButton("Expresso");
		cb1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nExpreso: $25");
				total = total + 25;
			}
		});
		cb1.setBounds(10, 11, 89, 23);
		internalFrame1.getContentPane().add(cb1);

		JButton cb2 = new JButton("Americano");
		cb2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nAmericano: $30");
				total = total + 30;
			}
		});
		cb2.setBounds(10, 45, 108, 23);
		internalFrame1.getContentPane().add(cb2);

		JButton cb3 = new JButton("Moka");
		cb3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nMoka: $35");
				total = total + 35;
			}
		});
		cb3.setBounds(10, 79, 89, 23);
		internalFrame1.getContentPane().add(cb3);

		JButton cb4 = new JButton("Latte");
		cb4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nLatte: $33");
				total = total + 33;
			}
		});
		cb4.setBounds(10, 113, 89, 23);
		internalFrame1.getContentPane().add(cb4);

		JButton cb5 = new JButton("Chai spiced");
		cb5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nChai Spiced: $57");
				total = total + 57;
			}
		});
		cb5.setBounds(10, 147, 108, 23);
		internalFrame1.getContentPane().add(cb5);

		JButton cb6 = new JButton("Chai vainilla");
		cb6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nChai Vainilla: $63");
				total = total + 63;
			}
		});
		cb6.setBounds(10, 181, 108, 23);
		internalFrame1.getContentPane().add(cb6);

		// Frame ventana Frappe

		JInternalFrame internalFrame2 = new JInternalFrame("Frappes");
		internalFrame2.setBounds(219, 109, 183, 348);
		frmCajero.getContentPane().add(internalFrame2);
		internalFrame2.getContentPane().setLayout(null);

		// Opciones de Frappe

		JButton fb1 = new JButton("Latte");
		fb1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nFrappe Latte: $55");
				total = total + 55;
			}
		});
		fb1.setBounds(10, 11, 89, 23);
		internalFrame2.getContentPane().add(fb1);

		JButton fb2 = new JButton("Moka");
		fb2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nFrappe Moka: $60");
				total = total + 60;
			}
		});
		fb2.setBounds(10, 45, 89, 23);
		internalFrame2.getContentPane().add(fb2);

		JButton fb3 = new JButton("Vainilla");
		fb3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nFrappe Vainilla: $72");
				total = total + 72;
			}
		});
		fb3.setBounds(10, 79, 89, 23);
		internalFrame2.getContentPane().add(fb3);

		JButton fb4 = new JButton("Caramelo");
		fb4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nFrappe Caramelo: $85");
				total = total + 85;
			}
		});
		fb4.setBounds(10, 113, 89, 23);
		internalFrame2.getContentPane().add(fb4);

		JLabel lblEfectivo = new JLabel("Efectivo:");
		lblEfectivo.setBounds(577, 404, 62, 14);
		frmCajero.getContentPane().add(lblEfectivo);

		formattedTextField.setBounds(626, 401, 84, 20);
		frmCajero.getContentPane().add(formattedTextField);

		JButton btrec = new JButton("Imprimir Recibo");
		btrec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println(screenCaja.getText());
				screenCaja.setText("Cafe la Negrita");
				total = 0;
				thot = 0;
			}
		});
		btrec.setBounds(738, 400, 136, 23);
		frmCajero.getContentPane().add(btrec);

		// Visibilidad de los frames
		internalFrame1.setVisible(true);
		internalFrame2.setVisible(true);

	}

	public void pulso(int tecla) {

		System.out.println(tecla);
		switch (tecla) {
		case 27: // ESC
			System.out.println("Se ha precionado ESC");
			break;
		case 115: // S
			System.out.println("Se ha precionado S");
			break;
		case 111: // O
			System.out.println("Se ha precionado O");
			break;
		default:
			// nulo
			break;
		}

	}
}
