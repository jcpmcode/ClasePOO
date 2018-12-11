public class BasesGeometricas {
  private double ladoA;
  private double ladoB;
  private double altura;
  private double area;

  public BasesGeometricas (double ladoUno, double ladoDos, double alturaM){
    ladoA = ladoUno;
    ladoB = ladoDos;
    altura = alturaM;
  }

  public double calculaBaseCuadrado (){
    area = ladoA * ladoA;
    return area;
  }

  public double calculaBaseRectangulo (){
    area = ladoA * ladoB;
    return area;
  }

  public double calculaBaseCirculo (){
    area = altura * altura * 3.14159;
    return area;
  }

  public double AreaEsfera (){
    area = 4 * 3.14159 * altura * altura;
    return area;
  }

  public double getRadio(){
    return altura;
  }

}
