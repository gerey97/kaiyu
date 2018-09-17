package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class Ventana extends JFrame implements ActionListener
{
	public final static String SOLITA = "p1";
	public final static String PARAUNO = "p2";
	public final static String PARADOS = "p3";
	
	public final static String PERSONA ="p4";
	
	private Controlador control;
	private PanelSobrecarga ps;
	private PanelPersona pp;
	public Ventana(Controlador pControl) 
	{
		control=pControl;
		ps= new PanelSobrecarga(this);
		pp= new PanelPersona(this);
		
		setLayout(new GridLayout(1, 2));
		setVisible(true);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(ps);
		add(pp);
		ps.setBorder(new TitledBorder("Sobrecarga"));
		pp.setBorder(new TitledBorder("Persona"));
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) 
	{
		String comando = evento.getActionCommand();
		
		if(comando.equals(SOLITA))
		{
			JOptionPane.showMessageDialog(null, control.sobrecargaSolita());
		}
		if(comando.equals(PARAUNO))
		{
			String un= JOptionPane.showInputDialog(null,"ingrese el primer parametro(entero)");
			int uno = Integer.parseInt(un);
			JOptionPane.showMessageDialog(null, control.sobrecarga1p(uno));
		}
		if(comando.equals(PARADOS))
		{
			String un= JOptionPane.showInputDialog(null,"ingrese el primer parametro(entero)");
			int uno = Integer.parseInt(un);
			String dos = JOptionPane.showInputDialog(null,"ingrese el segundo parametro(double)");
			double seg = Double.parseDouble(dos);
			JOptionPane.showMessageDialog(null, control.sobrecarga2p(uno, seg));
		}
		if(comando.equals(PERSONA))
		{
			JOptionPane.showMessageDialog(null, control.presentar());
		}
		
	}

}
