import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class CamposTexto extends JFrame{
  private JTextField campoTexto1;
  private JTextField campoTexto2; // campos de  texto
  private JTextField campoTexto3;
  private JPasswordField campoContrasenia; // campo de contraseña
  private JLabel etiqueta2, etiqueta3;

  // constructor de CamposTexto agrega objetos del tipo JTextField a JFrame
  public CamposTexto(){
    super("Prueba de JTextField y JPasswordField clase de JAVA");
    setLayout(new FlowLayout());
    // Podemos mencionar: new BorderLayout south, north, etc
    // new FlowLayout(): en lineas
    // nuevo GridLayout (2, 3). Cuadricula
    // construye campo de texto tamaño 5
    campoTexto1 = new JTextField ("Campo de Texto 1", 8); // Puede o no incluir el texto inicial.
    campoTexto1.setLocation(50, 40);
    add(campoTexto1); // agrega campoTexto1 a JFrame
    campoTexto2 = new JTextField ("Campo de Texto 2");
    add(campoTexto2);
    campoTexto3 = new JTextField ("Campo de texto no editable", 21);
    campoTexto3.setEditable (false); // deshabilita la edición.
    add (campoTexto3); // agrega campoTexto3 a JFrame

    Icon ibero = new ImageIcon (getClass().getResource("Ibero.png"));
    etiqueta2 = new JLabel ("Etiqueta con texto e icono", ibero, SwingConstants.CENTER); // posicion de la imagen
    etiqueta2.setToolTipText ("Esta es etiqueta2");
    add (etiqueta2, BorderLayout.WEST); // agrega etiqueta2 a JFrame

    // construye campo de contraseña con texto predeterminado
    campoContrasenia = new JPasswordField ("Texto oculto");
    add (campoContrasenia); // agrega campoContrasenia a JFrame

    // registra los manejadores de eventos
    ManejadorCampoTexto manejador = new ManejadorCampoTexto();
    campoTexto1.addActionListener(manejador);
    campoTexto2.addActionListener(manejador);
    campoTexto3.addActionListener(manejador);
    campoContrasenia.addActionListener(manejador);
  } // fin del constructor de CamposTexto

  // clase interna privada para el manejo de eventos
  private class ManejadorCampoTexto implements ActionListener{
    // procesa los eventos de campo de Texto
    public void actionPerformed(ActionEvent evento){
      String cadena = "";

      // el usuario omprimio Intro en el objeto JTextField campoTexto1
      if (evento.getSource() == campoTexto1)
      cadena = String.format ("Contenido text1: " + evento.getActionCommand());

      // el usuario oprimio Intro en el objeto JTextField campoTexto2
      else if (evento.getSource() == campoTexto2)
      cadena = String.format ("campoTexto2: " + evento.getActionCommand());

      // el usuario oprimio Intro en el objeto JTextField campoTexto2
      else if (evento.getSource() == campoTexto3)
      cadena = String.format ("campoTexto3: %s", evento.getActionCommand());

      // el usuario oprimio Intro en el objeto JTextField campoContrasenia
      else if (evento.getSource() == campoContrasenia)
      cadena = String.format ("campoContrasenia: %s", new String (campoContrasenia.getPassword()));

      // muestra el contenido del objeto JTextField
      JOptionPane.showMessageDialog (null, cadena);
    }
  }
}
