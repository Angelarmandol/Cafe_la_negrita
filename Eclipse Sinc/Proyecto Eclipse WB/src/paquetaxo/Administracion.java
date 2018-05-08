package paquetaxo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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


public class Administracion extends JFrame{

	private JFrame frmAdministracion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {}

	/**
	 * Create the application.
	 */
	
	public void iniciar(){
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administracion window = new Administracion();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		
		frmAdministracion = new JFrame();
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
		mnEditar.add(mntmProducto);
		
		JMenu mnBaseDeDatos = new JMenu("Base de datos");
		menuBar.add(mnBaseDeDatos);
		
		JMenuItem mntmAbirConsulta = new JMenuItem("Abir consulta");
		mnBaseDeDatos.add(mntmAbirConsulta);
		
		JMenuItem mntmGrafica = new JMenuItem("Grafica");
		mnBaseDeDatos.add(mntmGrafica);
		
		JMenu mnHerramientas = new JMenu("Herramientas");
		menuBar.add(mnHerramientas);
		
		JMenuItem mntmConfiguracion = new JMenuItem("Configuracion");
		mnHerramientas.add(mntmConfiguracion);
		
		JMenuItem mntmCalculadora = new JMenuItem("Calculadora");
		mnHerramientas.add(mntmCalculadora);
	}
	public Administracion() {

	}

	/**
	 * Initialize the contents of the frame.
	
	private void initialize() {
	}
*/
}
