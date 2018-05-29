package paquetaxo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Conexion {


	Statement st;
	ResultSet rs;
boolean login = false;
	public static Connection getConnection() {

		String user = "root";
		String password = "";
		String ruta = "jdbc:mysql://localhost:3306/negrita";
	 
		try {
			Class.forName("com.mysql.jdbc.Driver"); // se carga el driver

			return DriverManager.getConnection(ruta, user, password);

		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver");
		 
 

		} catch (SQLException e) {
			System.out.println("Error en al conexion con XAMPP");
		 
		}

	 

		return null;

	}

	BufferedReader tcl = new BufferedReader(new InputStreamReader(System.in));

	int matricula;
	String nombre, grupo;
	public boolean seEncontro;

	public void altas() throws IOException {
		Connection con = Conexion.getConnection();

		try {
			PreparedStatement pstmt = con
					.prepareStatement("insert into productos(id_producto, nombre,presio,grupo)values(?,?,?)");

			System.out.println("nombre del alumno:");
			nombre = tcl.readLine();
			System.out.println("matricula del alumno:");
			matricula = Integer.parseInt(tcl.readLine());
			System.out.println("grupo del alumno:");
			grupo = tcl.readLine();

			pstmt.setString(1, nombre);
			pstmt.setInt(2, matricula);
			pstmt.setString(3, grupo);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("ocurrio algun error");
	

		}

	}

	public void mostrar() {

	}

	public void borrar() {
		Connection con = Conexion.getConnection();
		try {
			PreparedStatement pstmt = con
					.prepareStatement("delete from alumnos where matricula=?");

			pstmt.setString(1, nombre);
			pstmt.setInt(2, matricula);
			pstmt.setString(3, grupo);
			pstmt.executeUpdate();
			pstmt.executeUpdate();

			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("ocurrio un error");
	 
		}
	}

	public void modificar() {
		Connection con = Conexion.getConnection();
		try {
			PreparedStatement pstmt = con
					.prepareStatement("update alumnos set nombre, matricula=? where grupo");

			pstmt.setString(1, nombre);
			pstmt.setInt(2, matricula);
			pstmt.setString(3, grupo);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("ocurrio un error");
			 
		}
	}

	public void consultas(String consulta) throws SQLException  {
		Statement st = this.getConnection().createStatement();
		ResultSet rs = st.executeQuery(consulta);
		while (rs.next())
		{
		   System.out.println("nombre="+rs.getObject("Usuario"));
		}
		rs.close();
		
		
	}
	
	public void login(String nom, String pass, int tipo) throws SQLException {
		
		Statement st = this.getConnection().createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM usuarios");
		
		if(tipo==1) {
			System.out.println("es tipo 1");
		
		while (rs.next())
		{
			
			
			if(rs.getObject("Usuario").equals(nom)) {
			
		  if(rs.getObject("Pass").equals(pass)) {
			  System.out.println("Si es");
			login = true;
		  }else {
			  if(!login)
			  login = false;
			  System.out.println("No es");
		  }
		  
		  
			}
		  
		}
		 
		}else {
			 
			while (rs.next())
			{
				
				if(rs.getObject("Usuario").equals(nom)) {
				
			  if(rs.getObject("Pass").equals(pass)) {
				  login = true;
			  }else {
				  if(!login){
				  login = false;
				  }
			  }
			  
				}else {
					
				}
			  
			  
			}
			
			
		}
		 
		 
	 
		
	}

 
	public void consultaDeUsuarios() throws SQLException {




		System.out.println("Se muestra tabla");
		
		
		
		
		Administracion.model.addColumn("ingredientes");
		Administracion.model.addColumn("cantidad");
		
		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM usuarios");
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Entra while");
			while (rs.next())
			{
				System.out.println("primer while");
			   // Se crea un array que será una de las filas de la tabla.
			   Object [] fila = new Object[2]; // Hay tres columnas en la tabla

			   // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
			   for (int i=0;i<2;i++) {
			      fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
			   System.out.println("se insertara: "+fila[i]);
			   }
			   // Se añade al modelo la fila completa.
			   Administracion.model.addRow(fila);
			    
			   
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	
	
		
	
	}

	static ResultSet registro = null;

	public static void generarArrays() throws SQLException {

	}

	public void rellenarInventario() {


		System.out.println("Se muestra tabla");
		
	
		Administracion.model.addColumn("ingredientes");
		Administracion.model.addColumn("cantidad");
		
		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM inventario");
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Entra while");
			while (rs.next())
			{
				System.out.println("primer while");
			   // Se crea un array que será una de las filas de la tabla.
			   Object [] fila = new Object[2]; // Hay tres columnas en la tabla

			   // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
			   for (int i=0;i<2;i++) {
			      fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
			   System.out.println("se insertara: "+fila[i]);
			   }
			   // Se añade al modelo la fila completa.
			   Administracion.model.addRow(fila);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	
	
		
	}

 

}