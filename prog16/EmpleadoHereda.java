public class EmpleadoHereda extends EmpleadoDeclara
{
  private double calificaEmpresa; //Empresa establece calificacion entre 0 y 10
  private double CVentas;
  private int Faltas;
  private Double CalBono;

  //constructor 6

  public EmpleadoHereda(String nombre,String apellido, String nss, double calificaciones, double ventas, double comisiones, int faltas)
  {
    super(nombre,apellido,nss,calificaciones,ventas, comisiones); // super es para pasar datos del hijo al padre
    establecerCalificaEmpresa(comisiones);
    obtenerCantVentas(ventas);
    setCalBonoEspecial();
    setFaltas(faltas);
    // System.out.printf("Constructor de EmpleadoHereda");
  }

  public void establecerCalificaEmpresa(double valor)
  {
    calificaEmpresa=valor;
  }

  public double getCalificaEmpresa()
  {
    return calificaEmpresa;
  }

  public double BonosExtra()
  {
    return getCalificaEmpresa() + super.obtenerVentas();
  }

  public double setCalBonoEspecial(){
    CalBono = super.obtenerVentas() + super.obtenerCalificaciones() + calificaEmpresa;
    return CalBono;
  }

  public void bonoEspecial(){
    System.out.println("Bono especial: ");
    if (CalBono > 15){
      System.out.println("Si");
    }
    else{
      System.out.println("No");
    }
  }

  public void alcanzoMeta(){
    if (CVentas > 2000){
      System.out.print("Se ");
    }
    else{
      System.out.print("No se ");
    }
    System.out.println("alcanzo la meta.");
  }

  public void obtenerCantVentas(double ventas){
    CVentas = ventas;
  }

  public void setFaltas(int faltas){
    Faltas = faltas;
  }

  public void getFaltas(){
    if (Faltas < 3){
      System.out.print("Tiene ");
    }
    else{
      System.out.print("No tiene ");
    }
    System.out.println("dias de vacaciones extra.");
  }

}//class
