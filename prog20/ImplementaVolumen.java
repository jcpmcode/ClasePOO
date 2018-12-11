import javax.swing.JOptionPane;

public class ImplementaVolumen{

  public static void main(String[] args){
    double l1 = 0, l2 = 0, h = 0, hV = 0;
    String lado1, lado2, altura, hVolumen;

    
    String figura = JOptionPane.showInputDialog(null, "Introduzca el nombre de la figura", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
    if (figura.equalsIgnoreCase("cubo")){
      lado1 = JOptionPane.showInputDialog(null, "Introduzca el lado1", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
      l1 = Double.parseDouble(lado1);
      CalculaVolumen figura1 = new CalculaVolumen(l1, l2, h, l1);
      JOptionPane.showMessageDialog(null, "El volumen del cubo es: " + figura1.VolumenCuadrado() + "[m³]", "Volumen de un cubo", JOptionPane.PLAIN_MESSAGE);
    }
    else{
      if (figura.equalsIgnoreCase("prisma rectangular")){
        lado1 = JOptionPane.showInputDialog(null, "Introduzca el lado1", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
        lado2 = JOptionPane.showInputDialog(null, "Introduzca el lado2", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
        hVolumen = JOptionPane.showInputDialog(null, "Introduzca el la altura del volumen de la figura", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
        l1 = Double.parseDouble(lado1);
        l2 = Double.parseDouble(lado2);
        hV = Double.parseDouble(hVolumen);
        // CalculaVolumen figura2 = new CalculaVolumen(2, 2, 0, 10);
        CalculaVolumen figura2 = new CalculaVolumen(l1, l2, h, hV);
        JOptionPane.showMessageDialog(null, "El volumen del prisma rectangular es: " + figura2.VolumenPrisRect() + "[m³]", "Volumen de un prisma rectangular", JOptionPane.PLAIN_MESSAGE);
      }
      else{
        if (figura.equalsIgnoreCase("cilindro")){
          altura = JOptionPane.showInputDialog(null, "Introduzca el radio", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
          hVolumen = JOptionPane.showInputDialog(null, "Introduzca el la altura del cilindro", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
          h = Double.parseDouble(altura);
          hV = Double.parseDouble(hVolumen);
          // CalculaVolumen figura3 = new CalculaVolumen(0, 0, 8, 7);
          CalculaVolumen figura3 = new CalculaVolumen(l1, l2, h, hV);
          JOptionPane.showMessageDialog(null, "El volumen del cilindro es: " + figura3.VolumenCilindro() + "[m³]", "Volumen de un cilindro", JOptionPane.PLAIN_MESSAGE);
        }
        else{
          if (figura.equalsIgnoreCase("esfera")){
            altura = JOptionPane.showInputDialog(null, "Introduzca el radio de la esfera", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
            h = Double.parseDouble(altura);
            // CalculaVolumen figura4 = new CalculaVolumen(0, 0, 8, 0);
            CalculaVolumen figura4 = new CalculaVolumen(l1, l2, h, hV);
            JOptionPane.showMessageDialog(null, "El volumen de la esfera es: " + figura4.VolumenEsfera() + "[m³]", "Volumen de una esfera", JOptionPane.PLAIN_MESSAGE);
          }
          else{
            if (figura.equalsIgnoreCase("cono")){
              altura = JOptionPane.showInputDialog(null, "Introduzca el radio", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
              hVolumen = JOptionPane.showInputDialog(null, "Introduzca el la altura del cono", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
              h = Double.parseDouble(altura);
              hV = Double.parseDouble(hVolumen);
              // CalculaVolumen figura5 = new CalculaVolumen(0, 0, 7, 3);
              CalculaVolumen figura5 = new CalculaVolumen(l1, l2, h, hV);
              JOptionPane.showMessageDialog(null, "El volumen del cono es: " + figura5.VolumenCono() + "[m³]", "Volumen de un cono", JOptionPane.PLAIN_MESSAGE);
            }
            else{
              if (figura.equalsIgnoreCase("piramide")){
                lado1 = JOptionPane.showInputDialog(null, "Introduzca el lado1", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
                lado2 = JOptionPane.showInputDialog(null, "Introduzca el lado2", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
                hVolumen = JOptionPane.showInputDialog(null, "Introduzca el la altura del volumen de la figura", "Calcular volumen de una figura", JOptionPane.QUESTION_MESSAGE);
                l1 = Double.parseDouble(lado1);
                l2 = Double.parseDouble(lado2);
                hV = Double.parseDouble(hVolumen);
                // CalculaVolumen figura6 = new CalculaVolumen(3, 3, 0, 6);
                CalculaVolumen figura6 = new CalculaVolumen(l1, l2, h, hV);
                JOptionPane.showMessageDialog(null, "El volumen de la piramide es: " + figura6.VolumenPiramide() + "[m³]", "Volumen de una piramide", JOptionPane.PLAIN_MESSAGE);
              }
              else{
                JOptionPane.showMessageDialog(null, "ERROR: esa figura no esta dada de alta", "Volumen de una piramide", JOptionPane.WARNING_MESSAGE);
              }
            }
          }
        }
      }
    }
  }
}
