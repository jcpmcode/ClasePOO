public class ImplementaVolumen{

  public static void main(String[] args){
    CalculaVolumen figura1 = new CalculaVolumen(5, 5, 1, 4);
    System.out.println("El volumen del cuadrado es: " + figura1.VolumenCuadrado() + "[m³]");
    CalculaVolumen figura2 = new CalculaVolumen(2, 2, 0, 10);
    System.out.println("El volumen del prisma rectangular es: " + figura2.VolumenPrisRect() + "[m³]");
    CalculaVolumen figura3 = new CalculaVolumen(0, 0, 8, 7);
    System.out.println("El volumen del cilindro es: " + figura3.VolumenCilindro() + "[m³]");
    CalculaVolumen figura4 = new CalculaVolumen(0, 0, 8, 7);
    System.out.println("El volumen de la esfera es: " + figura4.VolumenEsfera() + "[m³]");
    CalculaVolumen figura5 = new CalculaVolumen(0, 0, 7, 3);
    System.out.println("El volumen del cono es: " + figura5.VolumenCono() + "[m³]");
    CalculaVolumen figura6 = new CalculaVolumen(3, 3, 0, 6);
    System.out.println("El volumen de la piramide es: " + figura6.VolumenPiramide() + "[m³]");
  }
}
