package paquetaxo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

	private Connection conexion;
	private Statement sentencia;
	private final String controlador;
	private final String nombre_bd;
	private final String usuarioBD;
	private final String passwordBD;

	public Conexion() {

		this.controlador = "sun.jdbc.odbc.JdbcOdbcDriver";
		this.nombre_bd = "C:\\Users\\Inspiron3647\\Documents\\GitHub\\Cafe_la_negrita\\Eclipse Sinc\\Database1.accdb";
		this.usuarioBD = "";
		this.passwordBD = "";

	}

	public boolean EstablecerConexion() throws SQLException {

		try {

			conexion = DriverManager.getConnection("jdbc:ucanaccess://"
					+ this.nombre_bd, this.usuarioBD, this.passwordBD);

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null,
					"Error al realizar la conexion " + e);

			return false;

		}

		try {

			this.sentencia = this.conexion.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY);

		}

		catch (SQLException e) {

			JOptionPane.showMessageDialog(null,
					"Error al crear el objeto sentencia " + e);

			return false;

		}

		return true;

	}

	public ResultSet EjecutarSentencia(String sql) throws SQLException {

		ResultSet rs;
		rs = this.sentencia.executeQuery(sql);
		return rs;

	}

}