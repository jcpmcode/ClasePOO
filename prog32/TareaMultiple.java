import java.util.Random;

public class TareaMultiple implements Runnable{

  private final int tiempoInactividad; // tiempo de inactividad aleatorio para el subproceso
  private final String nombreTarea;
  private final static Random generador = new Random();

  public TareaMultiple(String nombre){
    nombreTarea = nombre;
    tiempoInactividad = generador.nextInt(5000); // milisegundos 0 y 5 segundos
  }

  // el método run contiene el código que ejecutará un subproceso
  public void run(){
    try{ // deja el subproceso inactivo durante el tiempoInactividad segundos
      System.out.println(nombreTarea + " va a estar inactivo durante " + tiempoInactividad + "milisegundos");
      Thread.sleep(tiempoInactividad); // deja el subproceso inactivo
    }
    catch (InterruptedException excepcion){
      System.out.println(nombreTarea + "termino en forma prematura, debido a la interrupcion");
    } // fin de catch

    System.out.println(nombreTarea + " termino su inactividad");
  } // fin run
} // fin TareaImprimir
