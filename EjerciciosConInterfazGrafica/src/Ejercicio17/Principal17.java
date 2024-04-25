
package Ejercicio17;

import javax.swing.JOptionPane;

public class Principal17 {
       public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));
        if (num1 > num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + num3);
        }
    }
}
