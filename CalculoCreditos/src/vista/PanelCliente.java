package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCliente extends JPanel
{
	private JButton agregarCliente;
	private JButton leerArchivo;
	
	private Ventana vista;
	
	public PanelCliente(Ventana pVista)
	{
		vista = pVista;
		setLayout(new GridLayout(2, 1));
		
		agregarCliente = new JButton("Agregar Cliente");
		agregarCliente.addActionListener(vista);
		agregarCliente.setActionCommand(Ventana.AGREGARC);
		add(agregarCliente);
		
		
		leerArchivo = new JButton("Leer Archivo");
		leerArchivo.addActionListener(vista);
		leerArchivo.setActionCommand(Ventana.LEERC);
		add(leerArchivo);
	}
}
