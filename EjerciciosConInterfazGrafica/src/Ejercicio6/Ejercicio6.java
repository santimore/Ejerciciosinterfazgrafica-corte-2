
package Ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6 {
     public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer numero:"));
        double media = (num1 + num2 + num3) / 3;
        JOptionPane.showMessageDialog(null, "La media aritmetica es: " + media);
    }
}
