import java.awt.GridLayout;

import javax.swing.JFrame;

public class PruebaCampoTexto{
  public static void main(String[] args) {
    CamposTexto campoTextoMarco = new CamposTexto();
    campoTextoMarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    campoTextoMarco.setSize (600, 600); // establece el tamaño del marco
    campoTextoMarco.setVisible (true); // muestra el marco
  } // fin de main
} // fin de la clase
