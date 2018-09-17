package controlador;

import modelo.Mundo;
import vista.Ventana;

public class Controlador
{
	private Mundo m;
	private Ventana vista;
	public Controlador()
	{
		m = new Mundo();
		vista = new Ventana(this);
	}
	public String sobrecargaSolita()
	{
		return m.getSobre().hacerSobrecarga();
	}
	public String sobrecarga1p(int para1)
	{
		return m.getSobre().hacerSobrecarga(para1);
	}
	public String sobrecarga2p(int para1,double para2)
	{
		return m.getSobre().hacerSobrecarga(para1,para2);
	}
	public String presentar()
	{
		return m.presentar();
	}
}
