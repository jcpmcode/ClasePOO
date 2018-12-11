import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

class BuscaEnteroArchivo
{

  public static void main(String args[])
  {
    Scanner entrada = new Scanner(System.in);
    ArregloLinea1 arregloBusqueda = new ArregloLinea1();

    String strArray;
    int enteroBusqueda; //clave de busqueda
    int posicion; // ubicacion de la clave de busqueda en el arreglo
    int i;

    try{
      BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
      BufferedWriter out = new BufferedWriter(new FileWriter ("salida.txt"));

      strArray = reader.readLine();// read next line
      String[] strSplit = strArray.split(" ");
      int[] intArray = new int[strSplit.length];
      for(i = 0; i < strSplit.length; i++) {
        intArray[i] = Integer.parseInt(strSplit[i]);
      }
      System.out.print("Escriba un valor entero: ");
      enteroBusqueda = entrada.nextInt();
      posicion = arregloBusqueda.busquedaLineal(enteroBusqueda, intArray);
      System.out.println("Busqueda finalizada, revise el archivo salida.txt");
      if (posicion == -1) // no se encontró el entero
      out.write("El entero " + enteroBusqueda + " No se encontro.\n");
      else // se encontro el entero
      out.write("El entero " + enteroBusqueda + " Se encuentra en la posicion " + posicion + ".\n");

      reader.close();
      out.close();
    } // try
    catch (Exception e){//Catch exception if any
      System.err.println("Error: " + e.getMessage());
    } // catch
  } // main
} // class
