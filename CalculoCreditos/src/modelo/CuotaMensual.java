package modelo;

public class CuotaMensual 
{
	private int numCuota;
	private double saldo;
	private double cuota;
	private double interes;
	private double amortizacion;
	
	public CuotaMensual(int numCuota,double pSaldo,double pCuota,double pInteres,double pAmortizacion)
	{
		numCuota=0;
		saldo=pSaldo;
		cuota=pCuota;
		interes=pInteres;
		amortizacion= pAmortizacion;
	}

	public int getNumCuota() {
		return numCuota;
	}

	public void setNumCuota(int numCuota) {
		this.numCuota = numCuota;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}
}
