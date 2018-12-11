public class EmpleadoDeclara extends Object
{
  private String Nombre;
  private String aPaterno;
  private String nSS;
  private double CalificacionesObtenidas; // un promedio de calificaciones menor a 5 es 0, mayor 10
  private double CalVentas; //Ventas mayores a 2000 asigna 10, otro caso 0
  private double Ventas;



  //constructor 5

  public EmpleadoDeclara (String nombre, String apellido, String nss, double calificaciones, double ventas, double comisiones)
  {
    Nombre=nombre;
    aPaterno=apellido;
    nSS=nss;
    establecerCalificaciones(calificaciones);
    establecerVentas(ventas);
    // System.out.println("constructor EmpleadoDeclara");
  }//fin del constructor

  public void establecerPrimerNombre(String nombre)
  {
    Nombre=nombre;
  }//establecerPrimerNombre

  public String obtenerPrimerNombre()
  {
    return Nombre;
  }//obtener Primer nombre

  public void establecerApellidoPaterno(String apellido)
  {
    aPaterno=apellido;

  }

  public String obtenerApellidoPaterno()
  {

    return aPaterno;
  }

  public void establecerNumerosSeguroSocial(String nss)
  {
    nSS=nss;
  }

  public String obtenerNumeroSeguroSocial()
  {

    return nSS;
  }

  //EVALUACIONES DEL EMPLEADO

  public void establecerCalificaciones(double califica)
  {
    CalificacionesObtenidas=(califica<5.0)?0.0:10;

  }
  public double obtenerCalificaciones()
  {
    return CalificacionesObtenidas;

  }

  public void establecerVentas (double venta)
  {
    CalVentas = (venta > 2000) ? 10 : 0;

  }//establecerVentas

  public double obtenerVentas()
  {
    return CalVentas;

  }
  
}
