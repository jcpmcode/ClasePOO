import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ListIterator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CamposTexto extends JFrame{
  private JTextField campoTexto0;
  private JButton Button0, Button1, Button2;
  private JLabel etiqueta1;
  private JTextArea TextArea0;

  ArrayList <String> lista = new ArrayList<String>();
  ArrayList <String> Lunes = new ArrayList<String>();
  ArrayList <String> Jueves = new ArrayList<String>();
  ArrayList <String> Viernes = new ArrayList<String>();

  // constructor de CamposTexto agrega objetos del tipo JTextField a JFrame
  public CamposTexto(){
    super("Leer archivo");
    setLayout(new FlowLayout());

    Button0 = new JButton("Lunes");
    Button1 = new JButton("Jueves");
    Button2 = new JButton("Viernes");
    TextArea0 = new JTextArea("", 20, 20);
    TextArea0.setLineWrap(true);
    TextArea0.setWrapStyleWord(true);
    TextArea0.setEditable(false);
    add(Button0);
    add(Button1);
    add(Button2);
    add(TextArea0);

    // registra los manejadores de eventos
    ManejadorCampoTexto manejador = new ManejadorCampoTexto();
    Button0.addActionListener(manejador);
    Button1.addActionListener(manejador);
    Button2.addActionListener(manejador);
  } // fin del constructor de CamposTexto

  public void leerArchivo( ArrayList< String > lista , ArrayList< String > Lunes, ArrayList< String > Jueves, ArrayList< String > Viernes, int n)
  {
    try{
      String strArray = "";
      lista.clear();
      BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
      while ((strArray = reader.readLine()) != null){
        String[] strSplit = strArray.split(" ");
        lista.add(strArray);
        Lunes.clear();
        Jueves.clear();
        Viernes.clear();        
      }
      reader.close();
      for ( String personas1 : lista ){
        if (personas1.charAt(0) == 'L'){
          Lunes.add(personas1);
        }
        else if (personas1.charAt(0) == 'J'){
          Jueves.add(personas1);
        }
        else if (personas1.charAt(0) == 'V'){
          Viernes.add(personas1);
        }
      }
      imprimirLista(lista, n);
    } // try
    catch (Exception e){//Catch exception if any
      System.err.println("Error: " + e.getMessage());
    } // catch
  }

  public void imprimirLista( ArrayList< String > lista , int n)
  {
    switch (n){
      case 1:
      for ( String personas1 : Lunes ){
        TextArea0.append(personas1 + "\n");
      }
      break;
      case 2:
      for ( String personas1 : Jueves ){
        TextArea0.append(personas1 + "\n");
      }
      break;
      case 3:
      for ( String personas1 : Viernes ){
        TextArea0.append(personas1 + "\n");
      }
      break;
    }
  }

  // clase interna privada para el manejo de eventos
  private class ManejadorCampoTexto implements ActionListener{
    // procesa los eventos de campo de Texto
    public void actionPerformed(ActionEvent evento){
      String cadena;

      TextArea0.setText("");
      if (evento.getSource() == Button0){
        leerArchivo(lista, Lunes, Jueves, Viernes, 1);
      }
      if (evento.getSource() == Button1){
        leerArchivo(lista, Lunes, Jueves, Viernes, 2);
      }
      if (evento.getSource() == Button2){
        leerArchivo(lista, Lunes, Jueves, Viernes, 3);
      }
    }
  }
}
