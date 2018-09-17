package modelo;

public abstract class Usuario
{
	protected String documento;
	protected String nombre;
	protected String apellido;
	protected String correo;
	protected String nombreArchivo;
	
	public Usuario(String pDocumento,String pNombre,String pApellido,String pCorreo,String pNombreArchivo)
	{
		documento=pDocumento;
		nombre=pNombre;
		apellido=pApellido;
		correo=pCorreo;
		nombreArchivo=pNombreArchivo;
	}
	public abstract void agregarUsuario();
	public abstract void leerArchivo();
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
}
