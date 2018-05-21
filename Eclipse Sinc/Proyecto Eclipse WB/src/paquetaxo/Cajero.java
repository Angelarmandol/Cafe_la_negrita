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
import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;

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
	private void initialize() {
		frmCajero = new JFrame();
		frmCajero.setEnabled(true);
		
		frmCajero.setResizable(false);
	
		
		
	
		frmCajero.setTitle("Cajero");
		frmCajero.setBounds(100, 100, 890, 530);
		frmCajero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCajero.getContentPane().setLayout(null);
		
		JLabel lblImgcajero = new JLabel("imgcajero");
		lblImgcajero.setBounds(790, 0, 84, 80);
		lblImgcajero.setIcon(new ImageIcon("C:\\Users\\neko_\\Documents\\GitHub\\Cafe_la_negrita\\Eclipse Sinc\\Imagenes\\cafenegrita.png"));
		frmCajero.getContentPane().add(lblImgcajero);
		
		//Cuadro de operacion
		
		JTextPane txtpnPruebaDeCaja = new JTextPane();
		txtpnPruebaDeCaja.setEnabled(false);
		txtpnPruebaDeCaja.setBounds(577, 87, 254, 172);
		txtpnPruebaDeCaja.setText("Prueba de caja\r\nproducto prueba $23.90\r\niva %16\r\ntotal: $72.50\r\nRecibe: $100.00\r\ncambio: 27.50");
		frmCajero.getContentPane().add(txtpnPruebaDeCaja);
		
		JButton subTot = new JButton("SubTotal");
		subTot.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		subTot.setBounds(577, 29, 89, 23);
		frmCajero.getContentPane().add(subTot);
		
		JButton tot = new JButton("T[o]tal");
		tot.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		tot.setBounds(676, 29, 89, 23);
		frmCajero.getContentPane().add(tot);
		
		JButton caff = new JButton("[C]afe");
		caff.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		
		
		
		caff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//textPane.setText(textPane.getText()+"Puto \n");
				
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
		polv.setBounds(142, 75, 89, 23);
		frmCajero.getContentPane().add(polv);
		
		JButton t3 = new JButton("[T]\u00E9");
		t3.addKeyListener(new KeyAdapter() {
		 
			public void keyPressed(KeyEvent arg0) {
				pulso(arg0.getKeyChar());
			}
		});
		t3.setBounds(297, 75, 89, 23);
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
		esen.setBounds(447, 75, 89, 23);
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
		
		JLabel lblDeLaCasa = new JLabel("De la casa");
		lblDeLaCasa.setBounds(10, 109, 89, 14);
		frmCajero.getContentPane().add(lblDeLaCasa);
		
		JList cafelist1 = new JList();
		cafelist1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Mezcla de la casa"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		cafelist1.setBounds(10, 131, 110, 23);
		frmCajero.getContentPane().add(cafelist1);
		
		JLabel lblNewLabel = new JLabel("Escencias");
		lblNewLabel.setBounds(10, 165, 68, 14);
		frmCajero.getContentPane().add(lblNewLabel);
		
		JList cafelist2 = new JList();
		cafelist2.setModel(new AbstractListModel() {
			String[] values = new String[] {"Crema Irlandesa", "Vainilla", "Canela", "Avellana"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		cafelist2.setBounds(10, 190, 110, 69);
		frmCajero.getContentPane().add(cafelist2);
		
		JLabel lblNewLabel_1 = new JLabel("Regionales");
		lblNewLabel_1.setBounds(10, 270, 89, 14);
		frmCajero.getContentPane().add(lblNewLabel_1);
		
		JList cafelist3 = new JList();
		cafelist3.setModel(new AbstractListModel() {
			String[] values = new String[] {"Veracruz", "Chiapas", "Oaxaca"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		cafelist3.setBounds(10, 295, 84, 54);
		frmCajero.getContentPane().add(cafelist3);
		
		JLabel lblNewLabel_2 = new JLabel("Suave");
		lblNewLabel_2.setBounds(142, 109, 46, 14);
		frmCajero.getContentPane().add(lblNewLabel_2);
		
		JList polvolist1 = new JList();
		polvolist1.setModel(new AbstractListModel() {
			String[] values = new String[] {"French Vanilla Suprem", "Tahitian Vainilla", "White Chocolate", "Caffe Latte", "Cookies and cream"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		polvolist1.setBounds(142, 131, 130, 87);
		frmCajero.getContentPane().add(polvolist1);
		
		JLabel lblDulce = new JLabel("Dulce");
		lblDulce.setBounds(142, 229, 46, 14);
		frmCajero.getContentPane().add(lblDulce);
		
		JList polvolist2 = new JList();
		polvolist2.setModel(new AbstractListModel() {
			String[] values = new String[] {"Irish Cream", "White Chocolate Caramel", "Hazelnut"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		polvolist2.setBounds(142, 254, 145, 54);
		frmCajero.getContentPane().add(polvolist2);
		
		JLabel lblIntenso = new JLabel("Intenso");
		lblIntenso.setBounds(142, 314, 57, 14);
		frmCajero.getContentPane().add(lblIntenso);
		
		JList polvolist3 = new JList();
		polvolist3.setModel(new AbstractListModel() {
			String[] values = new String[] {"Mexican Spiced Mix", "Mocha", "Vanilla Chai", "Precious Divinity"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		polvolist3.setBounds(142, 342, 130, 69);
		frmCajero.getContentPane().add(polvolist3);
		
		JLabel lblSuave = new JLabel("Suave");
		lblSuave.setBounds(297, 109, 46, 14);
		frmCajero.getContentPane().add(lblSuave);
		
		JList telist1 = new JList();
		telist1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Manzana de rooibos", "Apple jubilee herb tea", "Enchanted moments", "Spicy orange delight", "Lively Lemon"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		telist1.setBounds(297, 131, 130, 87);
		frmCajero.getContentPane().add(telist1);
		
		JLabel lblIntenso_1 = new JLabel("Intenso");
		lblIntenso_1.setBounds(297, 229, 57, 14);
		frmCajero.getContentPane().add(lblIntenso_1);
		
		JList telist2 = new JList();
		telist2.setModel(new AbstractListModel() {
			String[] values = new String[] {"Te negro", "Te verde"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		telist2.setBounds(297, 258, 68, 40);
		frmCajero.getContentPane().add(telist2);
		
		JLabel lblAfrutados = new JLabel("Afrutados");
		lblAfrutados.setBounds(447, 109, 68, 14);
		frmCajero.getContentPane().add(lblAfrutados);
		
		JList esenlist1 = new JList();
		esenlist1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Manzana", "Platano", "Kiwi", "Frambuesa", "Fresa", "Fruta de la pasion", "Mango"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		esenlist1.setBounds(447, 131, 116, 128);
		frmCajero.getContentPane().add(esenlist1);
		
		JLabel lblNewLabel_3 = new JLabel("Plantas y Frutos");
		lblNewLabel_3.setBounds(447, 270, 99, 14);
		frmCajero.getContentPane().add(lblNewLabel_3);
		
		JList esenlist2 = new JList();
		esenlist2.setModel(new AbstractListModel() {
			String[] values = new String[] {"Almendra", "Avellana", "Cafe", "Vainilla", "Menta"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		esenlist2.setBounds(447, 288, 74, 87);
		frmCajero.getContentPane().add(esenlist2);
		
		JLabel lblEspeciales = new JLabel("Especiales");
		lblEspeciales.setBounds(447, 384, 74, 14);
		frmCajero.getContentPane().add(lblEspeciales);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Crema irlandesa", "Caramelo"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(447, 409, 99, 46);
		frmCajero.getContentPane().add(list);
		
		
	
	}
	
	public void pulso(int tecla){
		System.out.println(tecla);
		switch(tecla){
		
		case 99: //C
			System.out.println("Se ha precionado C");
			
			//textPane.setText(textPane.getText()+"Puto \n");
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
