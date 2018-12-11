public class AnalizaRecta{

  public float CalculaPendiente(float x1, float y1, float x2, float y2){
    float m= (y2-y1)/(x2-x1);

    return m;
  }

  public float CalculaOrdenada(float x1, float y1, float m){
    float o= (m * x1 * (-1)) + y1;;

    return o;
  }
}
