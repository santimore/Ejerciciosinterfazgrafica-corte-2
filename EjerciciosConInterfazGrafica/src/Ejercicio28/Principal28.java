
package Ejercicio28;

import javax.swing.JOptionPane;

public class Principal28 {
      public static void main(String[] args) {
        int contador = 7;
        while (contador > 0) {
            JOptionPane.showMessageDialog(null, contador);
            contador--;
        }
        JOptionPane.showMessageDialog(null, "0");
    }
}
