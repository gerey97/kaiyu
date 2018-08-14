package modelo;

import javax.swing.JOptionPane;

public class Modelo
{
	private double a;
	private double b;
	private double c;
	private double raiz;
	private double X1;
	private double X2;
	public Modelo()
	{
		
	}
	public void configValor(double pA,double pB,double pC)
	{
		a=pA;
		b=pB;
		c=pC;
	}
	public void mostrarEc()
	{
		System.out.println("ecuacion a solucionar ("+a+")X^2"+"+("+b+")X"+"+("+c+")");
	}
	public void calcularRaiz() throws RaizException
	{
		
			double result =  ((b*b)-(4*(a*c)));
			if(result>0)
			{
				System.out.println(result);
				raiz = Math.sqrt(result);
			}
			else
			{
				throw new RaizException();
			}

	}
	public void Positivo() throws DivisionException
	{
		if(2*a!=0)
		{
			X1=(-b+raiz)/2*a;
			System.out.println("X1= "+X1);
		}
		else 
			throw new DivisionException();
			
			
		
		
		
	}
	public void Negativo() throws DivisionException
	{
		if(2*a!=0)
		{
			X2=(-b-raiz)/2*a;
			System.out.println("X2= "+X2);
		}
		else 
			throw new DivisionException();
	}
	
	
}
