import javax.swing.JOptionPane;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class archivoNombres{

  public static void main(String[] args){
    String lado1, lado2, altura, hVolumen;

    CamposTexto campoTextoMarco = new CamposTexto();    
    campoTextoMarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    campoTextoMarco.setSize (600, 600); // establece el tamaño del marco
    campoTextoMarco.setVisible (true); // muestra el marco
  }
}
