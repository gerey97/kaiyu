package controlador;

import modelo.Credito;
import modelo.CuotaMensual;
import modelo.Mundo;
import modelo.Proveedor;
import vista.Ventana;

public class Controlador
{
	private Ventana vista;
	private Credito credito;
	private Mundo m;
	
	public Controlador()
	{
		vista = new Ventana(this);
		
		m = new Mundo();
	}
	public void ingresarDatos(int pPeriodo,double pTasaNominal,double pMonto)
	{
		m.getCredito().ingresarDatos(pPeriodo, pTasaNominal, pMonto);
		
	}
	public void mostrarTabla()
	{
		m.getCredito().calcularTabla();
		m.getCredito().imprimir();
		
		
	}
	public void calcularTasaEfectiva()
	{
		double tasa=m.getCredito().calcularTasaEfectiva();
		vista.mensaje("Tasa Efectiva: "+tasa);
	}
	public void calcularAnualidad()
	{
		double anualidad=m.getCredito().calcularAnualidad();
		vista.mensaje("Anualidad: "+anualidad);
	}
	public void calcularCuota()
	{
		double cuota= m.getCredito().calcularCuota();
		vista.mensaje("Cuota: "+cuota);
	}
	public void agregarProveedor()
	{
		m.getProv().agregarUsuario();
	}
	public void cargarProveedor()
	{
		m.getProv().leerArchivo();
	}
	public void agregarCliente()
	{
		m.getClien().agregarUsuario();
	}
	public void cargarCliente()
	{
		m.getClien().leerArchivo();
	}
	
}
