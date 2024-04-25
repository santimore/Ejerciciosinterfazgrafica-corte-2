
package Ejercicio29;

import javax.swing.JOptionPane;

public class Principal29 {
     public static void main(String[] args) {
     float numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero real"));
     double resultado = (Math.pow((double) (numero),3));
     JOptionPane.showMessageDialog(null,"El cubo de numero ingresado es:"+resultado);
   } 
}
