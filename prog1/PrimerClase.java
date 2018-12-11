import java.util.Scanner; // Clase a utilizar
public class PrimerClase {
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int numero1;
    int numero2;
    int suma;

    System.out.print("Escriba el primer entero: ");
    numero1= entrada.nextInt();
    
    System.out.print("Escriba el segundo entero: ");
    numero2= entrada.nextInt();

    suma = numero1 + numero2;

    System.out.print("La suma es:" + suma + "\n");
    System.out.println("La suma es: " + suma);

  }
}
