public class ArregloLinea1
{
  // Realiza una busqueda lineal en los datos
  public int busquedaLineal (int claveBusqueda, int datos[]){
    for (int indice = 0; indice < datos.length; indice++)
    if (datos[indice] == claveBusqueda)
    return indice; // devuelve el indice del entero

    return -1;
  }



} // fin clase
