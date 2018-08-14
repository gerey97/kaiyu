package controlador;

import modelo.DivisionException;
import modelo.Modelo;
import modelo.RaizException;

public class Controlador 
{
	private Modelo m;
	
	public Controlador() throws RaizException, DivisionException
	{
		m = new Modelo();
		m.configValor(1, 100, 110);
		m.mostrarEc();
		m.calcularRaiz();
		m.Positivo();
		m.Negativo();
	}
}
