import java.util.Scanner;
import java.util.Random;

public class PruebaBusquedaLineal{

  public int busquedaLineal (int claveBusqueda){
    for (int indice = 0; indice < datos.length; indice++)
    if (datos[indice] == claveBusqueda)
    return indice; // devuelve el indice del entero

    return -1;
  }
  
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int enteroBusqueda; //clave de busqueda
    int posicion; // ubicacion de la clave de busqueda en el arreglo

    ArregloLinea1 arregloBusqueda = new ArregloLinea1(10);
    System.out.println(arregloBusqueda); // Imprime el arreglo
    // obtiene la entrada del usuario
    System.out.print("Escriba un valor entero (-1 para terminar): ");
    enteroBusqueda = entrada.nextInt();
    // recibe en forma repetida un entero como entrada: -1 termina el programa
    while(enteroBusqueda != -1){
      // realiza una busqueda lineal
      posicion = arregloBusqueda.busquedaLineal(enteroBusqueda);

      if (posicion == -1) // no se encontró el entero
      System.out.println("El entero " + enteroBusqueda + " No se encontro.\n");
      else // se encontro el entero
      System.out.println("El entero " + enteroBusqueda + " Se encuentra en la posicion " + posicion + ".\n");

      // obtiene la entrada del usuario
      System.out.print("Escriba un valor entero (-1 para terminar): ");
      enteroBusqueda = entrada.nextInt();
    }
  }
}
