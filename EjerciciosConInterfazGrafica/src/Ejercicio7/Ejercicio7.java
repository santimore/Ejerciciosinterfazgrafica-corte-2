
package Ejercicio7;

import javax.swing.JOptionPane;

public class Ejercicio7 {
      public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero:"));
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "El numero es positivo");
        } else if (num < 0) {
            JOptionPane.showMessageDialog(null, "El numero es negativo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es cero");
        }
    } 
}
