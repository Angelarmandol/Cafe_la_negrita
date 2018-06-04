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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.BoxLayout;
import javax.swing.DropMode;

public class Cajero {

	int thot = 0, total = 0;
	private JFrame frmCajero;
	Conexion conexion = new Conexion();

	int productos[] = new int[10];

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
		final JFormattedTextField formattedTextField = new JFormattedTextField();
		// final int total = 0;

		frmCajero = new JFrame();
		frmCajero.setEnabled(true);

		frmCajero.setResizable(false);

		frmCajero.setTitle("Cajero");
		frmCajero.setBounds(100, 100, 890, 530);
		frmCajero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCajero.getContentPane().setLayout(null);
		final JTextPane screenCaja = new JTextPane();
		screenCaja.setBounds(523, 71, 331, 187);
		frmCajero.getContentPane().add(screenCaja);

		// Cuadro de operacion

		// screenCaja.setText("a");
		screenCaja.setEnabled(false);
		screenCaja.setText("Cafe la Negrita");
		JLabel lblImgcajero = new JLabel("imgcajero");
		lblImgcajero.setBounds(790, 0, 84, 80);
		lblImgcajero
				.setIcon(new ImageIcon(
						"C:\\Users\\neko_\\Documents\\GitHub\\Cafe_la_negrita\\Eclipse Sinc\\Imagenes\\cafenegrita.png"));
		frmCajero.getContentPane().add(lblImgcajero);

		JButton subTot = new JButton("SubTotal");
		subTot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		subTot.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				screenCaja.setText(screenCaja.getText() + "\nSubtotal: $"
						+ total);

