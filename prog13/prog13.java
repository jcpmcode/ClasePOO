import java.util.Scanner;

public class prog13{
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    Operaciones ejecutaOperac = new Operaciones();

    int arreglo[] = new int[10];

    System.out.println("Ingrese 10 numero.");
    for (int i = 0; i < arreglo.length; i++){
      System.out.println("Ingrese el numero " + (i+1) + ": ");
      arreglo[i] = entrada.nextInt();
      arreglo[i] *= 2;
    }
    for (int i = 0; i < arreglo.length; i++){
      System.out.println("numero " + (i+1) + ": " + arreglo[i]);
    }
    System.out.println(ejecutaOperac.SumarContenidoArreglo(arreglo));
  }
}
