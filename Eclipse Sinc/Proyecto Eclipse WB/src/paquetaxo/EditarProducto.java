package paquetaxo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;

public class EditarProducto {

	private JFrame frmEditarProducto;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarProducto window = new EditarProducto();
					window.frmEditarProducto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditarProducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditarProducto = new JFrame();
		frmEditarProducto.setTitle("Editar Producto");
		frmEditarProducto.setBounds(100, 100, 635, 407);
		frmEditarProducto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditarProducto.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
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
		table.setBounds(23, 72, 566, 286);
		frmEditarProducto.getContentPane().add(table);
	}

}
