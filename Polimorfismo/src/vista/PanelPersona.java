package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPersona extends JPanel
{
	private JButton btnpersona;
	private Ventana vista;
	public PanelPersona(Ventana pVista)
	{
		vista = pVista;
		setLayout(new GridLayout(1, 1));
		btnpersona = new JButton("Personas");
		btnpersona.addActionListener(vista);
		btnpersona.setActionCommand(Ventana.PERSONA);
		add(btnpersona);
	}
}
