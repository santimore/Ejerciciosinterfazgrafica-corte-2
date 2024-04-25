package Ejercicio4;

import javax.swing.JOptionPane;

public class Principal4 {
      public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio:"));
        double area = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);
    }
}
