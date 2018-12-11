public class mainAbstract{
  public static void main(String[] args){
    estableceIngreso estIngre = new estableceIngreso("Juan", "Lopez", "2341", 1000);
    System.out.println("Los ingresos del empleado son: " + estIngre.ingresos());
  }
}
