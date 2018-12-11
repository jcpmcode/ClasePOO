import java.util.Scanner;

public class OpMatrices{
  Scanner entrada = new Scanner (System.in);

  public void ImprimirArreglo(int arreglo1[][], int arreglo2[][]){
    int i, j;
    System.out.println("Matriz 1: ");
    for (i = 0; i < arreglo1.length; i++){
      for (j = 0; j < arreglo1[i].length; j++){
        System.out.println("[" + i + "]" + "[" + j + "]: " + arreglo1[i][j]);
      }
    }
    System.out.println("\nMatriz 2: ");
    for (i = 0; i < arreglo2.length; i++){
      for (j = 0; j < arreglo1[i].length; j++){
        System.out.println("[" + i + "]" + "[" + j + "]: " + arreglo2[i][j]);
      }
    }
  }

  public void Multiplicar(int arreglo1[][], int arreglo2[][], int arreglo3[][]){
    System.out.println("Multiplicacion: ");
    for(int i=0;i<arreglo1.length;i++)
    {
      for(int j=0;j<arreglo1.length;j++)
      {
        int res=0;
        for(int k=0;k<arreglo1.length;k++)
        {
          res=res+(arreglo1[i][k] * arreglo2[k][j]);
        }
        arreglo3[i][j]=res;
      }
    }
    for(int i=0;i<arreglo1.length;i++)
    {
      for(int j=0;j<arreglo1.length;j++)
      {
        System.out.print(+ arreglo3[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public void Multiplicar1(int arreglo1[][], int arreglo2[][], int arreglo3[][]){
    int l= 0;
    System.out.println("Multiplicacion: ");
    for(int i=0;i<arreglo1.length;i++)
    {
      for(int j=0;j<arreglo1.length;j++)
      {
        int res=0;
        for(int k=0;k<arreglo1.length;k++)
        {
          res=res+(arreglo1[i][k] * arreglo2[k][j]);
        }
        if (i%2 == 0){
          arreglo3[i][j]=res;
        }
        else{
          arreglo3[i][j] = 1;
        }
      }
    }
    Imprimir(arreglo3);
  }

  public void Multiplicar2(int arreglo1[][], int arreglo2[][], int arreglo3[][]){
    int l= 0;
    System.out.println("Multiplicacion: ");
    for(int i=0;i<arreglo1.length;i++)
    {
      for(int j=0;j<arreglo1.length;j++)
      {
        int res=0;
        for(int k=0;k<arreglo1.length;k++)
        {
          res=res+(arreglo1[i][k] * arreglo2[k][j]);
        }
        if (j%2 == 0){

          arreglo3[i][j]=res+2;
        }
        else{
          arreglo3[i][j] = 0;
        }
      }
    }
    Imprimir(arreglo3);
  }

  public void Imprimir(int arreglo3[][]){
    for(int i=0;i<arreglo3.length;i++)
    {
      for(int j=0;j<arreglo3.length;j++)
      {
        System.out.print(+ arreglo3[i][j] + " ");
      }
      System.out.println("");
    }
  }

}
