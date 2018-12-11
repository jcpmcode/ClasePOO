import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class figuras extends JFrame
{
  private JTextField campoTexto1;
  private JTextField campoTexto2;//campos de texto
  private JTextField campoTexto3;
  private JTextField campoTexto4;
  private JTextField campoTexto5;
  private JTextField campoTexto6;
  private JTextField campoTextoI;
  private JTextField campoTextoII;
  private JTextField campoTextoIII;
  private JTextField campoTextoIV;
  private JTextField campoTextoV, campoT1, campoT2;
  private JTextField ccono, cpiramide1,cpiramide2;
  private JLabel etiqueta1, etiqueta2;
  private JLabel etiqueta3, etiqueta4;
  private JLabel etiqueta5, etiqueta6;
  private JButton volumencubo1, volumenprisma2, vcono, vesfera, vpiramide, vcilindro;


  double volum=0, volum1=0, volum2=0;
  //constructor de CamposTexto agrega objetos del tipo JTextField a JFrame
  boolean continuarCiclo= true;
  //CalculaVolumen volumenes = new CalculaVolumen(0,0,0,0);

  public figuras()
  {
    super("VOLUMEN FIGURAS");
    setLayout(new GridLayout(6,5)); //establece el esquema del marco
    //Podemos mencionar: new BorderLAyout south, north, etc
    //new FLowLayout(): en líneas.
    //nuevo GridLAyout (2,3). Cuadricula

    //construye campo de texto "tamaño 5"
    //el texto inicial

    Icon cubo= new ImageIcon(getClass().getResource("cubo.png"));
    campoTexto1 = new JTextField("Base",8); //Puede o no incluir
    campoTextoI = new JTextField("",8);
    campoTextoII = new JTextField("",8);
    etiqueta1 = new JLabel ("Cubo",cubo, SwingConstants.CENTER); //POSICIÓN DE LA IMAGEN
    etiqueta1.setToolTipText("Cada digito es un valor");
    volumencubo1= new JButton("Volumen Cubo");
    campoTextoI.setEditable(false);
    campoTextoII.setEditable(false);
    add(etiqueta1,BorderLayout.WEST);
    add(campoTexto1); //agrega a JFram
    add(campoTextoI); //agrega a JFram
    add(campoTextoII); //agrega a JFram
    add(volumencubo1);

    Icon prismaR= new ImageIcon(getClass().getResource("prisma.png"));
    campoTexto2 = new JTextField("",8); //Puede o no incluir
    campoTextoIV = new JTextField("",8);
    campoTextoV = new JTextField("",8);
    etiqueta2 = new JLabel ("Prisma",prismaR, SwingConstants.CENTER); //POSICIÓN DE LA IMAGEN
    etiqueta2.setToolTipText("Cada digito es un valor");
    volumenprisma2= new JButton("Volumen prisma");
    add(etiqueta2,BorderLayout.WEST);
    add(campoTexto2); //agrega a JFra}
    add(campoTextoIV); //agrega a JFram
    add(campoTextoV); //agrega a JFram
    add(volumenprisma2);


    Icon esferuki= new ImageIcon(getClass().getResource("esfera.png"));
    campoTexto3 = new JTextField("",8); //Puede o no incluir
    campoTextoI = new JTextField("",8);
    campoTextoII = new JTextField("",8);
    etiqueta3 = new JLabel ("Esfera",esferuki, SwingConstants.CENTER); //POSICIÓN DE LA IMAGEN
    etiqueta3.setToolTipText("Cada digito es un valor");
    vesfera= new JButton("Volumen esfera");
    campoTextoI.setEditable(false);
    campoTextoII.setEditable(false);
    add(etiqueta3,BorderLayout.WEST);
    add(campoTexto3); //agrega a JFra
    add(campoTextoI); //agrega a JFram
    add(campoTextoII); //agrega a JFram
    add(vesfera);

    Icon cilindro2= new ImageIcon(getClass().getResource("cilindro.png"));
    campoTexto4 = new JTextField("",8); //Puede o no incluir
    campoT1 = new JTextField("",8);
    campoT2 = new JTextField("",8);
    etiqueta4 = new JLabel ("Cilindro",cilindro2, SwingConstants.CENTER); //POSICIÓN DE LA IMAGEN
    etiqueta4.setToolTipText("Cada digito es un valor");
    vcilindro= new JButton("Volumen cilindro");
    campoT2.setEditable(false);
    add(etiqueta4,BorderLayout.WEST);
    add(campoTexto4); //agrega a JFra
    add(campoT1); //agrega a JFram
    add(campoT2); //agrega a JFram
    add(vcilindro);

    Icon conito= new ImageIcon(getClass().getResource("cono.jpeg"));
    campoTexto5 = new JTextField("",8); //Puede o no incluir
    ccono= new JTextField("",8);
    campoTextoII = new JTextField("",8);
    etiqueta5 = new JLabel ("Cono",conito, SwingConstants.CENTER); //POSICIÓN DE LA IMAGEN
    etiqueta5.setToolTipText("Cada digito es un valor");
    vcono= new JButton("Volumen cono");
    campoTextoII.setEditable(false);
    add(etiqueta5,BorderLayout.WEST);
    add(campoTexto5); //agrega a JFra
    add(ccono); //agrega a JFra
    add(campoTextoII); //agrega a JFram
    add(vcono);

    Icon pr= new ImageIcon(getClass().getResource("piramide.png"));
    campoTexto6 = new JTextField("",8); //Puede o no incluir
    cpiramide1 = new JTextField("",8);
    cpiramide2= new JTextField("",8);
    etiqueta6 = new JLabel ("Piramide",pr, SwingConstants.CENTER); //POSICIÓN DE LA IMAGEN
    etiqueta6.setToolTipText("Cada digito es un valor");
    vpiramide= new JButton("Volumen Piramide");
    add(etiqueta6,BorderLayout.WEST);
    add(campoTexto6); //agrega a JFra
    add(cpiramide1); //agrega a JFra
    add(cpiramide2); //agrega a JFram
    add(vpiramide);



    //registra los manejadores de eventos
    ManejadorCampoTexto manejador = new ManejadorCampoTexto();
    campoTexto1.addActionListener(manejador);
    campoTextoI.addActionListener(manejador);
    campoTextoII.addActionListener(manejador);
    campoTextoIV.addActionListener(manejador);
    campoTextoV.addActionListener(manejador);
    campoTexto2.addActionListener(manejador);
    campoTexto3.addActionListener(manejador);
    campoTexto4.addActionListener(manejador);
    campoTexto5.addActionListener(manejador);
    campoTexto6.addActionListener(manejador);
    volumencubo1.addActionListener(manejador);
    volumenprisma2.addActionListener(manejador);
    vesfera.addActionListener(manejador);
    vcilindro.addActionListener(manejador);
    campoT1.addActionListener(manejador);
    campoT2.addActionListener(manejador);
    vcono.addActionListener(manejador);
    ccono.addActionListener(manejador);
    vpiramide.addActionListener(manejador);
    cpiramide1.addActionListener(manejador);
    cpiramide2.addActionListener(manejador);



  }

  //clase interna provada para el maneko de evennntos
  private class ManejadorCampoTexto implements ActionListener
  {
    //procesa los eventos de cmpo de texto
    public void actionPerformed( ActionEvent evento)
    {

      do{
        try{

          //el usuario oprimio INtro en el objeto JTextFIeld campoTexto1
          if(evento.getSource() == volumencubo1){
            volum = Double.parseDouble(campoTexto1.getText());
            CalculaVolumen figura1 = new CalculaVolumen(volum,volum,0,volum);
            JOptionPane.showMessageDialog(null,figura1.volumenCalculado());
            continuarCiclo=false;
          }


          else if(evento.getSource() == volumenprisma2){
            volum = Double.parseDouble(campoTexto2.getText());
            volum1 = Double.parseDouble(campoTextoIV.getText());
            volum2 = Double.parseDouble(campoTextoV.getText());

            CalculaVolumen figura2 = new CalculaVolumen(volum,volum1,0,volum2);
            JOptionPane.showMessageDialog(null,figura2.volumenCalculadoPrisma());
            continuarCiclo=false;
          }

          else if(evento.getSource() == vesfera){
            volum = Double.parseDouble(campoTexto3.getText());
            CalculaVolumen figura3 = new CalculaVolumen(0,0,volum,0);
            JOptionPane.showMessageDialog(null,figura3.volumenCalculadoEsfera());
            continuarCiclo=false;
          }

          else if(evento.getSource() == vcilindro){
            volum = Double.parseDouble(campoTexto4.getText());
            volum1 = Double.parseDouble(campoT1.getText());
            CalculaVolumen figura4 = new CalculaVolumen(0,0,volum,volum1);
            JOptionPane.showMessageDialog(null,figura4.volumenCalculadoCilindro());
          }

          else if(evento.getSource() == vcono){
            volum = Double.parseDouble(campoTexto5.getText());
            volum1 = Double.parseDouble(ccono.getText());
            CalculaVolumen figura5 = new CalculaVolumen(0,0,volum,volum1);
            JOptionPane.showMessageDialog(null,figura5.volumenCalculadoCono());
            continuarCiclo=false;
          }

          else if(evento.getSource() == vpiramide){
            volum = Double.parseDouble(campoTexto6.getText());
            volum1 = Double.parseDouble(cpiramide1.getText());
            volum2 = Double.parseDouble(cpiramide2.getText());
            CalculaVolumen figura6 = new CalculaVolumen(volum,volum1,0,volum2);
            JOptionPane.showMessageDialog(null,figura6.volumenCalculadoPiramide());
            continuarCiclo=false;
          }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"mal");
          campoTexto1.setText("");
          campoTexto2.setText("");
          campoTexto3.setText("");
          campoTexto4.setText("");
          campoTexto5.setText("");
          campoTexto6.setText("");
          campoTextoI.setText("");
          campoTextoII.setText("");
          campoTextoIII.setText("");
          campoTextoIV.setText("");
          campoTextoV.setText("");
          campoT1.setText("");
          campoT2.setText("");
          ccono.setText("");
          cpiramide1.setText("");
          cpiramide2.setText("");

}
      }while(continuarCiclo);

    }
  }
}
