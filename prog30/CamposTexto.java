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

  List <String> lista = new LinkedList <String>();

  // constructor de CamposTexto agrega objetos del tipo JTextField a JFrame
  public CamposTexto(){
    super("Guardar nombres en archivo");
    setLayout(new FlowLayout());

    etiqueta1 = new JLabel ("Nombres:", SwingConstants.LEFT); // posicion de la imagen
    campoTexto0 = new JTextField ("", 10); // Puede o no incluir el texto inicial.
    Button0 = new JButton("Agregar");
    Button1 = new JButton("Borrar");
    Button2 = new JButton("Abrir archivo");
    TextArea0 = new JTextArea("", 20, 20);
    TextArea0.setLineWrap(true);
    TextArea0.setWrapStyleWord(true);
    TextArea0.setEditable(false);
    add (etiqueta1, BorderLayout.EAST); // agrega etiqueta2 a JFrame
    add(campoTexto0); // agrega campoTexto1 a JFrame
    add(Button0);
    add(Button1);
    add(Button2);
    add(TextArea0);

    // registra los manejadores de eventos
    ManejadorCampoTexto manejador = new ManejadorCampoTexto();
    campoTexto0.addActionListener(manejador);
    Button0.addActionListener(manejador);
    Button1.addActionListener(manejador);
    Button2.addActionListener(manejador);
  } // fin del constructor de CamposTexto

  public void leerArchivo( List< String > lista )
  {
    try{
      lista.clear();
      campoTexto0.setText("");
      BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
      String strArray = reader.readLine();// read next line
      String[] strSplit = strArray.split(" ");
      for(int i = 0; i < strSplit.length; i++) {
        lista.add(strSplit[i]);
      }
      reader.close();
      imprimirLista(lista);
    } // try
    catch (Exception e){//Catch exception if any
      System.err.println("Error: " + e.getMessage());
    } // catch
  }

  public void imprimirLista( List< String > lista )
  {
    TextArea0.setText("");
    for ( String personas1 : lista )
    TextArea0.append(personas1 + "\n");
  }

  public boolean validaCampoTexto(){
    if ((campoTexto0.getText()).equals("")){
      JOptionPane.showMessageDialog(null, "El campo de texto no puede quedar vacio");
      return false;
    }
    return true;
  }

  public void imprimirArchivo( List< String > lista )
  {
    try{
      BufferedWriter out = new BufferedWriter(new FileWriter ("archivo.txt"));
      for ( String personas1 : lista )
      out.write(personas1 + " ");
      out.close();
    } // try
    catch (Exception e){//Catch exception if any
      System.err.println("Error: " + e.getMessage());
    } // catch
  }

  // clase interna privada para el manejo de eventos
  private class ManejadorCampoTexto implements ActionListener{
    // procesa los eventos de campo de Texto
    public void actionPerformed(ActionEvent evento){
      String cadena;

      if (evento.getSource() == Button0){
        if (validaCampoTexto() == true){
          cadena = campoTexto0.getText();
          lista.add(cadena);
          imprimirLista(lista);
          imprimirArchivo(lista);
          campoTexto0.setText("");
        }
      }
      if (evento.getSource() == Button1){
        if (validaCampoTexto() == true){
          cadena = campoTexto0.getText();
          lista.remove(cadena);
          imprimirLista(lista);
          imprimirArchivo(lista);
          campoTexto0.setText("");
        }
      }
      if (evento.getSource() == Button2){
        leerArchivo(lista);
      }
    }
  }
}
