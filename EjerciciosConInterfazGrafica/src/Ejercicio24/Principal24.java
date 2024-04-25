package Ejercicio24;
import javax.swing.JOptionPane;
public class Principal24 {
   
   public static void main(String[] args) {
    double pulgadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las pulgadas:"));
    double centimetros = (pulgadas * 2.54);
    JOptionPane.showMessageDialog(null,"los centimetros que hay en dichas pulgadas son:"+centimetros+"Cm");
   } 
}
