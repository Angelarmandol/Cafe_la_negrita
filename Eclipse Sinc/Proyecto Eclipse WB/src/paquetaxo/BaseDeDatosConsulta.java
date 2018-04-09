package paquetaxo;

import java.awt.EventQueue;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class BaseDeDatosConsulta {

	private JFrame frmBaseDeDatosConsulta;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseDeDatosConsulta window = new BaseDeDatosConsulta();
					window.frmBaseDeDatosConsulta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BaseDeDatosConsulta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBaseDeDatosConsulta = new JFrame();
		frmBaseDeDatosConsulta.setType(Type.UTILITY);
		frmBaseDeDatosConsulta.setTitle("Editar Producto");
		frmBaseDeDatosConsulta.setBounds(100, 100, 635, 407);
		frmBaseDeDatosConsulta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBaseDeDatosConsulta.getContentPane().setLayout(null);
		
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
		table.setBounds(23, 36, 566, 111);
		frmBaseDeDatosConsulta.getContentPane().add(table);
		
		JLabel lblBuscar = new JLabel("Nombre del producto");
		lblBuscar.setBounds(23, 11, 126, 14);
		frmBaseDeDatosConsulta.getContentPane().add(lblBuscar);
		
		textField = new JTextField();
		textField.setBounds(159, 8, 119, 20);
		frmBaseDeDatosConsulta.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(288, 7, 89, 23);
		frmBaseDeDatosConsulta.getContentPane().add(btnBuscar);
		
		JButton btnCancelar = new JButton("Cerrar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(500, 333, 89, 23);
		frmBaseDeDatosConsulta.getContentPane().add(btnCancelar);
		
		JLabel lblFresa = new JLabel("fresa");
		lblFresa.setIcon(new ImageIcon("C:\\Users\\Angel\\Desktop\\fresa.jpg"));
		lblFresa.setBounds(37, 179, 217, 177);
		frmBaseDeDatosConsulta.getContentPane().add(lblFresa);
		
		JLabel lblTest = new JLabel("Test");
		lblTest.setBounds(288, 179, 46, 14);
		frmBaseDeDatosConsulta.getContentPane().add(lblTest);
		
		JLabel lblTest_1 = new JLabel("Test");
		lblTest_1.setBounds(288, 204, 46, 14);
		frmBaseDeDatosConsulta.getContentPane().add(lblTest_1);
		
		JLabel lblTest_2 = new JLabel("Test");
		lblTest_2.setBounds(288, 227, 46, 14);
		frmBaseDeDatosConsulta.getContentPane().add(lblTest_2);
		
		JLabel lblTest_3 = new JLabel("Test");
		lblTest_3.setBounds(288, 252, 46, 14);
		frmBaseDeDatosConsulta.getContentPane().add(lblTest_3);
	}

}
