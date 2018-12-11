import java.util.Scanner;

public class Operaciones{
  private float a;
  private float b;

  public Operaciones(float n1, float n2){
    a=n1;
    b=n2;
  }

  public void RealizaSuma(){
    float res = a+b;
    System.out.println("El resultado es: " + res);
  }

  public void RealizaResta(){
    float res = a-b;
    System.out.println("El resultado es: " + res);
  }

  public void RealizaMultiplicacion(){
    float res = a*b;
    System.out.println("El resultado es: " + res);
  }

  public void RealizaDivision(){
    float res = a/b;
    System.out.println("El resultado es: " + res);
  }
}
