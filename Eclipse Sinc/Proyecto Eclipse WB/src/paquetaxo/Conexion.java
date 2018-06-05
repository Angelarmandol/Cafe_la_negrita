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

	public void consultas(String consulta) throws SQLException {
		Statement st = this.getConnection().createStatement();
		ResultSet rs = st.executeQuery(consulta);
		while (rs.next()) {
			System.out.println("nombre=" + rs.getObject("Usuario"));
		}
		rs.close();

	}

	public String consultaPrecio(String sku) throws SQLException {
		Object ret = null;
		Statement st = this.getConnection().createStatement();
		ResultSet rs = st
				.executeQuery("SELECT * FROM `productos` WHERE `id_Producto` = '"
						+ sku + "'");
		while (rs.next()) {
			System.out.println("El precio de " + sku + " es: "
					+ rs.getObject("precioPesos"));
			ret = rs.getObject("precioPesos");
		}

		rs.close();
		return ret.toString();

	}

	public void restarUnidades(String sku, int cantidad) {
		// UPDATE `inventario` SET `cantidad`=cantidad-10 WHERE `id_Ingrediente`
		// = "sku00001";

		Connection con = Conexion.getConnection();
		try {

			PreparedStatement pstmt = con
					.prepareStatement("UPDATE `inventario` SET `cantidad` = `cantidad`-"
							+ cantidad
							+ " WHERE `id_Ingrediente` = '"
							+ sku
							+ "';");

			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("ocurrio un error");

		}

	}

	public void login(String nom, String pass, int tipo) throws SQLException {

		Statement st = this.getConnection().createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM usuarios");

		if (tipo == 1) {
			System.out.println("es tipo 1");

			while (rs.next()) {

				if (rs.getObject("Usuario").equals(nom)) {

					if (rs.getObject("Pass").equals(pass)) {
						System.out.println("Si es");
						login = true;
					} else {
						if (!login)
							login = false;
						System.out.println("No es");
					}

				}

			}

		} else {

			while (rs.next()) {

				if (rs.getObject("Usuario").equals(nom)) {

					if (rs.getObject("Pass").equals(pass)) {
						login = true;
					} else {
						if (!login) {
							login = false;
						}
					}

				} else {

				}

			}

		}

	}

	public void consultaDeUsuarios() throws SQLException {

		System.out.println("Se muestra tabla");

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM usuarios");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

			if (Administracion.modelUsuarios.getColumnCount() < 2) {
				Administracion.modelUsuarios.addColumn("putosUsuarios");
				Administracion.modelUsuarios.addColumn("putosskus");
			}

			System.out.println("Entra while");
			while (rs.next()) {
				System.out.println("primer while");
				// Se crea un array que será una de las filas de la tabla.
				Object[] fila = new Object[2]; // Hay tres columnas en la tabla

				// Se rellena cada posición del array con una de las columnas de
				// la tabla en base de datos.
				for (int i = 0; i < 2; i++) {
					fila[i] = rs.getObject(i + 1); // El primer indice en rs es
													// el 1, no el cero, por eso
													// se suma 1.
					System.out.println("se insertara: " + fila[i]);
				}
				// Se añade al modelo la fila completa.
				Administracion.modelUsuarios.addRow(fila);

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

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM inventario");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

			if (Administracion.modelUsuarios.getColumnCount() < 2) {
				Administracion.modelUsuarios.addColumn("putosUsuarios");
				Administracion.modelUsuarios.addColumn("putosskus");
			}

			System.out.println("Entra while");
			while (rs.next()) {
				System.out.println("primer while");
				// Se crea un array que será una de las filas de la tabla.
				Object[] fila = new Object[2]; // Hay tres columnas en la tabla

				// Se rellena cada posición del array con una de las columnas de
				// la tabla en base de datos.
				for (int i = 0; i < 2; i++) {
					fila[i] = rs.getObject(i + 1); // El primer indice en rs es
													// el 1, no el cero, por eso
													// se suma 1.
					System.out.println(" se insertara: " + fila[i]);
				}
				// Se añade al modelo la fila completa.
				Administracion.modelUsuarios.addRow(fila);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void rellenarProductos() {

		System.out.println("Se muestra tabla");

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM productos");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("Entra while");

			while (rs.next()) {
				System.out.println("primer while");
				// Se crea un array que será una de las filas de la tabla.
				Object[] fila = new Object[5]; // Hay tres columnas en la tabla

				// Se rellena cada posición del array con una de las columnas de
				// la tabla en base de datos.
				for (int i = 0; i < 5; i++) {
					fila[i] = rs.getObject(i + 1); // El primer indice en rs es
													// el 1, no el cero, por eso
													// se suma 1.
					System.out.println("se insertara: " + fila[i]);
				}
				// Se añade al modelo la fila completa.
				Administracion.model.addRow(fila);

				System.out.println("total de rows: "
						+ Administracion.model.getColumnCount());
				// Administracion.model.addColumn(null);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// fin rellenar productos

	public void rellenarinventarioEditar() {

		System.out.println("Se muestra tabla");

		EditarInventario.model.addColumn("ufffff papà");
		EditarInventario.model
				.addColumn("pero mira como esta ese consumo de memoria innecesario");
		EditarInventario.model.addColumn(" y me vale verga sigo comentando");
		EditarInventario.model
				.addColumn("ponte a programar en vez de andar copiando codigo de github");
		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM inventario ");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Entra while");
			while (rs.next()) {
				System.out.println("primer while");
				// Se crea un array que será una de las filas de la tabla.
				Object[] fila = new Object[4]; // Hay tres columnas en la tabla

				// Se rellena cada posición del array con una de las columnas de
				// la tabla en base de datos.
				for (int i = 0; i < 4; i++) {
					fila[i] = rs.getObject(i + 1); // El primer indice en rs es
													// el 1, no el cero, por eso
													// se suma 1.
					System.out.println("se insertara: " + fila[i]);
				}
				// Se añade al modelo la fila completa.
				EditarInventario.model.addRow(fila);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void rellenarProductoEditar() {

		System.out.println("Se muestra tabla");

		EditarProducto.model.addColumn("ufffff papà");
		EditarProducto.model
				.addColumn("pero mira como esta ese consumo de memoria innecesario");
		EditarProducto.model.addColumn(" y me vale verga sigo comentando");
		EditarProducto.model
				.addColumn("ponte a programar en vez de andar copiando codigo de github");
		EditarProducto.model.addColumn("puto");
		EditarProducto.model.addColumn("puto");
		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM productos ");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Entra while");
			while (rs.next()) {
				System.out.println("primer while");
				// Se crea un array que será una de las filas de la tabla.
				Object[] fila = new Object[5]; // Hay tres columnas en la tabla

				// Se rellena cada posición del array con una de las columnas de
				// la tabla en base de datos.
				for (int i = 0; i < 5; i++) {
					fila[i] = rs.getObject(i + 1); // El primer indice en rs es
													// el 1, no el cero, por eso
													// se suma 1.
					System.out.println("  se insertara: " + fila[i]);
				}
				// Se añade al modelo la fila completa.
				EditarProducto.model.addRow(fila);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void BuscarParaeditar(String busqueda) {

		System.out.println("Se muestra tabla");

		if (busqueda.equals("todo")) {
			System.out.println("se va amostrarrrr");

			try {
				st = this.getConnection().createStatement();
				rs = st.executeQuery("SELECT * FROM `inventario` WHERE 1");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				System.out.println("Entra while");
				while (rs.next()) {
					System.out.println("primer while");
					// Se crea un array que será una de las filas de la tabla.
					Object[] fila = new Object[4]; // Hay tres columnas en la
													// tabla

					// Se rellena cada posición del array con una de las
					// columnas de
					// la tabla en base de datos.
					for (int i = 0; i < 4; i++) {
						fila[i] = rs.getObject(i + 1); // El primer indice en rs
														// es
														// el 1, no el cero, por
														// eso
														// se suma 1.
						System.out.println("//Inventaio se insertara: "
								+ fila[i]);
					}
					// Se añade al modelo la fila completa.
					EditarInventario.model2.addRow(fila);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			try {
				st = this.getConnection().createStatement();
				rs = st.executeQuery("SELECT * FROM `inventario` WHERE ingredientes LIKE '%"
						+ busqueda + "%' ");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				System.out.println("Entra while");
				while (rs.next()) {
					System.out.println("primer while");
					// Se crea un array que será una de las filas de la tabla.
					Object[] fila = new Object[4]; // Hay tres columnas en la
													// tabla

					// Se rellena cada posición del array con una de las
					// columnas de
					// la tabla en base de datos.
					for (int i = 0; i < 4; i++) {
						fila[i] = rs.getObject(i + 1); // El primer indice en rs
														// es
														// el 1, no el cero, por
														// eso
														// se suma 1.
						System.out.println("se insertara: " + fila[i]);
					}
					// Se añade al modelo la fila completa.
					EditarInventario.model2.addRow(fila);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void BuscarParaEditarProductos(String busqueda) {

		if (EditarProducto.model2.getColumnCount() < 6) {
			while (EditarProducto.model2.getColumnCount() < 5) {
				System.out.println("-------------- E count es:"
						+ EditarProducto.model2.getColumnCount());
				EditarProducto.model2.addColumn("puto");
			}
		}
		System.out.println("Se muestra tabla");

		if (busqueda.equals("todo")) {
			System.out.println("se va amostrarrrr");

			try {
				st = this.getConnection().createStatement();
				rs = st.executeQuery("SELECT * FROM `productos` WHERE 1");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
		
				while (rs.next()) {
					
					// Se crea un array que será una de las filas de la tabla.
					Object[] fila = new Object[5]; // Hay tres columnas en la
													// tabla

					// Se rellena cada posición del array con una de las
					// columnas de
					// la tabla en base de datos.
					for (int i = 0; i < 5; i++) {
						fila[i] = rs.getObject(i + 1); // El primer indice en rs
														// es
														// el 1, no el cero, por
														// eso
														// se suma 1.
						System.out.println("Productos // se insertara: "
								+ fila[i]);
					}
					// Se añade al modelo la fila completa.
					EditarProducto.model2.addRow(fila);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			try {

				st = this.getConnection().createStatement();
				rs = st.executeQuery("SELECT * FROM `productos` WHERE nombre LIKE '%"
						+ busqueda + "%' ");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				System.out.println("Entra while");
				while (rs.next()) {
					System.out.println("primer while");
					// Se crea un array que será una de las filas de la tabla.
					Object[] fila = new Object[5]; // Hay tres columnas en la
													// tabla

					// Se rellena cada posición del array con una de las
					// columnas del
					// la tabla en base de datos.
					for (int i = 0; i < 5; i++) {
						fila[i] = rs.getObject(i + 1); // El primer indice en rs
														// es
														// el 1, no el cero, por
														// eso
														// se suma 1.
						System.out.println(" 5 se insertara: " + fila[i]);
					}
					// Se añade al modelo la fila completa.
					EditarProducto.model2.addRow(fila);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void todos() {

		System.out.println("Se muestra tabla");

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM `inventario` WHERE 1");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Entra while");
			while (rs.next()) {
				System.out.println("primer while");
				// Se crea un array que será una de las filas de la tabla.
				Object[] fila = new Object[4]; // Hay tres columnas en la tabla

				// Se rellena cada posición del array con una de las columnas de
				// la tabla en base de datos.
				for (int i = 0; i < 4; i++) {
					fila[i] = rs.getObject(i + 1); // El primer indice en rs es
													// el 1, no el cero, por eso
													// se suma 1.
					System.out.println(" se insertara: " + fila[i]);
				}
				// Se añade al modelo la fila completa.
				EditarInventario.model2.addRow(fila);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void todosProductos() {

		System.out.println("Se muestra tabla");

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM `productos` WHERE 1");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Entra while");
			while (rs.next()) {
				System.out.println("primer while");
				// Se crea un array que será una de las filas de la tabla.
				Object[] fila = new Object[4]; // Hay tres columnas en la tabla

				// Se rellena cada posición del array con una de las columnas de
				// la tabla en base de datos.
				for (int i = 0; i < 4; i++) {
					fila[i] = rs.getObject(i + 1); // El primer indice en rs es
													// el 1, no el cero, por eso
													// se suma 1.
					System.out.println(" se insertara: " + fila[i]);
				}
				// Se añade al modelo la fila completa.
				EditarProducto.model2.addRow(fila);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void editar(DefaultTableModel modelo, Object[] ids, int longitud) {

		Connection con = Conexion.getConnection();
		try {
			for (int x = 0; x < longitud; x++) {
				PreparedStatement pstmt = con
						.prepareStatement("UPDATE `inventario` SET `ingredientes` = '"
								+ modelo.getValueAt(x, 0).toString()
								+ "', `cantidad` ="
								+ modelo.getValueAt(x, 1).toString()
								+ ", `campo1` ="
								+ modelo.getValueAt(x, 2).toString()
								+ " WHERE id_Ingrediente = '" + ids[x] + "';");

				pstmt.executeUpdate();

			}

		} catch (SQLException e) {
			System.out.println("ocurrio un error");

		}

	}

	public void editarProducto(DefaultTableModel modelo, Object[] ids,
			int longitud) {

		Connection con = Conexion.getConnection();
		try {
			for (int x = 0; x < longitud; x++) {

				PreparedStatement pstmt = con
						.prepareStatement("UPDATE `productos` SET `nombre` = '"
								+ modelo.getValueAt(x, 1).toString()
								+ "', `ingredientes` ='"
								+ modelo.getValueAt(x, 2).toString()
								+ "', `preparacion` ='"
								+ modelo.getValueAt(x, 3).toString()
								+ "', `precioPesos` ='"
								+ modelo.getValueAt(x, 4).toString()
								+ "' WHERE id_Producto = '" + modelo.getValueAt(x, 0).toString() + "';");
				 System.out.println("se supone precio: "+ modelo.getValueAt(x, 4));
				pstmt.executeUpdate();
			
			}

		} catch (SQLException e) {
			System.out.print(e.getMessage());
			System.out.println("ocurrio un error");

		}

	}

}