import java.util.Scanner;

public class OpMatrices{
  Scanner entrada = new Scanner (System.in);

  public void LlenarArreglo(int arreglo1[][], int arreglo2[][]){
    int i, j;
    System.out.println("Matriz 1: ");
    for (i = 0; i < arreglo1.length; i++){
      for (j = 0; j < arreglo1[i].length; j++){
        System.out.print("[" + i + "]" + "[" + j + "]: ");
        arreglo1[i][j] = entrada.nextInt();
      }
    }
    System.out.println("Matriz 2: ");
    for (i = 0; i < arreglo2.length; i++){
      for (j = 0; j < arreglo2[i].length; j++){
        System.out.print("[" + i + "]" + "[" + j + "]: ");
        arreglo2[i][j] = entrada.nextInt();
      }
    }
  }

  public void ImprimirArreglo(int arreglo1[][], int arreglo2[][]){
    int i, j;
    System.out.println("Matriz 1: ");
    for (i = 0; i < arreglo1.length; i++){
      for (j = 0; j < arreglo1[i].length; j++){
        System.out.print("[" + i + "]" + "[" + j + "]: " + arreglo1[i][j]);
      }
    }
    System.out.println("Matriz 2: ");
    for (i = 0; i < arreglo2.length; i++){
      for (j = 0; j < arreglo1[i].length; j++){
        System.out.print("[" + i + "]" + "[" + j + "]: " + arreglo2[i][j]);
      }
    }
  }

  public void Sumar(int arreglo1[][], int arreglo2[][], int arreglo3[][]){
    int i, j;

    for (i = 0; i < arreglo1.length; i++){
      for (j = 0; j < arreglo1[i].length; j++){
        arreglo3[i][j] = arreglo1[i][j] + arreglo2[i][j];
      }
    }
    System.out.println("Suma:");
    for (i = 0; i < arreglo3.length; i++){
      for (j = 0; j < arreglo3[i].length; j++){
        System.out.print(arreglo3[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public void Restar(int arreglo1[][], int arreglo2[][], int arreglo3[][]){
    int i, j;
    for (i = 0; i < arreglo1.length; i++){
      for (j = 0; j < arreglo1[i].length; j++){
        arreglo3[i][j] = arreglo1[i][j] - arreglo2[i][j];
      }
    }
    System.out.println("Resta: ");
    for (i = 0; i < arreglo3.length; i++){
      for (j = 0; j < arreglo3[i].length; j++){
        System.out.print(arreglo3[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public void Multiplicar(int arreglo1[][], int arreglo2[][], int arreglo3[][], int r1, int r2, int c1, int c2){
    System.out.println("Multiplicacion: ");
    for(int i=0;i<c1;i++)
    {
      for(int j=0;j<r2;j++)
      {
        int res=0;
        for(int h=0;h<c2;h++)
        {
          res=res+(arreglo1[i][h] * arreglo2[h][j]);
        }
        arreglo3[i][j]=res;
      }
    }
    for(int i=0;i<r1;i++)
    {
      for(int j=0;j<c2;j++)
      {
        System.out.print(+ arreglo3[i][j] + " ");
      }
      System.out.println("");
    }
  }

}
