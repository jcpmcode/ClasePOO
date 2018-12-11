import java.util.Scanner;

public class Operaciones{

  public void RealizaSuma(int a, int b){
    int res = a+b;
    System.out.println("El resultado es: " + res);
  }

  public void RealizaResta(int a, int b){
    int res = a-b;
    System.out.println("El resultado es: " + res);
  }

  public void RealizaMultiplicacion(int a, int b){
    int res = a*b;
    System.out.println("El resultado es: " + res);
  }

  public void RealizaDivision(float a, float b){
    float res = a/b;
    System.out.println("El resultado es: " + res);
  }
}
