
package Ejercicio14;

import javax.swing.JOptionPane;

public class Principal14 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número de cuatro dígitos:"));
        int suma = (num / 1000) + (num / 100) % 10 + (num / 10) % 10 + num % 10;
        JOptionPane.showMessageDialog(null, "La suma de los dígitos del número es: " + suma);
    } 
}
