package modelo;

public class Mundo 
{
	private Persona personas[];
	private Sobrecarga sobre;
	
	public Mundo()
	{
		sobre = new Sobrecarga();
		personas = new Persona[3];
		
		personas[0]= new Persona();
		personas[1]= new Alumno();
		personas[2]=new Profesor();
	}

	public Persona[] getPersonas() {
		return personas;
	}
	public String presentar()
	{
		String resp="";
		for (int i = 0; i < personas.length; i++) 
		{
			resp = resp +personas[i].toString()+"\n";
		}
		return resp;
	}

	public void setPersonas(Persona[] personas) {
		this.personas = personas;
	}

	public Sobrecarga getSobre() {
		return sobre;
	}

	public void setSobre(Sobrecarga sobre) {
		this.sobre = sobre;
	}
}
