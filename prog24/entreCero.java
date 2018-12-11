import java.util.InputMismatchException;
import java.util.Scanner;

public class entreCero{
  public static float cociente (float numerador, float denominador){
    float res = numerador / denominador;
    return res;
  }

  public static void main(String[] args) {
    Scanner explorador = new Scanner (System.in); //Objeto Scanner para entrada
    boolean continuarCiclo = true; // determina si se necesitan más datos de entrada
    do{
      try{
        System.out.print("Introduzca un numerador entero: ");
        float numerador = explorador.nextInt();
        System.out.print("Introduzca un denominador entero: ");
        float denominador = explorador.nextInt();
        float resultado = cociente(numerador, denominador);
        System.out.println("Resultado: " + resultado);
        continuarCiclo = false;
      } catch (Exception e){
        System.out.println("Caracter no válido, intente de nuevo");
        explorador.nextLine();
      } // catch
    } while (continuarCiclo); //do while
  }
}
