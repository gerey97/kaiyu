package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelHelicoptero extends JPanel
{
	private JButton btnDespegar;
	private JButton btnVolar;
	private JButton btnAterrizar;
	private JButton btnEncender;
	private Ventana vista;
	
	public PanelHelicoptero(Ventana pVista)
	{
		vista = pVista;
		setLayout( new GridLayout(7, 1));
		
		btnEncender = new JButton("Encender");
		btnEncender.addActionListener(vista);
		btnEncender.setActionCommand(Ventana.HELENCENDER);
		add(btnEncender);
		
		btnDespegar = new JButton("Despegar");
		btnDespegar.addActionListener(vista);
		btnDespegar.setActionCommand(Ventana.HELDESPEGAR);
		add(btnDespegar);
		
		btnVolar = new JButton("Volar");
		btnVolar.addActionListener(vista);
		btnVolar.setActionCommand(Ventana.HELVOLAR);
		add(btnVolar);
		
		btnAterrizar = new JButton("Aterrizar");
		btnAterrizar.addActionListener(vista);
		btnAterrizar.setActionCommand(Ventana.HELATERRIZAR);
		add(btnAterrizar);
	}
}
