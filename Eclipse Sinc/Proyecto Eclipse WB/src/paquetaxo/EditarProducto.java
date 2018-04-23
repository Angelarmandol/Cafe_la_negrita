package paquetaxo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class EditarProducto {

	private JFrame frmEditarProducto;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {}

	/**
	 * Create the application.
	 */
	public EditarProducto() {
		initialize();
	}

	
	public void test(){
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarProducto window = new EditarProducto();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		frmEditarProducto = new JFrame();
		frmEditarProducto.setType(Type.UTILITY);
		frmEditarProducto.setTitle("Editar Producto");
		frmEditarProducto.setBounds(100, 100, 635, 407);
		frmEditarProducto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditarProducto.getContentPane().setLayout(null);
		
		frmEditarProducto.setVisible(true);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(23, 36, 566, 286);
		frmEditarProducto.getContentPane().add(table);
		
		JLabel lblBuscar = new JLabel("Nombre del producto");
		lblBuscar.setBounds(23, 11, 126, 14);
		frmEditarProducto.getContentPane().add(lblBuscar);
		
		textField = new JTextField();
		textField.setBounds(159, 8, 119, 20);
		frmEditarProducto.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(288, 7, 89, 23);
		frmEditarProducto.getContentPane().add(btnBuscar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(500, 333, 89, 23);
		frmEditarProducto.getContentPane().add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aplicar cambios");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAceptar.setBounds(364, 333, 126, 23);
		frmEditarProducto.getContentPane().add(btnAceptar);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
	}
}
