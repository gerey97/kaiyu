package modelo;

public class Credito
{
	private double periodo;
	private double tasaNominal;
	private double tasaEfectiva;
	private double monto;
	private double anualidad;
	private double cuota;
	private int numCuota;
	private CuotaMensual[] tabla;
	public final static int CAPACIDAD = 12;
	
	public Credito()
	{
		tabla = new CuotaMensual[CAPACIDAD];
		numCuota=1;
	}
	public void calcularTabla()
	{
		tabla[0]= new CuotaMensual(numCuota,monto, 0, 0, 0);
		for (int i = 1; i < tabla.length; i++) 
		{
			double cuota =  monto/anualidad;
			double interes= tabla[i-1].getSaldo()*tasaEfectiva;
			double amortizacion=cuota-interes;
			double saldo= tabla[i-1].getSaldo()-amortizacion;
			
			tabla[i]= new CuotaMensual(numCuota,saldo,cuota, interes,amortizacion );	
		}
	}
	public void imprimir()
	{
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(numCuota+++"|"+tabla[i].getSaldo()+"|"+tabla[i].getCuota()+"|"+tabla[i].getInteres()+"|"+tabla[i].getAmortizacion());
		}
		
	}
	public void ingresarDatos(double pPeriodo,double pTasaNominal,double pMonto)
	{
		periodo=pPeriodo;
		tasaNominal=pTasaNominal;
		monto = pMonto;
	}
	public double calcularTasaEfectiva()
	{
		double uno =tasaNominal/100;
		double dos = 1/periodo;
		tasaEfectiva=(Math.pow((1+(uno)),(dos))-1);
		return tasaEfectiva;
	}
	public double calcularAnualidad()
	{
		anualidad=(1-Math.pow(1+tasaEfectiva,-periodo))/tasaEfectiva;
		return anualidad;
	}
	public double calcularCuota()
	{
		cuota=monto/anualidad;
		return cuota;
	}
	
}
