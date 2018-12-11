import java.io.File;

public class DemostracionFile{

  public void analizarRuta(String ruta){

    File nombre = new File(ruta);

    if (nombre.exists())
    System.out.println(nombre.getName() + " existe");
    System.out.println(nombre.isFile() ? "es un archivo" : "no es un archivo");
    System.out.println(nombre.isDirectory() ? "es un directorio" : "no es un directorio");
    System.out.println(nombre.getPath());

    if (nombre.isDirectory()){
      String directorio[] = nombre.list();
      System.out.println("\n\nContenido del directorio:\n");

      for(String nombreDirectorio : directorio)
      System.out.printf("%s\n", nombreDirectorio);
    }
    else{
      System.out.printf("%s %s", ruta, "no existe.");
    }
  }
}
