package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Proveedor extends Usuario
{
	public Proveedor(String pDocumento, String pNombre, String pApellido, String pCorreo, String pNombreArchivo) {
		super(pDocumento, pNombre, pApellido, pCorreo, "C:\\Users\\gustavorey97\\Desktop\\ArchivadorProveedor.txt" );
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agregarUsuario() 
	{
		String doc = JOptionPane.showInputDialog("ingrese el documento");
		String nom = JOptionPane.showInputDialog("Ingrese el nombre");
		String ape = JOptionPane.showInputDialog("Ingrese el apellido");
		String corr= JOptionPane.showInputDialog("Ingrese el correo");
		Proveedor  p= new Proveedor(doc, nom, ape, corr,nombreArchivo );
		File f = new File(p.nombreArchivo);
		try 
		{
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw= new PrintWriter(fw);
			
				pw.println(p.documento+", "+p.nombre+", "+p.apellido+", "+p.correo);
			
			fw.close();
		}
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Error al  guardar al proveedor");
		}
	}



	@Override
	public void leerArchivo() 
	{
		String salida="";
		File f = new File(nombreArchivo);
		try 
		{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea =br.readLine();
			while(linea!=null)
			{
				salida=salida+linea+"\n";
				linea = br.readLine();	
			}
			JOptionPane.showMessageDialog(null, salida);
			fr.close();
		} catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Error al  cargar al proveedor");
		}
		
	}

}
