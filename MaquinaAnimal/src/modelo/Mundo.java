package modelo;

public class Mundo 
{
	private Superman sup1;
	private Pajaro paj1;
	private Helicoptero hel1;
	private Hidrojet hid1;
	
	public Mundo()
	{
		sup1 = new Superman(500, "clark", 1.90);
		paj1 = new Pajaro("Agaporni", "Rojo");
		hel1= new Helicoptero(123, 250,"F15");
		hid1 = new Hidrojet(321,320 , "Hidroheist");
	}

	public Superman getSup1() {
		return sup1;
	}

	public void setSup1(Superman sup1) {
		this.sup1 = sup1;
	}

	public Pajaro getPaj1() {
		return paj1;
	}

	public void setPaj1(Pajaro paj1) {
		this.paj1 = paj1;
	}

	public Helicoptero getHel1() {
		return hel1;
	}

	public void setHel1(Helicoptero hel1) {
		this.hel1 = hel1;
	}

	public Hidrojet getHid1() {
		return hid1;
	}

	public void setHid1(Hidrojet hid1) {
		this.hid1 = hid1;
	}
}
