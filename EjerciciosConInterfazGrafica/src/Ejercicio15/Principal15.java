
package Ejercicio15;

import javax.swing.JOptionPane;

public class Principal15 {
     public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Usted es mayor de edad.");
        } else {
            JOptionPane.showMessageDialog(null, "Usted es menor de edad.");
        }
    }
}
