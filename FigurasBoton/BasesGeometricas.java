import javax.swing.JOptionPane;

public class BasesGeometricas{
  private double ladoA;
  private double ladoB;
  private double altura;
  private double area;

  public BasesGeometricas( double ladoUno, double ladoDos, double alturaM)
  {
    ladoA=ladoUno;
    ladoB=ladoDos;
    altura=alturaM;
  }

  public double calculaBaseCuadrado(){
    area=ladoA*ladoA;
    return area;
  }

  public double calculaBasePrismaPiramide(){
    area=ladoA*ladoB;
    return area;
  }

  public double calculaBaseEsfera(){
    area=(4*3.1416)*(altura*altura);
    return area;
  }

  public double calculaBaseCilindroCono(){
    area=(3.1416)*(altura*altura);
    return area;
  }

public double getRadio(){
  return altura;
}

}
