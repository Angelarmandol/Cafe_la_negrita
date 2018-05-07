package paquetaxo;

import java.awt.Color;

import javax.swing.JFrame;

public class Ventanas {

	
	/**
	 * 
	 * Para agregar una ventana la clase se tinee que: 
	 * 
	 * 
	 * 1) extender a JFrame
	 * 
	 * public class Administracion extends JFrame{
		------------------------------------------------------------------------------
		2)cambiar todo el contenido de initialize()  a un metodo publico
		public void iniciar();
		---------------------------------------
		3)pasar todo el contenido de main a este medoto y que main quede asi:
		public static void main(String[] args) {}
		----------------------------------------------------		
		4)borrar el window.frame.setVisible(true); de el metodo run
		-----------------------------------------------
		5)hacer visible el JFrame abajo de la declaracion:
				
				
		frmAdministracion = new JFrame();
		frmAdministracion.setBackground(Color.GREEN);
		frmAdministracion.setTitle("Administracion");
		frmAdministracion.setBounds(100, 100, 612, 385);
		frmAdministracion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmAdministracion.setVisible(true);    <-------------------------------------------------------
	 * ------------------------------------
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	Administracion pantallaAdmin = new Administracion();
	EditarProducto PantallaEditar = new EditarProducto();
	Cajero pantallaCaja=new Cajero();
	
	
	
	public void mostrarPantallaAdmin(){
		pantallaAdmin.iniciar();
	}// fin de metodo de mostrar pantalla
	

	public void ocultarPantallaAdmin(){
		
		pantallaAdmin.setVisible(false);
	 
	}// fin de metodo de mostrar pantalla
	
	
	public void mostrarCajaRegis(){
		pantallaCaja.main(null);
	}
	
	public void ocultarPantallaCaja(){
		
	}
	
	
}
