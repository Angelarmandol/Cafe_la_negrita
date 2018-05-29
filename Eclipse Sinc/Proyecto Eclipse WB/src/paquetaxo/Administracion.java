package paquetaxo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import java.awt.FlowLayout;
import java.awt.CardLayout;

public class Administracion extends JFrame {

	Conexion conexion = new Conexion();
	public JFrame frmAdministracion = new JFrame();
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	EditarProducto ep = new EditarProducto();
	static DefaultTableModel model = new DefaultTableModel();
	 public static JTable table_3 = new JTable(model);

 
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */

	public static void main(String[] args) {
		
		model.addColumn("ingredientes");
		model.addColumn("cantidad");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administracion window = new Administracion();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void initialize() {

		
		frmAdministracion.setBackground(Color.GREEN);
		frmAdministracion.setTitle("Administracion");
		frmAdministracion.setBounds(100, 100, 612, 385);
		frmAdministracion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frmAdministracion.setVisible(true);

		JMenuBar menuBar = new JMenuBar();
		frmAdministracion.setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		JMenuItem mntmCajero = new JMenuItem("Cajero");
		mnArchivo.add(mntmCajero);

		JMenu mnGenerar = new JMenu("Generar");
		mnArchivo.add(mnGenerar);

		JMenuItem mntmReporte = new JMenuItem("Reporte diario");
		mnGenerar.add(mntmReporte);

		JMenuItem mntmReporteDeInventario = new JMenuItem("Reporte de inventario");
		mnGenerar.add(mntmReporteDeInventario);

		JMenuItem mntmCerrar = new JMenuItem("Cerrar");
		mnArchivo.add(mntmCerrar);

		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);

		JMenuItem mntmProducto = new JMenuItem("Producto");
		mntmProducto.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
			ep.initailize();
			}
		});
		mnEditar.add(mntmProducto);

		JMenu mnBaseDeDatos = new JMenu("Base de datos");
		menuBar.add(mnBaseDeDatos);

		JMenuItem mntmAbirConsulta = new JMenuItem("Abir consulta de Ingredientes");
		mntmAbirConsulta.addMenuKeyListener(new MenuKeyListener() {
			public void menuKeyPressed(MenuKeyEvent arg0) {
				
				
				
				
			}
			public void menuKeyReleased(MenuKeyEvent arg0) {
			}
			public void menuKeyTyped(MenuKeyEvent arg0) {
			}
		});
		frmAdministracion.getContentPane().setLayout(new CardLayout(0, 0));
		
		
	
		
		table_3.setEnabled(false);
		frmAdministracion.getContentPane().add(table_3, "name_20068091752040");
		
		 
		
		
		mntmAbirConsulta.addMouseListener(new MouseAdapter() {
			 
		public void mousePressed(MouseEvent ar0){
			model.setRowCount(0);
			conexion.rellenarInventario();
			frmAdministracion.getContentPane().setEnabled(false);
		}
			
		
		});
		mnBaseDeDatos.add(mntmAbirConsulta);
		
		JMenuItem mntmAbrirConsultaUsuarios = new JMenuItem("Abrir consulta Usuarios");
		mntmAbrirConsultaUsuarios.addMouseListener(new MouseAdapter() {
		 
			public void mousePressed(MouseEvent arg0) {
				

				
				try {
					model.setRowCount(0);
					conexion.consultaDeUsuarios();
					frmAdministracion.getContentPane().setEnabled(false);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				
			}
		});
		mnBaseDeDatos.add(mntmAbrirConsultaUsuarios);

		JMenuItem mntmGrafica = new JMenuItem("Grafica");
		mntmGrafica.addMouseListener(new MouseAdapter() {
	 
			public void mousePressed(MouseEvent arg0) {
				System.out.println("Entra grafica");
			}
		});
		mnBaseDeDatos.add(mntmGrafica);

		JMenu mnHerramientas = new JMenu("Herramientas");
		menuBar.add(mnHerramientas);

		JMenuItem mntmConfiguracion = new JMenuItem("Configuracion");
		mnHerramientas.add(mntmConfiguracion);

		JMenuItem mntmCalculadora = new JMenuItem("Calculadora");
		mnHerramientas.add(mntmCalculadora);
		
		

	}

	public Administracion() {
		initialize();
	}

}
