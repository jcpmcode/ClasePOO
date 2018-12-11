import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class CamposTexto extends JFrame{
  private JTextField campoTexto0;
  private JTextField campoTexto1;
  private JTextField campoTexto2; // campos de  texto
  private JTextField campoTexto3;
  private JTextField campoTexto4;
  private JTextField campoTexto5;
  private JTextField campoTexto6;
  private JTextField campoTexto7;
  private JTextField campoTexto8;
  private JTextField campoTexto9; // campos de  texto
  private JTextField campoTexto10;
  private JTextField campoTexto11;
  private JButton Button0, Button1, Button2, Button3, Button4, Button5;
  private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5, etiqueta6;
  double volumen, volumen1, volumen2, volumen3;

  // constructor de CamposTexto agrega objetos del tipo JTextField a JFrame
  public CamposTexto(){
    super("Volumen de figuras");
    setLayout(new FlowLayout());

    // cubo
    Icon cubo = new ImageIcon (getClass().getResource("cubo.png"));
    campoTexto0 = new JTextField ("Valores base", 10); // Puede o no incluir el texto inicial.
    campoTexto1 = new JTextField ("Valor altura", 10); // Puede o no incluir el texto inicial.
    etiqueta1 = new JLabel ("Valores:", cubo, SwingConstants.LEFT); // posicion de la imagen
    Button0 = new JButton("Calcular");
    add (etiqueta1, BorderLayout.EAST); // agrega etiqueta2 a JFrame
    add(campoTexto0); // agrega campoTexto1 a JFrame
    add(campoTexto1); // agrega campoTexto1 a JFrame
    add(Button0);

    // prisma rectangular
    Icon prisma = new ImageIcon (getClass().getResource("prisma.jpeg"));
    campoTexto2 = new JTextField ("Valore-s base", 10); // Puede o no incluir el texto inicial.
    campoTexto3 = new JTextField ("Valor altura", 10); // Puede o no incluir el texto inicial.
    etiqueta2 = new JLabel ("Valores:", prisma, SwingConstants.LEFT); // posicion de la imagen
    Button1 = new JButton("Calcular");
    add (etiqueta2, BorderLayout.EAST); // agrega etiqueta2 a JFrame
    add(campoTexto2); // agrega campoTexto1 a JFrame
    add(campoTexto3); // agrega campoTexto1 a JFrame
    add(Button1);

    // cilindro
    Icon cilindro = new ImageIcon (getClass().getResource("cilindro.png"));
    campoTexto4 = new JTextField ("Valore-s base", 10); // Puede o no incluir el texto inicial.
    campoTexto5 = new JTextField ("Valor altura", 10); // Puede o no incluir el texto inicial.
    etiqueta3 = new JLabel ("Valores:", cilindro, SwingConstants.LEFT); // posicion de la imagen
    Button2 = new JButton("Calcular");
    add (etiqueta3, BorderLayout.EAST); // agrega etiqueta2 a JFrame
    add(campoTexto4); // agrega campoTexto1 a JFrame
    add(campoTexto5); // agrega campoTexto1 a JFrame
    add(Button2);

    // esfera
    Icon esfera = new ImageIcon (getClass().getResource("esfera.png"));
    campoTexto6 = new JTextField ("Valore-s base", 10); // Puede o no incluir el texto inicial.
    campoTexto7 = new JTextField ("Valor altura", 10); // Puede o no incluir el texto inicial.
    etiqueta4 = new JLabel ("Valores:", esfera, SwingConstants.LEFT); // posicion de la imagen
    Button3 = new JButton("Calcular");
    add (etiqueta4, BorderLayout.EAST); // agrega etiqueta2 a JFrame
    add(campoTexto6); // agrega campoTexto1 a JFrame
    add(campoTexto7); // agrega campoTexto1 a JFrame
    add(Button3);

    // cono
    Icon cono = new ImageIcon (getClass().getResource("cono.jpeg"));
    campoTexto8 = new JTextField ("Valore-s base", 10); // Puede o no incluir el texto inicial.
    campoTexto9 = new JTextField ("Valor altura", 10); // Puede o no incluir el texto inicial.
    etiqueta5 = new JLabel ("Valores:", cono, SwingConstants.LEFT); // posicion de la imagen
    Button4 = new JButton("Calcular");
    add (etiqueta5, BorderLayout.EAST); // agrega etiqueta2 a JFrame
    add(campoTexto8); // agrega campoTexto1 a JFrame
    add(campoTexto9); // agrega campoTexto1 a JFrame
    add(Button4);

    // piramide
    Icon piramide = new ImageIcon (getClass().getResource("piramide.png"));
    campoTexto10 = new JTextField ("Valore-s base", 10); // Puede o no incluir el texto inicial.
    campoTexto11 = new JTextField ("Valor altura", 10); // Puede o no incluir el texto inicial.
    etiqueta6 = new JLabel ("Valores:", piramide, SwingConstants.LEFT); // posicion de la imagen
    Button5 = new JButton("Calcular");
    add (etiqueta6, BorderLayout.EAST); // agrega etiqueta2 a JFrame
    add(campoTexto10); // agrega campoTexto1 a JFrame
    add(campoTexto11); // agrega campoTexto1 a JFrame
    add(Button5);

    // registra los manejadores de eventos
    ManejadorCampoTexto manejador = new ManejadorCampoTexto();
    campoTexto0.addActionListener(manejador);
    campoTexto1.addActionListener(manejador);
    campoTexto2.addActionListener(manejador);
    campoTexto3.addActionListener(manejador);
    campoTexto4.addActionListener(manejador);
    campoTexto5.addActionListener(manejador);
    campoTexto6.addActionListener(manejador);
    campoTexto7.addActionListener(manejador);
    campoTexto8.addActionListener(manejador);
    campoTexto9.addActionListener(manejador);
    campoTexto10.addActionListener(manejador);
    campoTexto11.addActionListener(manejador);
  } // fin del constructor de CamposTexto

  // clase interna privada para el manejo de eventos
  private class ManejadorCampoTexto implements ActionListener{
    // procesa los eventos de campo de Texto
    public void actionPerformed(ActionEvent evento){
      String cadena = "";

      // el usuario omprimio Intro en el objeto JTextField campoTexto1
      if (evento.getSource() == campoTexto1){
        volumen = Double.parseDouble(evento.getActionCommand().toString().substring(0,1));
        CalculaVolumen cubo = new CalculaVolumen(volumen, 0, 0, volumen);
        JOptionPane.showMessageDialog(null, cubo.VolumenCuadrado());
      }
      else if(evento.getSource() == campoTexto2){
        volumen = Double.parseDouble(evento.getActionCommand().toString().substring(0,1));
      }
      else if(evento.getSource() == campoTexto2){
        volumen = Double.parseDouble(evento.getActionCommand().toString().substring(0,1));
        volumen1 = Double.parseDouble(evento.getActionCommand().toString().substring(1,2));
        volumen2 = Double.parseDouble(evento.getActionCommand().toString().substring(2,3));
        CalculaVolumen prisma = new CalculaVolumen(volumen, volumen1, 0, volumen2);
        JOptionPane.showMessageDialog(null, prisma.VolumenPrisRect());
      }
      else if(evento.getSource() == campoTexto3){
        volumen = Double.parseDouble(evento.getActionCommand().toString().substring(0,1));
        volumen1 = Double.parseDouble(evento.getActionCommand().toString().substring(1,2));
        CalculaVolumen cilindro = new CalculaVolumen(0, 0, volumen, volumen1);
        JOptionPane.showMessageDialog(null, cilindro.VolumenCilindro());
      }
      else if(evento.getSource() == campoTexto4){
        volumen = Double.parseDouble(evento.getActionCommand().toString().substring(0,1));
        CalculaVolumen esfera = new CalculaVolumen(0, 0, volumen, 0);
        JOptionPane.showMessageDialog(null, esfera.VolumenEsfera());
      }
      else if(evento.getSource() == campoTexto5){
        volumen = Double.parseDouble(evento.getActionCommand().toString().substring(0,1));
        volumen1 = Double.parseDouble(evento.getActionCommand().toString().substring(1,2));
        CalculaVolumen cono = new CalculaVolumen(0, 0, volumen, volumen1);
        JOptionPane.showMessageDialog(null, cono.VolumenCono());
      }
      else if(evento.getSource() == campoTexto6){
        volumen = Double.parseDouble(evento.getActionCommand().toString().substring(0,1));
        volumen1 = Double.parseDouble(evento.getActionCommand().toString().substring(1,2));
        volumen2 = Double.parseDouble(evento.getActionCommand().toString().substring(2,3));
        CalculaVolumen piramide = new CalculaVolumen(volumen, volumen1, 0, volumen2);
        JOptionPane.showMessageDialog(null, piramide.VolumenPiramide());
      }
    }
  }
}
