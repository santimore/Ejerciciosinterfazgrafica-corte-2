
package Ejercicio16;

import javax.swing.JOptionPane;

public class Ejercicio16 {
      public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota del examen:"));
        if (nota >= 50) {
            JOptionPane.showMessageDialog(null, "Usted gano el examen.");
        } else {
            JOptionPane.showMessageDialog(null, "Usted no gano el examen.");
        }
    }
}
