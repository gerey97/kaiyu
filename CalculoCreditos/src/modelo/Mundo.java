package modelo;

public class Mundo 
{
	private Proveedor prov;
	private Cliente clien;
	private Credito credito;
	
	
	public Mundo()
	{
		prov = new Proveedor("", "", "", "", "");
		credito = new Credito();
		clien = new Cliente("", "", "", "","");
	}


	public Proveedor getProv() {
		return prov;
	}


	public void setProv(Proveedor prov) {
		this.prov = prov;
	}


	public Cliente getClien() {
		return clien;
	}


	public void setClien(Cliente clien) {
		this.clien = clien;
	}


	public Credito getCredito() {
		return credito;
	}


	public void setCredito(Credito credito) {
		this.credito = credito;
	}
}
