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
	public void supdespegar()
	{
		m.getSup1().despegar();
	}
	public void supVolar()
	{
		m.getSup1().volar();
	}
	public void supAterrizar()
	{
		m.getSup1().aterrizar();
	}
	public void supComer()
	{
		m.getSup1().comer();
	}
	public void supEdad()
	{
		m.getSup1().decirEdad();
	}
	public void supLevantar()
	{
		m.getSup1().levantarEdf();
	}
	public void supDetener()
	{
		m.getSup1().detenerBalas();
	}
	
	
	
	public void pajdespegar()
	{
		m.getPaj1().despegar();
	}
	public void pajVolar()
	{
		m.getPaj1().volar();
	}
	public void pajAterrizar()
	{
		m.getPaj1().aterrizar();
	}
	public void pajComer()
	{
		m.getPaj1().comer();
	}
	
	
	public void hiddespegar()
	{
		m.getHid1().despegar();
	}
	public void hidVolar()
	{
		m.getHid1().volar();
	}
	public void hidAterrizar()
	{
		m.getHid1().aterrizar();
	}
	public void hidEncender()
	{
		m.getHid1().encender();
	}
	
	
	public void heldespegar()
	{
		m.getHel1().despegar();
	}
	public void helVolar()
	{
		m.getHel1().volar();
	}
	public void helAterrizar()
	{
		m.getHel1().aterrizar();
	}
	public void helEncender()
	{
		m.getHel1().encender();
	}
	
}
