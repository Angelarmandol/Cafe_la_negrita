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

public class Conexion {

	 
boolean login = false;
	public static Connection getConnection() {

		String user = "root";
		String password = "";
		String ruta = "jdbc:mysql://localhost:3306/mydb";
	 
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

 
	public void acceso(String codigoDeBarras) {

		String aux;
		Connection con = Conexion.getConnection();
		try {
			Statement st = con.createStatement();
			System.out.println("si");
			System.out.println(codigoDeBarras);

			ResultSet tabla = st
					.executeQuery("select * from admins where alumno_no_control =("
							+ codigoDeBarras + ")");
		 

		} catch (SQLException s) {
			System.out.println("Error al acceder");
			 

		}

	}

	static ResultSet registro = null;

	public static void generarArrays() throws SQLException {

	}

 

}