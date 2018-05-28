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

import javax.swing.JOptionPane;

public class Conexion {



	public static Connection getConnection() {

		String user = "Angel";
		String password = "muu295t";
		String ruta = "jdbc:mysql://localhost/proyecto";
	 
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

	public void consultas() throws IOException {
		String aux;
		Connection con = Conexion.getConnection();
		try {
			Statement st = con.createStatement();
			System.out.println("digite la matricula del alumno a consultar");
			aux = tcl.readLine();
			matricula = Integer.parseInt(aux);
			ResultSet tabla = st
					.executeQuery("select * from alumnos where matricula="
							+ matricula);
			if (tabla.next()) {
				System.out.println(" matricula: " + tabla.getInt("matricula")
						+ "\n");
				System.out.println("nombre: " + tabla.getString("nombre"));
				System.out.println("grupo: " + tabla.getFloat("grupo") + "\n");

			}
		} catch (SQLException e) {
			System.out.println("Error al consultar");
		 
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