import java.util.Scanner;

public class ejercicio{
  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int a = 0, b = 7, c = 9, fa = 0, fb = 0, fc = 0;

    if (a > b){
      if (a > c){
        System.out.println("" + a);
        fa = 1;
      }
      else{
        System.out.println("" + c);
        fc = 1;
      }
    }
    else{
      if (b > a){
        if (b > c){
          System.out.println("" + b);
          fb = 1;
        }
        else{
          System.out.println("" + c);
          fc = 1;
        }
      }
      else{
        if (c > a){
          if(c > b){
            System.out.println("" + c);
            fc = 1;
          }
          else{
            System.out.println("" + b);
            fb = 1;
          }
        }
      }
    }
    if (a < b){
      if (a < c){
        System.out.println("" + a);
        fa = 1;
      }
      else{
        System.out.println("" + c);
        fc = 1;
      }
    }
    else{
      if (b < a){
        if (b < c){
          System.out.println("" + b);
          fb = 1;
        }
        else{
          System.out.println("" + c);
          fc = 1;
        }
      }
      else{
        if (c < a){
          if(c < b){
            System.out.println("" + c);
            fc = 1;
          }
          else{
            System.out.println("" + b);
            fb = 1;
          }
        }
      }
    }
    if (fa == 0){
      System.out.println("" + a);
    }
    if (fb == 0)
    {

    }
    if (fc == 1){

    }
  }
}
