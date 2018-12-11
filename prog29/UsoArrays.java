import java.util.Arrays;

public class UsoArrays{
  private int arregloInt[]= {9, 1, 6, 7, 2, 8};
  private double arregloDouble[]= {8.4, 9.3, 0.2, 7.9, 3.4};
  private int arregloIntLleno[], copiaArregloInt[];

  // el constructor inicializa los arreglos
  public UsoArrays(){
    arregloIntLleno = new int[10]; // crea arreglo int con 10 elementos
    copiaArregloInt = new int[arregloInt.length];
    Arrays.fill(arregloIntLleno, 7); //lena con 7s
    Arrays.sort(arregloDouble);
    // copia el arreglo: origen, pos inicial, destino, posicion destino, tamaño del arreglo destino
    System.arraycopy(arregloInt, 0, copiaArregloInt, 0, arregloInt.length);
  } // fin del constructor de UsoArrays

  // imprime los valores en cada arreglo
  public void imprimirArreglos(){
    System.out.println("\narregloInt: ");
    for (int valorInt : arregloInt)
    System.out.println(valorInt);
  }

  // compara el contenido del arreglo
  public void imprimirIgualdad(){
    boolean b = Arrays.equals(arregloInt, copiaArregloInt);
    System.out.printf("arregloInt %s copiaArregloInt\n", (b ? "==" : "!="));
  } // fin del metodo imprimirIgualdad

  public static void main(String[] args) {
    int a = 8;
    int arreglo1[] = {9, 1, 6, 7, 2, 8};

    UsoArrays ejecuta = new UsoArrays();

    Arrays.sort(arreglo1);
    ejecuta.imprimirArreglos();
    ejecuta.imprimirIgualdad();
    // se busca a en el arreglo por medio del binary search
    System.out.println(a + " se encuentra en la posicion = " + Arrays.binarySearch(arreglo1, a));
    System.out.println("arreglo1 ordenado: ");
    // for que recorre el arreglo1 e imprime sus valores con punto flotante
    for (double valorDouble : arreglo1)
    System.out.println(valorDouble);
  } // main
} // clase arrays
