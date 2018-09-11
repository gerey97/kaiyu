package modelo;

import javax.swing.JOptionPane;

public abstract class Kryptoniano extends Animal
{
	protected int edad;
	
	public Kryptoniano(int pEdad)
	{
		edad=pEdad;
	}
	
	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public abstract void decirEdad();
	public void comer()
	{
		JOptionPane.showMessageDialog(null,"Yo como carne");
	}
	
	
}
