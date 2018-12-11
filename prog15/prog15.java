import java.util.Scanner;

public class prog15{
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    OpMatrices ejecutaOperac = new OpMatrices();

    // limpiar pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();
    //
    System.out.println("Ingrese cuantos renglones de la matriz 1: ");
    int r1 = entrada.nextInt();
    System.out.println("Ingrese cuantas columnas de la matriz 1: ");
    int c1 = entrada.nextInt();
    System.out.println("Ingrese cuantos renglones de la matriz 2: ");
    int r2 = entrada.nextInt();
    System.out.println("Ingrese cuantas columnas de la matriz 2: ");
    int c2 = entrada.nextInt();
    int arreglo1[][] = new int[r1][c1];
    int arreglo2[][] = new int[r2][c2];
    int arreglo3[][] = new int[r1][c2];

    System.out.println("\nResultados:");
    if (!(r1 == r2 && c1 == c2)){
      System.out.println("No se puede realizar suma ni resta de las matrices por las dimensiones.");
      if (!(c1 == r2)){
        System.out.println("No se puede realizar multiplicacion de matrices con estas dimensiones.");
      }
      else {
        ejecutaOperac.LlenarArreglo(arreglo1, arreglo2);
        ejecutaOperac.Multiplicar(arreglo1, arreglo2, arreglo3, r1, r2, c1, c2);
      }
    }
    else{
      ejecutaOperac.LlenarArreglo(arreglo1, arreglo2);
      ejecutaOperac.Sumar(arreglo1, arreglo2, arreglo3);
      ejecutaOperac.Restar(arreglo1, arreglo2, arreglo3);
      if (!(c1 == r2)){
        System.out.println("No se puede realizar multiplicacion de matrices con estas dimensiones.");
      }
      else{
        ejecutaOperac.Multiplicar(arreglo1, arreglo2, arreglo3, r1, r2, c1, c2);
      }
    }
    // ejecutaOperac.ImprimirArreglo(arreglo1, arreglo2, arreglo3);
  }
}
