
package Ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {
     public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dividendo:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el divisor:"));
        int resto = num1 % num2;
        JOptionPane.showMessageDialog(null, "El resto de la division es: " + resto);
    }

}