				for (int x = 0; x <= 9; x++) {
					System.out.println("Cantidad de productos " + x + ": "
							+ productos[x]);

					switch (x) {
					case 0:
						while (productos[x] > 0) {
							System.out.println("borrando" + productos[x]);
							conexion.restarUnidades("sku00001", 15);
							productos[x] = productos[x] - 1;
						}
						break;
						
						
					case 1:
						while (productos[x] > 0) {
							System.out.println("borrando" + productos[x]);
							
							conexion.restarUnidades("sku00001", 15); //15 de cafe
							conexion.restarUnidades("sku00001", 15); //15 de cafe
							conexion.restarUnidades("sku00002", 120); //120 de leche
							
							productos[x] = productos[x] - 1;
						}
						break;	
						
						
					case 2:
						while (productos[x] > 0) {
							System.out.println("borrando" + productos[x]);
							
							conexion.restarUnidades("sku00001", 15); //15 de cafe
							conexion.restarUnidades("sku00002", 120); //120 de leche
							conexion.restarUnidades("sku00003", 60); //60 polvo caca0
							conexion.restarUnidades("sku00004", 35); //35 azucar
							
							
							productos[x] = productos[x] - 1;
						}
						break;
				
						
					case 3:
						while (productos[x] > 0) {
							System.out.println("borrando" + productos[x]);
							
							conexion.restarUnidades("sku00002", 170); //170 de leche
							conexion.restarUnidades("sku00001", 30); //30 de cafe
							conexion.restarUnidades("sku00004", 35); //35 azucar
							
							
							productos[x] = productos[x] - 1;
						}
						break;
						
						
					case 4:
						while (productos[x] > 0) {
							System.out.println("borrando" + productos[x]);
							
							conexion.restarUnidades("sku00005", 35); //35 chai	
							conexion.restarUnidades("sku00001", 30); //30 de cafe
							conexion.restarUnidades("sku00004", 35); //35 azucar
							
							productos[x] = productos[x] - 1;
						}
						break;
						
					case 5:
						while (productos[x] > 0) {
							System.out.println("borrando" + productos[x]);
							
							
							conexion.restarUnidades("sku00006", 35); //35 chai vainilla
							conexion.restarUnidades("sku00001", 30); //30 de cafe
							conexion.restarUnidades("sku00004", 35); //35 azucar
							
							
							productos[x] = productos[x] - 1;
						}
						break;
						
					case 6:
						while (productos[x] > 0) {
							System.out.println("borrando" + productos[x]);
							
							conexion.restarUnidades("sku00001", 30); //30 de cafe
							conexion.restarUnidades("sku00004", 40); //40 azucar
							conexion.restarUnidades("sku00002", 125); //125 de leche
							
							productos[x] = productos[x] - 1;
						}
						break;
						
						
						
					case 7:
						while (productos[x] > 0) {
							System.out.println("borrando" + productos[x]);
							
							conexion.restarUnidades("sku00001", 30); //30 de cafe
							conexion.restarUnidades("sku00003", 60); //60 polvo caca0
							conexion.restarUnidades("sku00004", 40); //40 azucar
							conexion.restarUnidades("sku00002", 125); //125 de leche
							
							productos[x] = productos[x] - 1;
						}
						break;
						
						
						
					case 8:
						while (productos[x] > 0) {
							System.out.println("borrando" + productos[x]);
							
							conexion.restarUnidades("sku00006", 30); //30 cafe vainilla
							conexion.restarUnidades("sku00002", 240); //125 de leche
							productos[x] = productos[x] - 1;
						}
						break;
						
						
						
						
						
					case 9:
						while (productos[x] > 0) {
							System.out.println("borrando" + productos[x]);
							
							conexion.restarUnidades("sku00001", 30); //30 de cafe
							conexion.restarUnidades("sku00008", 150); //150 de cafe
							conexion.restarUnidades("sku00002", 240); //125 de leche
							conexion.restarUnidades("sku00004", 40); //40 azucar
							
							productos[x] = productos[x] - 1;
						}
						break;
						
						
						
						
					}

				}// fin for productos

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
		tot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		tot.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {

				try {
					if (Integer.parseInt(formattedTextField.getText()) > 0) {
						int valor = Integer.parseInt(formattedTextField
								.getText());

						screenCaja.setText(screenCaja.getText()
								+ "\nEfectivo: $" + valor);

						if (valor < total) {
							JOptionPane.showMessageDialog(null,
									"El efectivo es insuficiente");
						} else {
							thot = valor - total;
							screenCaja.setText(screenCaja.getText()
									+ "\nCambio: $" + thot);
						}

					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"No se a insertado dinero");
				}

				/*
				 * 
				 * se necesita validar siu el dinero ingresado es matyor a la
				 * catidad
				 * 
				 * 
				 * 
				 * 
				 * 
				 * Cuando se confiemrn l exixstencia de los productos se resta
				 * en base d a la cantidad e ingredientes que se necesinar
				 */

			}
		});
		tot.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		tot.setBounds(676, 29, 89, 23);
		frmCajero.getContentPane().add(tot);

		JButton caff = new JButton("[C]afe");
		caff.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				// internalFrame1.setVisible(true);
			}
		});
		caff.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});

		caff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// textPane.setText(textPane.getText()+"Puto \n");

			}
		});
		caff.setBounds(10, 75, 89, 23);
		frmCajero.getContentPane().add(caff);

		JButton frapp = new JButton("[F]rappe");
		frapp.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				// internalFrame2.setVisible(true);
			}
		});
		frapp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frapp.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		frapp.setBounds(219, 75, 89, 23);
		frmCajero.getContentPane().add(frapp);

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
		btnCerrarSecion.setBounds(109, 11, 110, 23);
		frmCajero.getContentPane().add(btnCerrarSecion);

		// Frame de ventana cafe

		JInternalFrame internalFrame1 = new JInternalFrame("Cafes");
		internalFrame1.setBounds(10, 109, 183, 348);
		frmCajero.getContentPane().add(internalFrame1);
		internalFrame1.getContentPane().setLayout(null);

		// Opciones cafe

		JButton cb1 = new JButton("Expresso");
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cb1.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {

				String precio = "0";
				try {
					precio = conexion.consultaPrecio("sku00014");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				screenCaja.setText(screenCaja.getText() + "\nExpreso: "
						+ precio);
				total = total + Integer.parseInt(precio);

				productos[0] = productos[0] + 1;
			}
		});

		cb1.setBounds(10, 11, 89, 23);
		internalFrame1.getContentPane().add(cb1);

		JButton cb2 = new JButton("Americano");
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cb2.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				String precio = "0";
				try {
					precio = conexion.consultaPrecio("sku00015");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				screenCaja.setText(screenCaja.getText() + "\nAmericano: "
						+ precio);
				total = total + Integer.parseInt(precio);
				productos[1] = productos[1] + 1;
			}
		});
		cb2.setBounds(10, 45, 89, 23);
		internalFrame1.getContentPane().add(cb2);

		JButton cb3 = new JButton("Moka");
		cb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cb3.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				String precio = "0";
				try {
					precio = conexion.consultaPrecio("sku00016");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				screenCaja.setText(screenCaja.getText() + "\nMoka: " + precio);
				total = total + Integer.parseInt(precio);
				productos[2] = productos[2] + 1;
			}
		});
		cb3.setBounds(10, 79, 89, 23);
		internalFrame1.getContentPane().add(cb3);

		JButton cb4 = new JButton("Latte");
		cb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cb4.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				String precio = "0";
				try {
					precio = conexion.consultaPrecio("sku00017");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				screenCaja.setText(screenCaja.getText() + "\nLatte: " + precio);
				total = total + Integer.parseInt(precio);

				productos[3] = productos[3] + 1;
			}
		});
		cb4.setBounds(10, 113, 89, 23);
		internalFrame1.getContentPane().add(cb4);

		JButton cb5 = new JButton("Chai spiced");
		cb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cb5.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				String precio = "0";
				try {
					precio = conexion.consultaPrecio("sku00018");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				screenCaja.setText(screenCaja.getText() + "\nChai: " + precio);
				total = total + Integer.parseInt(precio);
				productos[4] = productos[4] + 1;
			}
		});
		cb5.setBounds(10, 147, 89, 23);
		internalFrame1.getContentPane().add(cb5);

		JButton cb6 = new JButton("Chai vainilla");
		cb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cb6.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				String precio = "0";
				try {
					precio = conexion.consultaPrecio("sku00019");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				screenCaja.setText(screenCaja.getText() + "\nChai Vainilla: "
						+ precio);
				total = total + Integer.parseInt(precio);
				productos[5] = productos[5] + 1;
			}
		});
		cb6.setBounds(10, 181, 89, 23);
		internalFrame1.getContentPane().add(cb6);

		// Frame ventana Frappe

		JInternalFrame internalFrame2 = new JInternalFrame("Frappes");
		internalFrame2.setBounds(219, 109, 183, 348);
		frmCajero.getContentPane().add(internalFrame2);
		internalFrame2.getContentPane().setLayout(null);

		// Opciones de Frappe

		JButton fb1 = new JButton("Latte");
		fb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		fb1.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				String precio = "0";
				try {
					precio = conexion.consultaPrecio("sku00020");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				screenCaja.setText(screenCaja.getText() + "\nFrappe latte: "
						+ precio);
				total = total + Integer.parseInt(precio);
				productos[6] = productos[6] + 1;
			}
		});
		fb1.setBounds(10, 11, 89, 23);
		internalFrame2.getContentPane().add(fb1);

		JButton fb2 = new JButton("Moka");
		fb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		fb2.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				String precio = "0";
				try {
					precio = conexion.consultaPrecio("sku00021");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				screenCaja.setText(screenCaja.getText() + "\nFrappe Moka: "
						+ precio);
				total = total + Integer.parseInt(precio);

				productos[7] = productos[7] + 1;
			}
		});
		fb2.setBounds(10, 45, 89, 23);
		internalFrame2.getContentPane().add(fb2);

		JButton fb3 = new JButton("Vainilla");
		fb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		fb3.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				String precio = "0";
				try {
					precio = conexion.consultaPrecio("sku00022");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				screenCaja.setText(screenCaja.getText() + "\nFrappe Vainilla: "
						+ precio);
				total = total + Integer.parseInt(precio);

				productos[8] = productos[8] + 1;
			}
		});
		fb3.setBounds(10, 79, 89, 23);
		internalFrame2.getContentPane().add(fb3);

		JButton fb4 = new JButton("Caramelo");
		fb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		fb4.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				String precio = "0";
				try {
					precio = conexion.consultaPrecio("sku00023");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				screenCaja.setText(screenCaja.getText() + "\nFrappe Caramelo: "
						+ precio);
				total = total + Integer.parseInt(precio);
				productos[9] = productos[9] + 1;
			}
		});
		fb4.setBounds(10, 113, 89, 23);
		internalFrame2.getContentPane().add(fb4);

		JLabel lblEfectivo = new JLabel("Efectivo:");
		lblEfectivo.setBounds(604, 298, 62, 14);
		frmCajero.getContentPane().add(lblEfectivo);

		formattedTextField.setBounds(653, 295, 84, 20);
		frmCajero.getContentPane().add(formattedTextField);

		JButton btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancel.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				screenCaja.setText("Cafe la Negrita");
				total = 0;
				thot = 0;
				vaciarListaDeProductos();
			}
		});
		btnCancel.setBounds(653, 327, 89, 23);
		frmCajero.getContentPane().add(btnCancel);

		JButton btnRecib = new JButton("Imprimir recibo");
		btnRecib.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				System.out.println(screenCaja.getText());
				screenCaja.setText("Cafe la Negrita");
			}
		});
		btnRecib.setBounds(752, 327, 122, 23);
		frmCajero.getContentPane().add(btnRecib);

		// Visibilidad de los frames

		// internalFrame2.setVisible(false);
		// internalFrame1.setVisible(false);
		internalFrame1.setVisible(true);
		internalFrame2.setVisible(true);

	}

	public void pulso(int tecla) {

		System.out.println(tecla);
		switch (tecla) {

		case 99: // C
			System.out.println("Se ha precionado C");
			// internalFrame1.setVisible(true);
			break;
		case 112: // F
			System.out.println("Se ha precionado F");
			// internalFrame2.setVisible(true);
			break;

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

	public void vaciarListaDeProductos() {
		for (int x = 0; x <= 9; x++) {
			System.out.println("Cantidad de productos " + x + ": "
					+ productos[x]);

			switch (x) {
			case 0:
				while (productos[x] > 0) {
					System.out.println("borrando" + productos[x]);
					productos[x] = productos[x] - 1;
				}
				break;
				
				
			case 1:
				while (productos[x] > 0) {
					System.out.println("borrando" + productos[x]);
					productos[x] = productos[x] - 1;
				}
				break;	
				
				
			case 2:
				while (productos[x] > 0) {
					System.out.println("borrando" + productos[x]);
					productos[x] = productos[x] - 1;
				}
				break;
		
				
			case 3:
				while (productos[x] > 0) {
					System.out.println("borrando" + productos[x]);
					productos[x] = productos[x] - 1;
				}
				break;
				
				
			case 4:
				while (productos[x] > 0) {
					System.out.println("borrando" + productos[x]);
					productos[x] = productos[x] - 1;
				}
				break;
				
			case 5:
				while (productos[x] > 0) {
					System.out.println("borrando" + productos[x]);
					productos[x] = productos[x] - 1;
				}
				break;
				
			case 6:
				while (productos[x] > 0) {
					System.out.println("borrando" + productos[x]);
					productos[x] = productos[x] - 1;
				}
				break;
				
				
				
			case 7:
				while (productos[x] > 0) {
					System.out.println("borrando" + productos[x]);
					productos[x] = productos[x] - 1;
				}
				break;
				
				
				
			case 8:
				while (productos[x] > 0) {
					System.out.println("borrando" + productos[x]);
					productos[x] = productos[x] - 1;
				}
				break;
				
				
				
				
				
			case 9:
				while (productos[x] > 0) {
					System.out.println("borrando" + productos[x]);
					productos[x] = productos[x] - 1;
				}
				break;
				
				
				
				
			}

		}// fin for productos
		
	}
}
