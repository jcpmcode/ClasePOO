import java.util.Scanner;

public class prog8{
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int parametro;

    do {
      System.out.println("Escriba un numero o -3 para terminar: ");
      parametro = entrada.nextInt();
    }
    while (parametro != -3);
  }
}
