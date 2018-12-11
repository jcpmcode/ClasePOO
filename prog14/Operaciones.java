public class Operaciones{

  public void ImprimirArreglo(int arreglo[][]){
    for (int fila = 0; fila < arreglo.length; fila++){
      for (int columna = 0; columna < arreglo[fila].length; columna++)
      System.out.print(arreglo[fila][columna] + " ");
      System.out.println();
    }
    System.out.println();
  }

  public void SumarFilas(int arreglo[][]){
    int sum = 0;
    for (int fila = 0; fila < arreglo.length; fila++){
      sum = 0;
      for (int columna = 0; columna < arreglo[fila].length; columna++){
        sum += arreglo[fila][columna];
      }
      System.out.println("Suma fila[" + fila + "] = " + sum);
    }
  }

  public void SumarColumnas(int arreglo[][]){
    int sum = 0;
    for (int columna = 0; columna <= arreglo.length; columna++){
      sum = 0;
      for (int fila = 0; fila < arreglo.length; fila++){
        sum += arreglo[fila][columna];
      }
      System.out.println("Suma columna[" + columna + "] = " + sum);
    }
  }

}
