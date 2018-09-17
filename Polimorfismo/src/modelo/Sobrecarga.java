package modelo;

public class Sobrecarga 
{
	public String hacerSobrecarga()
	{
		return "sobrecarga solita";
	}
	public String hacerSobrecarga(int argumento)
	{
		return "sobrecarga "+argumento+" un parametro tipo entero";
	}
	public String hacerSobrecarga(int argumento1,double argumento2)
	{
		return "sobrecarga "+argumento1+" "+" "+argumento2+" un parametro tipo entero y uno double";
	}
}
