import java.util.Scanner;

public class prog14{
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    Operaciones ejecutaOperac = new Operaciones();

    int arreglo[][] = { {1, 7, 3}, {4, 1, 9}, {1,2,3} };

    ejecutaOperac.ImprimirArreglo(arreglo);
    ejecutaOperac.SumarFilas(arreglo);
    System.out.println();
    ejecutaOperac.SumarColumnas(arreglo);
  }
}
