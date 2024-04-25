package Ejercicio13;

import javax.swing.JOptionPane;

public class Principal13 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número:"));
        JOptionPane.showMessageDialog(null, "Los últimos dígitos del primer número son: " + num1 % 10 + "\nLos últimos dígitos del segundo número son: " + num2 % 10 + "\nLos últimos dígitos del tercer número son: " + num3 % 10);
    }
 
}
