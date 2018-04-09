package paquetaxo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Cajero {

	private JFrame frmCajero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cajero window = new Cajero();
					window.frmCajero.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cajero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCajero = new JFrame();
		frmCajero.setTitle("Cajero");
		frmCajero.setBounds(100, 100, 791, 461);
		frmCajero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblImgcajero = new JLabel("imgcajero");
		lblImgcajero.setIcon(new ImageIcon("C:\\Users\\Angel\\Desktop\\file-WCCctPxqbN.png"));
		frmCajero.getContentPane().add(lblImgcajero, BorderLayout.CENTER);
	}

}
