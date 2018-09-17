package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel
{
	private JButton btnDatos;
	private JButton btnTasaEfectiva;
	private JButton btnAnulidad;
	private JButton btnCuota;
	private JButton btnTabla;
	private Ventana vista;
	
	public Panel(Ventana pVista)
	{
		vista = pVista;
		setLayout(new GridLayout(5, 1));
		
		btnDatos = new JButton("Agregar Datos");
		btnDatos.addActionListener(vista);
		btnDatos.setActionCommand(Ventana.DATOS);
		add(btnDatos);
		
		btnTasaEfectiva = new JButton("Tasa Efectiva");
		btnTasaEfectiva.addActionListener(vista);
		btnTasaEfectiva.setActionCommand(Ventana.EFECTIVA);
		add(btnTasaEfectiva);
		
		btnAnulidad = new JButton("Anualidad");
		btnAnulidad.addActionListener(vista);
		btnAnulidad.setActionCommand(Ventana.ANUALIDAD);
		add(btnAnulidad);
		
		btnCuota = new JButton("Cuota");
		btnCuota.addActionListener(vista);
		btnCuota.setActionCommand(Ventana.CUOTA);
		add(btnCuota);
		
		btnTabla = new JButton("Tabla");
		btnTabla.addActionListener(vista);
		btnTabla.setActionCommand(Ventana.TABLA);
		add(btnTabla);
		
		
	}
}
