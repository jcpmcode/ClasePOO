import java.util.Scanner;

public class Operaciones{
  Scanner entrada = new Scanner(System.in);

  private int totalsuma;
  private float promedio;

  public void determinarPromedioClase(int totalCal){
    int i= 1;
    int total = 0;
    float prom;
    int calificacion;
   while (i <= totalCal){
     System.out.println("Ingrese la calificacion " + i + ": ");
     calificacion = entrada.nextInt();
     total += calificacion;
      i++;
    }
    totalsuma = total;
    promedio = total / totalCal;
  }
  public void imprimeSumaTotal(){
    System.out.println("La suma de las calificaciones es: " + totalsuma);
  }

  public void imprimePromedio(){
    System.out.println("El promedio de las calificaciones es: " + promedio);
  }
}
