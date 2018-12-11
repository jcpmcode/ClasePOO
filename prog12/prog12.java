import java.util.Random;

public class prog12{
  public static void main(String[] args) {    
    Operaciones ejecutaOperac = new Operaciones();
    Random numR = new Random();

    double num1 = numR.nextDouble();
    double num2 = numR.nextDouble();
    double num3 = numR.nextDouble();
    System.out.println(num1 + " " + num2 + " " + num3);
    System.out.println(ejecutaOperac.DeterminarNumMayor(num1, num2, num3));
  }
}
