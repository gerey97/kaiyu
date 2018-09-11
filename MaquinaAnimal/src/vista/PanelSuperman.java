package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSuperman extends JPanel
{
	private JButton btnDespegar;
	private JButton btnVolar;
	private JButton btnAterrizar;
	private JButton btnComer;
	private JButton btnDecirEdad;
	private JButton btnLevantarEdf;
	private JButton btnDetenerbalas;
	private Ventana vista;
	
	public PanelSuperman(Ventana pVista)
	{
		vista = pVista;
		setLayout( new GridLayout(7, 1));
		
		btnDespegar = new JButton("Despegar");
		btnDespegar.addActionListener(vista);
		btnDespegar.setActionCommand(Ventana.SUPDESPEGAR);
		add(btnDespegar);
		
		btnVolar = new JButton("Volar");
		btnVolar.addActionListener(vista);
		btnVolar.setActionCommand(Ventana.SUPVOLAR);
		add(btnVolar);
		
		btnAterrizar = new JButton("Aterrizar");
		btnAterrizar.addActionListener(vista);
		btnAterrizar.setActionCommand(Ventana.SUPATERRIZAR);
		add(btnAterrizar);
		
		btnComer = new JButton("Comer");
		btnComer.addActionListener(vista);
		btnComer.setActionCommand(Ventana.SUPCOMER);
		add(btnComer);
		
		btnDecirEdad = new JButton("Edad");
		btnDecirEdad.addActionListener(vista);
		btnDecirEdad.setActionCommand(Ventana.SUPDEDAD);
		add(btnDecirEdad);
		
		btnLevantarEdf = new JButton("Levantar Edificio");
		btnLevantarEdf.addActionListener(vista);
		btnLevantarEdf.setActionCommand(Ventana.SUPLEVANTAR);
		add(btnLevantarEdf);
		
		btnDetenerbalas = new JButton("Detener Balas");
		btnDetenerbalas.addActionListener(vista);
		btnDetenerbalas.setActionCommand(Ventana.SUPDETENER);
		add(btnDetenerbalas);
	}
}
