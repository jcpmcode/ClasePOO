import java.util.Scanner; // Clase a utilizar
public class LineaRecta {
  public static void main(String[] args) {
    AnalizaRecta Analiza = new AnalizaRecta();
    Scanner entrada = new Scanner (System.in);
    float a, b, c, d, e, f, g, h, m1, m2, o;

    System.out.println("Primera recta:");
    System.out.println("Escriba x1: ");
    a= entrada.nextInt();

    System.out.print("Escriba y1: ");
    b= entrada.nextInt();

    System.out.print("Escriba x2: ");
    c= entrada.nextInt();

    System.out.print("Escriba y2: ");
    d= entrada.nextInt();

    System.out.println("Segunda recta:");
    System.out.print("Escriba x1: ");
    e= entrada.nextInt();

    System.out.print("Escriba y1: ");
    f= entrada.nextInt();

    System.out.print("Escriba x2: ");
    g= entrada.nextInt();

    System.out.print("Escriba y2: ");
    h= entrada.nextInt();

    m1 = Analiza.CalculaPendiente(a, b, c, d);
    o = Analiza.CalculaOrdenada(a, b, m1);
    System.out.println("y = " + m1 + "x+"+o);
    m2 = Analiza.CalculaPendiente(e, f, g, h);
    o = Analiza.CalculaOrdenada(e, f, m2);
    System.out.println("y = " + m2 + "x+"+o);
    if (m1 != m2)
    {
      System.out.println("Son perpendiculares");
    }
    else
    {
      System.out.println("Son paralelas");
    }
  }
}
