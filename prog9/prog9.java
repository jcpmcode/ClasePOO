import java.util.Scanner;

public class prog9{
  public static void main(String[] args) {
    Operaciones ejecutaOperac = new Operaciones();
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el numero de calificaciones a capturar: ");
    int totalCal = entrada.nextInt();
    ejecutaOperac.determinarPromedioClase(totalCal);
    ejecutaOperac.imprimeSumaTotal();
    ejecutaOperac.imprimePromedio();
  }
}
