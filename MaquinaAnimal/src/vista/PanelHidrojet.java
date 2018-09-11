package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelHidrojet extends JPanel
{
	private JButton btnDespegar;
	private JButton btnVolar;
	private JButton btnAterrizar;
	private JButton btnEncender;
	private Ventana vista;
	
	public PanelHidrojet(Ventana pVista)
	{
		vista = pVista;
		setLayout( new GridLayout(7, 1));
		
		btnEncender = new JButton("Encender");
		btnEncender.addActionListener(vista);
		btnEncender.setActionCommand(Ventana.HIDENCENDER);
		add(btnEncender);
		
		btnDespegar = new JButton("Despegar");
		btnDespegar.addActionListener(vista);
		btnDespegar.setActionCommand(Ventana.HIDDESPEGAR);
		add(btnDespegar);
		
		btnVolar = new JButton("Volar");
		btnVolar.addActionListener(vista);
		btnVolar.setActionCommand(Ventana.HIDVOLAR);
		add(btnVolar);
		
		btnAterrizar = new JButton("Aterrizar");
		btnAterrizar.addActionListener(vista);
		btnAterrizar.setActionCommand(Ventana.HIDATERRIZAR);
		add(btnAterrizar);
	}
}
