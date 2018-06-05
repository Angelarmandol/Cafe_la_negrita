package paquetaxo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EditarInventario {

	private JFrame frmEditarProducto;
	public JTable table = new JTable();
	private JTextField textField;
	Conexion conexion = new Conexion();
	static DefaultTableModel model = new DefaultTableModel();
	static DefaultTableModel model2 = new DefaultTableModel();

	/**
	 * Launch the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {

		model2.addColumn("Ingrediente");
		model2.addColumn("cantidad");
		model2.addColumn("1");
		model2.addColumn("id");
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarInventario window = new EditarInventario();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public EditarInventario() {
		initailize();
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public void initailize() {

		frmEditarProducto = new JFrame();

		frmEditarProducto.setType(Type.UTILITY);
		frmEditarProducto.setTitle("Editar Inventario");
		frmEditarProducto.setBounds(100, 100, 635, 407);
		frmEditarProducto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditarProducto.getContentPane().setLayout(null);

		frmEditarProducto.setVisible(true);

		conexion.rellenarinventarioEditar();

		table.setBounds(23, 36, 566, 286);
		table.setModel(model2);
		frmEditarProducto.getContentPane().add(table);

		JLabel lblBuscar = new JLabel("Nombre del producto");
		lblBuscar.setBounds(23, 11, 126, 14);
		frmEditarProducto.getContentPane().add(lblBuscar);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent tecla) {

				model2.setRowCount(0);
				if (tecla.getKeyCode() == 10) {
					 
					String texto = null;
					texto= textField.getText();
					if (texto.equals(null) || texto.equals("")) {
						JOptionPane.showMessageDialog(null, "No se a escrito nada");
//					
					} else{
						
						if (textField.getText().equals("todo")){
							model2.setRowCount(0);
							conexion.todos();
							table.setModel(model2);
							System.out.println("Se mostrara todo/*/*/*");
						}
						System.out.println("TExto jfield:"+textField.getText());
						model2.setRowCount(0);
						conexion.BuscarParaeditar(textField.getText());
						table.setModel(model2);
					}
					
					
				}
				
				
				
			}
		});
		textField.setBounds(159, 8, 119, 20);
		frmEditarProducto.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				
				String texto = null;
				texto= textField.getText();
				if (texto.equals(null) || texto.equals("")) {
					JOptionPane.showMessageDialog(null, "No se a escrito nada");
//				
				} else{
					
					if (textField.getText().equals("todo")){
						model2.setRowCount(0);
						conexion.todos();
						table.setModel(model2);
						System.out.println("Se mostrara todo/*/*/*");
					}

					System.out.println("TExto jfield:"+textField.getText());
					model2.setRowCount(0);
					conexion.BuscarParaeditar(textField.getText());
					table.setModel(model2);
				}
			}
		});
		btnBuscar.setBounds(288, 7, 89, 23);
		frmEditarProducto.getContentPane().add(btnBuscar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				frmEditarProducto.setVisible(false);
			}
		});
		btnCancelar.setBounds(500, 333, 89, 23);
		frmEditarProducto.getContentPane().add(btnCancelar);

		JButton btnAceptar = new JButton("Aplicar cambios");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Object[] ids= new Object[model2.getRowCount()];
				System.out.println("TAmaño del modelo:" +model2.getRowCount());
				for(int i=0; i<model2.getRowCount(); i++){
					
					ids[i]=model2.getValueAt(i, 3);
					System.out.println("ids: "+ids[i]);
				}
				
				
				System.out.println("nombre: "+model2.getValueAt(0, 0));
				System.out.println("in1: "+model2.getValueAt(0, 1));
				System.out.println("in2: "+model2.getValueAt(0, 2));
				conexion.editar(model2, ids, model2.getRowCount());
			 
				
			}
		});
		btnAceptar.setBounds(364, 333, 126, 23);
		frmEditarProducto.getContentPane().add(btnAceptar);

		
		
		
	}
}
