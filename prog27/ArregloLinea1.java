import java.util.Random;

public class ArregloLinea1
{
  private int[] datos;
  private static Random generador = new Random();

  public ArregloLinea1(int tamanio){
    datos = new int[tamanio];

    // Llena con calores int aleatorios 10 - 99
    for (int i = 0; i < tamanio; i++)
    datos[i] = 10 + generador.nextInt(90);
  }

  // Realiza una busqueda lineal en los datos
  public int busquedaLineal (int claveBusqueda){
    for (int indice = 0; indice < datos.length; indice++)
    if (datos[indice] == claveBusqueda)
    return indice; // devuelve el indice del entero

    return -1;
  }

  // metodo para imprimir los valores del Arreglo
  public String toString(){

    StringBuilder temporal = new StringBuilder();

    // itera a través del Arreglo
    for (int elemento : datos)
    temporal.append(elemento + " ");

    temporal.append("\n"); //agrega el carácter de nueva linea
    return temporal.toString();
  } // toString
} // fin clase
