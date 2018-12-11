public class estableceIngreso extends ClaseAbstracta{
  private double salario;
  private double ingresoFinal;

  public estableceIngreso(String nombre, String apellido, String nss, double ingreso){
    super(nombre, apellido, nss);
    salario = ingreso;
  }
@Override
  public double ingresos(){
    ingresoFinal = salario + 10;
    return ingresoFinal;
  }
}
