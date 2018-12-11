import java.util.Random;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;


public class SubMayorNums implements Runnable{

  List <Integer> lista = new LinkedList <Integer>();

  public SubMayorNums(int n[]){
    for (int i = 0; i < n.length; i++){
      lista.add(n[i]);
    }
    Collections.sort(lista);
    lista.getLast();
  }

  // el método run contiene el código que ejecutará un subproceso
  public void run(){

  } // fin run
} // fin TareaImprimir
