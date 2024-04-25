
package Ejercicio22;

import javax.swing.JOptionPane;

public class Principal22 {
     public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero real:"));
        int parteEntera = (int) numero;
        double parteDecimal = numero - parteEntera;
        JOptionPane.showMessageDialog(null, "La parte entera es: " + parteEntera + "\nLa parte decimal es: " + parteDecimal);
    }

}
