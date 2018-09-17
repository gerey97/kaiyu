package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelProveedor extends JPanel 
{
	private JButton agregarProveedor;

	private JButton leerArchivo;
	
	private Ventana vista;
	
	public PanelProveedor(Ventana pVista)
	{
		vista = pVista;
		setLayout(new GridLayout(2, 1));
		
		agregarProveedor = new JButton("Agregar Proveedor");
		agregarProveedor.addActionListener(vista);
		agregarProveedor.setActionCommand(Ventana.AGREGARP);
		add(agregarProveedor);
		

		
		leerArchivo = new JButton("Leer Archivo");
		leerArchivo.addActionListener(vista);
		leerArchivo.setActionCommand(Ventana.LEERP);
		add(leerArchivo);
	}
}
