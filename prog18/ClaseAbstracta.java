public abstract class ClaseAbstracta{
  private String primerNombre;
  private String apellidoPaterno;
  private String numeroSeguroSocial;

  public ClaseAbstracta (String nombre, String apelldo, String nss){
    primerNombre = nombre;
    apellidoPaterno = apelldo;
    numeroSeguroSocial = nss;
  }

  public abstract double ingresos();
}
