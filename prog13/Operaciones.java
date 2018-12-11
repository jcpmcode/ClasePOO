public class Operaciones{

  public int SumarContenidoArreglo(int arreglo[]){
    int total = 0;

    for (int numero : arreglo){
      total += numero;
    }
    return total;
  }
}
