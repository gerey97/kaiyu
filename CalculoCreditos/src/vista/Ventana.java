package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class Ventana extends JFrame implements ActionListener
{
	public final static String DATOS = "p1";
	public final static String EFECTIVA = "p2";
	public final static String ANUALIDAD = "p3";
	public final static String CUOTA = "p4";
	public final static String TABLA = "p5";
	public final static String AGREGARC = "p6";
	public final static String LEERC = "p8";
	public final static String AGREGARP = "p9";
	public final static String LEERP ="p11";
	private Panel panel;
	private PanelCliente panelc;
	private PanelProveedor panelp;
	private Controlador control;
	public Ventana(Controlador pControl)
	{
		setTitle("Proyecto");
		control=pControl;
		panel = new Panel(this);
		panelc = new PanelCliente(this);
		panelp= new PanelProveedor(this);
		setLayout(new GridLayout(1, 3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,300);
		panel.setBorder(new TitledBorder("Tabla Amortizacion"));
		panelc.setBorder(new TitledBorder("Cliente"));
		panelp.setBorder(new TitledBorder("Proveedor"));
		setLocationRelativeTo(null);
		add(panel);
		add(panelc);
		add(panelp);
		setVisible(true);
	}
	public void mensaje(String pMensaje)
	{
		JOptionPane.showMessageDialog(null,pMensaje);
	}

	@Override
	public void actionPerformed(ActionEvent evento)
	{
		String comando = evento.getActionCommand();
		if(comando.equals(DATOS))
		{
			try 
			{
				String peri = JOptionPane.showInputDialog("ingrese el periodo");
				int periodo = Integer.parseInt(peri);
				String Tn = JOptionPane.showInputDialog("Ingrese la tasa nominal");
				double TNominal = Double.parseDouble(Tn);
				String mon = JOptionPane.showInputDialog("Ingrese el monto");
				double monto = Double.parseDouble(mon);
				control.ingresarDatos(periodo, TNominal, monto);
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(null, "No se pudieron agregar los datos");
			}

		}
		else if(comando.equals(EFECTIVA))
		{
			try 
			{
				control.calcularTasaEfectiva();
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(null, "No se pudo calcular la tasa efectiva");
			}
			
			
		}
		else if (comando.equals(ANUALIDAD))
		{
			try 
			{
				control.calcularAnualidad();
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(null, "No se pudo calcular la Anualidad");
			}
			
		}
		else if (comando.equals(CUOTA))
		{
			try
			{
				control.calcularCuota();
			} 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(null, "No se pudo calcular la cuota"); 
			}
			
		}
		else if(comando.equals(TABLA))
		{
			control.mostrarTabla();
		}
		else if(comando.equals(AGREGARP))
		{
			
			control.agregarProveedor();
		}
		else if(comando.equals(LEERP))
		{
			control.cargarProveedor();
		}
		else if(comando.equals(AGREGARC))
		{
			control.agregarCliente();
		}
		else if(comando.equals(LEERC))
		{
			control.cargarCliente();
		}
		
	}

}
