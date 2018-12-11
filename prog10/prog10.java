import java.util.Scanner;

public class prog10{
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int i;
    int f = 0;
    double x1 = 0;
    double x2 = 0;
    double x = 0;

    System.out.println("Ingrese el numero mas cercano a el valor de la raiz de la ecuacion: ");
    x1 = entrada.nextDouble();
    for (i = 0;  i <= 50; i++){
      x2 = Math.pow(((5*x1) - 5), 0.5);
      x = x2 - x1;
      x1 = x2;
      if(x < 0.00001){
        f = i;
        i = 51;
      }
    }
    System.out.println("El resultado es: " + x2 + " y se obtuvo en la iteracion: " + f);
  }
}
