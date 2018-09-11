package modelo;

import javax.swing.JOptionPane;

public class Superman extends Kryptoniano implements Flyer
{
	private String nombre;
	private double altura;

	public Superman(int pEdad,String pNombre,double pAltura) 
	{
		super(pEdad);
		nombre=pNombre;
		altura=pAltura;
		
	}

	@Override
	public void decirEdad() 
	{
		JOptionPane.showMessageDialog(null,"tengo "+this.edad+" años");
	}
	public void despegar()
	{
		JOptionPane.showMessageDialog(null,"Yo, "+nombre+" Acabo de despegar");
	}
	public void aterrizar()
	{
		JOptionPane.showMessageDialog(null,"Yo, "+nombre+" acabo de aterrizar");
	}

	public void levantarEdf()
	{
		JOptionPane.showMessageDialog(null,"Estoy levantando un edificio jeje");
	}
	public void detenerBalas()
	{
		JOptionPane.showMessageDialog(null,"Verga mano no me puedes matar");
	}
	public void decirQComo()
	{
		
		this.comer();
	}

	public void volar() 
	{
		JOptionPane.showMessageDialog(null, "estoy volandoo");
		
	}

	

	
	

}
