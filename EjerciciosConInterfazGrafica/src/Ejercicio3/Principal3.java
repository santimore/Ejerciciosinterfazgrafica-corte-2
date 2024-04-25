
package Ejercicio3;

import javax.swing.JOptionPane;

public class Principal3 {
       public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura:"));
        double area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + area);
    }
}
