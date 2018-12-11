public class CalculaVolumen extends BasesGeometricas{
  private double alturaVolumen;
  private double volumenCalculado;

  public CalculaVolumen(double ladoUno, double ladoDos, double alturaM, double altVolumen){
    super(ladoUno, ladoDos, alturaM);
    alturaVolumen = altVolumen;
  }

  public double VolumenCuadrado(){
    volumenCalculado = alturaVolumen * super.calculaBaseCuadrado();
    return volumenCalculado;
  }

  public double VolumenPrisRect(){
    volumenCalculado = alturaVolumen * super.calculaBaseRectangulo();
    return volumenCalculado;
  }

  public double VolumenCilindro(){
    volumenCalculado = alturaVolumen * super.calculaBaseCirculo();
    return volumenCalculado;
  }

  public double VolumenEsfera(){
    volumenCalculado = (super.AreaEsfera() * super.getRadio() / 3);
    return volumenCalculado;
  }

  public double VolumenCono(){
    volumenCalculado = (alturaVolumen * super.calculaBaseCirculo()) / 3;
    return volumenCalculado;
  }

  public double VolumenPiramide(){
    volumenCalculado = (alturaVolumen * super.calculaBaseCuadrado()) / 3;
    return volumenCalculado;
  }
}
