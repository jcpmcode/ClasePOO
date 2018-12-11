public class pruebaConstructor
{
  public static void main(String args[])
  {
    //                                            Nombre, Apellido, NSS, calificaciones, ventas, comisiones, faltas
    EmpleadoHereda empleado1= new EmpleadoHereda("Diana","Aviles","123456",5,3000,10, 10);
    EmpleadoHereda empleado2= new EmpleadoHereda("Jose","Paniagua","456789",9,500,7, 2);
    EmpleadoHereda empleado3= new EmpleadoHereda("Juan","Campero","741852",7,1000,8, 2);
    System.out.println("\nEmpleado 1");
    System.out.println("primer nombre: " + empleado1.obtenerPrimerNombre());
    System.out.println("apellido paterno: " + empleado1.obtenerApellidoPaterno());
    System.out.println("numero de seguro social: " + empleado1.obtenerNumeroSeguroSocial());
    System.out.println("Calificacion empresa: " + empleado1.obtenerCalificaciones());
    System.out.println("Calificacion ventas: " + empleado1.obtenerVentas());
    System.out.println("Calificacion empresa: " + empleado1.getCalificaEmpresa());
    System.out.println("bonos extra: " + empleado1.BonosExtra());
    empleado1.bonoEspecial();
    empleado1.alcanzoMeta();
    empleado1.getFaltas();

    System.out.println("\nEmpleado 2");
    System.out.println("primer nombre: " + empleado2.obtenerPrimerNombre());
    System.out.println("apellido paterno: " + empleado2.obtenerApellidoPaterno());
    System.out.println("numero de seguro social: " + empleado2.obtenerNumeroSeguroSocial());
    System.out.println("Calificacion empresa: " + empleado2.obtenerCalificaciones());
    System.out.println("Calificacion ventas: " + empleado2.obtenerVentas());
    System.out.println("Calificacion empresa: " + empleado2.getCalificaEmpresa());
    System.out.println("bonos extra: " + empleado2.BonosExtra());
    empleado2.bonoEspecial();
    empleado2.alcanzoMeta();
    empleado2.getFaltas();

    System.out.println("\nEmpleado 3");
    System.out.println("primer nombre: " + empleado3.obtenerPrimerNombre());
    System.out.println("apellido paterno: " + empleado3.obtenerApellidoPaterno());
    System.out.println("numero de seguro social: " + empleado3.obtenerNumeroSeguroSocial());
    System.out.println("Calificacion empresa: " + empleado3.obtenerCalificaciones());
    System.out.println("Calificacion ventas: " + empleado3.obtenerVentas());
    System.out.println("Calificacion empresa: " + empleado3.getCalificaEmpresa());
    System.out.println("bonos extra: " + empleado3.BonosExtra());
    empleado3.bonoEspecial();
    empleado3.alcanzoMeta();
    empleado3.getFaltas();

    System.out.println("\nLa mejor calificacion para bono especial es: " + Math.max(empleado1.setCalBonoEspecial(), Math.max(empleado2.setCalBonoEspecial(), empleado3.setCalBonoEspecial())));
    System.out.println("El promedio de las calificaciones para bono especial es: " + empleado1.setCalBonoEspecial() + " + " + empleado2.setCalBonoEspecial() + " + " + empleado3.setCalBonoEspecial() + "\n" + (empleado1.setCalBonoEspecial() + empleado2.setCalBonoEspecial() + empleado3.setCalBonoEspecial()) / 3 );

    /*
    Generar tres empleados
    Imprimir todos los datos de los empleados agregando:
    Imprimir calificacion para un bono especial 1

    Imprimir "Bono especial:" Si o No

    Para obtener el bono especial, el empleado debe tener una calificacion mayor
    a 15, se obtiene de la suma de las calificaciones de ventas, calificaciones
    obtenidas y calificaciones de ventas

    Si las ventas son mayores a 2000 imprimir. SE ALCANZO LA META.

    Dias extras de vacaciones: SI/NO. Los dias de vacaciones extra, se obtienen
    si el numero de faltas es menor a tres, se debe agregar una variable de
    instancia a la clase 2, con su respectivo metodo set y get.

    Imprimir al empleado con la mejor calificacion para bono especial, utilizar
    API de JAVA

    Imprimir el promedio de calificaciones para bono especial, utilizar API de JAVA
    */

  }//main

}
