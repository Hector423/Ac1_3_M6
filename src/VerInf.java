import java.io.File;

public class VerInf {

	public static void main(String[] args) {
		
		File arxiu = new File("C:\\Users\\hecto\\eclipse-workspace\\Act1_3\\src\\VerInf.java");
		
		String nom = arxiu.getName();		
		
		System.out.println("El nom del arxiu: " + nom);
		
		String ruta = arxiu.getPath();
		
		System.out.println("Ruta relativa: " + ruta);
		
		String rutaAbsoluta = arxiu.getAbsolutePath();
		
		System.out.println("Ruta absoluta: " + rutaAbsoluta);
		
		Boolean permisEscriptura = arxiu.canWrite();
		
		System.out.println("Te permís de escriptura? " + permisEscriptura);
		
		Boolean permisLectura = arxiu.canRead();
		
		System.out.println("Te permís de lectura? " + permisLectura);
		
		Long tamany = arxiu.length();
		
		System.out.println("Tamany del arxiu: " + tamany);
		
		Boolean esDirectori = arxiu.isDirectory();
		
		System.out.println("Es un directori? " + esDirectori);
		
		Boolean esFitxer = arxiu.isFile();
		
		System.out.println("Es un arxiu? " + esFitxer);
	}
}
