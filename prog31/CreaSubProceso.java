import java.lang.Thread;

public class CreaSubProceso{

  public static void main(String[] args) {
    System.out.println("Creacion de subprocesos");

    // crea cada subproceso con un nuevo objeto Runnable
    Thread subproceso1 = new Thread(new TareaMultiple("tarea1POO"));
    Thread subproceso2 = new Thread(new TareaMultiple("tarea2"));
    Thread subproceso3 = new Thread(new TareaMultiple("tarea3"));

    System.out.println("Subprocesos creados, iniciando tareas.");

    // inicia los subprocesos y los coloca en el estado "en ejecucion"
    subproceso1.start(); // invoca al metodo run de tarea1
    subproceso2.start(); // invoca al metodo run de tarea2
    subproceso3.start(); // invoca al metodo run de tarea3

    System.out.println("Tareas iniciadas, main termina.\n");
  } // fin de main
}
