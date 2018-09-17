package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSobrecarga extends JPanel
{
	private JButton btnSobrecarga;
	private JButton btnSobreCarga1para;
	private JButton btnSobrecarga2para;
	private Ventana vista;
	public PanelSobrecarga(Ventana pVista)
	{
		vista = pVista;
		setLayout(new GridLayout(3, 1));
		
		btnSobrecarga = new JButton("Sobrecarga");
		btnSobrecarga.addActionListener(vista);
		btnSobrecarga.setActionCommand(Ventana.SOLITA);
		add(btnSobrecarga);
		
		btnSobreCarga1para = new JButton("Sobrecarga 1 parametro");
		btnSobreCarga1para.addActionListener(vista);
		btnSobreCarga1para.setActionCommand(Ventana.PARAUNO);
		add(btnSobreCarga1para);
		
		btnSobrecarga2para = new JButton("Sobrecarga 2 parametros");
		btnSobrecarga2para.addActionListener(vista);
		btnSobrecarga2para.setActionCommand(Ventana.PARADOS);
		add(btnSobrecarga2para);
	}
}
