package Ejercicio11;

import javax.swing.JOptionPane;

public class Principal11 {
     public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura:"));
        double area = base * altura;
        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + area);
    }
}
