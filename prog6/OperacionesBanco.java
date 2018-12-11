public class OperacionesBanco{

private float a;
private float b;

  public OperacionesBanco(float saldoinicial){
    a = saldoinicial;
  }

  public float RealizarCompra(float compra){
    float saldo = a-compra;

    return saldo;
  }

  public void limpiarPantalla(){
    System.out.print("\033[H\033[2J");
    System.out.flush();  
  }
}
