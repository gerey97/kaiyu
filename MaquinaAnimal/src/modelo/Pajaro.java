package modelo;

import javax.swing.JOptionPane;

public class Pajaro extends Animal implements Flyer
{
	private String raza;
	private String color;
	public Pajaro(String pRaza,String pColor) 
	{
		raza=pRaza;
		color=pColor;
	}

	public void despegar()
	{
		JOptionPane.showMessageDialog(null,"Soy un "+raza+" y acabo de despegar");
		
	}

	public void aterrizar() 
	{
		JOptionPane.showMessageDialog(null,"Soy un "+raza+" y acabo de aterrizar");
		
	}

	public void volar() 
	{
		JOptionPane.showMessageDialog(null,"Soy un "+raza+" y estoy volando pio pio");
		
	}

	@Override
	public void comer() 
	{
		JOptionPane.showMessageDialog(null,"Mi dieta se basa en alpiste");
	}

}
