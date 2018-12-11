import javax.swing.JOptionPane;

public class CalculaVolumen extends BasesGeometricas{

  private double alturaVolumen;
  private double volumenCalculado;


  public CalculaVolumen(double ladoUno, double ladoDos, double alturaM, double altVolumen){
    super(ladoUno, ladoDos, alturaM);
    alturaVolumen = altVolumen;


  }

  public double volumenCalculado(){ //cuadrado
    volumenCalculado=alturaVolumen * super.calculaBaseCuadrado();
    return volumenCalculado;
  }

  public double volumenCalculadoPrisma(){
    volumenCalculado= super.calculaBasePrismaPiramide()*alturaVolumen;
    return volumenCalculado;
  }

  public double volumenCalculadoEsfera(){
    volumenCalculado= (super.calculaBaseEsfera() * super.getRadio())/3;
    return volumenCalculado;
  }

  public double volumenCalculadoCilindro(){
    volumenCalculado= super.calculaBaseCilindroCono() * alturaVolumen;
    return volumenCalculado;
  }

  public double volumenCalculadoCono(){
    volumenCalculado= (super.calculaBaseCilindroCono() * alturaVolumen)/3;
    return volumenCalculado;
  }

  public double volumenCalculadoPiramide(){
    volumenCalculado= (super.calculaBasePrismaPiramide() * alturaVolumen)/3;
    return volumenCalculado;
  }
}
