package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPajaro extends JPanel
{
	private JButton btnDespegar;
	private JButton btnVolar;
	private JButton btnAterrizar;
	private JButton btnComer;
	private Ventana vista;
	
	public PanelPajaro(Ventana pVista)
	{
		vista = pVista;
		setLayout( new GridLayout(7, 1));
		
		btnDespegar = new JButton("Despegar");
		btnDespegar.addActionListener(vista);
		btnDespegar.setActionCommand(Ventana.PAJDESPEGAR);
		add(btnDespegar);
		
		btnVolar = new JButton("Volar");
		btnVolar.addActionListener(vista);
		btnVolar.setActionCommand(Ventana.PAJVOLAR);
		add(btnVolar);
		
		btnAterrizar = new JButton("Aterrizar");
		btnAterrizar.addActionListener(vista);
		btnAterrizar.setActionCommand(Ventana.PAJATERRIZAR);
		add(btnAterrizar);
		
		btnComer = new JButton("Comer");
		btnComer.addActionListener(vista);
		btnComer.setActionCommand(Ventana.PAJCOMER);
		add(btnComer);
	}
}
