
package Ejercicio12;

import javax.swing.JOptionPane;

public class Principal12 {
      public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número:"));
        double promedio = (num1 + num2 + num3) / 3;
        double suma = num1 + num2 + num3;
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio + "\nLa suma es: " + suma + "\nEl doble del primer número es: " + (num1 * 2) + "\nEl triple del segundo número es: " + (num2 * 3) + "\nEl cuadrado del tercer número es: " + (num3 * num3));
    }
}
