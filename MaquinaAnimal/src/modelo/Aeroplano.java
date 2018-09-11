package modelo;

import javax.swing.JOptionPane;

public class Aeroplano extends Vehiculo implements Flyer
{
	protected double altura;
	protected String tipo;
	public Aeroplano(int pPlaca,double pAltura,String pTipo) 
	{
		super(pPlaca);
		altura=pAltura;
		tipo=pTipo;
	}

	@Override
	public void despegar() 
	{
		JOptionPane.showMessageDialog(null, tipo+" despegando");
		
	}

	@Override
	public void aterrizar()
	{
		JOptionPane.showMessageDialog(null, tipo+" aterrizando");
		
	}

	@Override
	public void volar() 
	{
		JOptionPane.showMessageDialog(null, tipo+" volando a "+altura+" metros");
		
	}

	@Override
	public void encender() 
	{
		JOptionPane.showMessageDialog(null, tipo+" encendido");
		
	}

}
