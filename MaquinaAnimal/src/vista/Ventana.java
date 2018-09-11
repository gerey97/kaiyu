package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class Ventana extends JFrame implements ActionListener
{
	public final static String SUPDESPEGAR = "S1";
	public final static String SUPVOLAR = "S2";
	public final static String SUPATERRIZAR = "S3";
	public final static String SUPCOMER = "S4";
	public final static String SUPDEDAD = "S5";
	public final static String SUPLEVANTAR = "S6";
	public final static String SUPDETENER = "S7";
	
	public final static String PAJDESPEGAR = "S8";
	public final static String PAJVOLAR = "S9";
	public final static String PAJATERRIZAR = "S10";
	public final static String PAJCOMER = "S11";
	
	public final static String HIDDESPEGAR = "S12";
	public final static String HIDVOLAR = "S13";
	public final static String HIDATERRIZAR = "S14";
	public final static String HIDENCENDER = "S15";
	
	public final static String HELDESPEGAR = "S16";
	public final static String HELVOLAR = "S17";
	public final static String HELATERRIZAR = "S18";
	public final static String HELENCENDER = "S19";
	
	
	private Controlador control;
	private PanelSuperman ps;
	private PanelPajaro pj;
	private PanelHidrojet phid;
	private PanelHelicoptero phel;
	public Ventana(Controlador pControl) 
	{
		control=pControl;
		ps = new PanelSuperman(this);
		pj= new PanelPajaro(this);
		phid = new PanelHidrojet(this);
		phel = new PanelHelicoptero(this);
		setLayout(new GridLayout(1, 4));
		add(ps);
		add(pj);
		add(phid);
		add(phel);
		ps.setBorder(new TitledBorder("SuperMan"));
		pj.setBorder(new TitledBorder("Pajaro"));
		phid.setBorder(new TitledBorder("Hidrojet"));
		phel.setBorder(new TitledBorder("Helicoptero"));
		setVisible(true);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent evento) 
	{
		String comando= evento.getActionCommand();
		if(comando.equals(SUPDESPEGAR))
		{
			control.supdespegar();
		}
		if(comando.equals(SUPVOLAR))
		{
			control.supVolar();
		}
		if(comando.equals(SUPATERRIZAR))
		{
			control.supAterrizar();
		}
		if(comando.equals(SUPCOMER))
		{
			control.supComer();
		}
		if(comando.equals(SUPDEDAD))
		{
			control.supEdad();
		}
		if(comando.equals(SUPLEVANTAR))
		{
			control.supLevantar();
		}
		if(comando.equals(SUPDETENER))
		{
			control.supDetener();
		}
		
		
		if(comando.equals(PAJDESPEGAR))
		{
			control.pajdespegar();
		}
		if(comando.equals(PAJVOLAR))
		{
			control.pajVolar();
		}
		if(comando.equals(PAJATERRIZAR))
		{
			control.pajAterrizar();
		}
		if(comando.equals(PAJCOMER))
		{
			control.pajComer();
		}
		
		
		if(comando.equals(HIDDESPEGAR))
		{
			control.hiddespegar();
		}
		if(comando.equals(HIDVOLAR))
		{
			control.hidVolar();
		}
		if(comando.equals(HIDATERRIZAR))
		{
			control.hidAterrizar();
		}
		if(comando.equals(HIDENCENDER))
		{
			control.hidEncender();	
		}
		
		
		if(comando.equals(HELDESPEGAR))
		{
			control.heldespegar();
		}
		if(comando.equals(HELVOLAR))
		{
			control.helVolar();
		}
		if(comando.equals(HELATERRIZAR))
		{
			control.helAterrizar();
		}
		if(comando.equals(HELENCENDER))
		{
			control.helEncender();	
		}
	}

}
