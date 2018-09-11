package modelo;

public abstract class Vehiculo 
{
	private int placa;
	
	public Vehiculo(int pPlaca)
	{
		placa = pPlaca;
	}

	public abstract void encender();
	
	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}
}
