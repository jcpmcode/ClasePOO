import java.util.Scanner;

public class Examen1{
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    OpMatrices ejecutaOperac = new OpMatrices();

    // limpiar pantalla
    System.out.print("\033[H\033[2J");
    System.out.flush();

    int arreglo1[][] = { {1, 2, 1}, {1, 4, 2}, {1, 5, 3}};
    int arreglo2[][] = { {5, 2, 3}, {7, 2, 3}, {1, 4, 3}};
    int arreglo3[][] = new int[3][3];

    // ejecutaOperac.ImprimirArreglo(arreglo1, arreglo2);
    System.out.println("\nResultados:");
    ejecutaOperac.Multiplicar(arreglo1, arreglo2, arreglo3);
    System.out.println();
    ejecutaOperac.Multiplicar1(arreglo1, arreglo2, arreglo3);
    System.out.println();
    ejecutaOperac.Multiplicar2(arreglo1, arreglo2, arreglo3);
  }
}
