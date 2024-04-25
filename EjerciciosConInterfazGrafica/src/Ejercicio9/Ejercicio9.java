
package Ejercicio9;

import javax.swing.JOptionPane;

public class Ejercicio9 {
      public static void main(String[] args) {
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad:"));
        double iva = cantidad * 0.19;
        JOptionPane.showMessageDialog(null, "El IVA sobre la cantidad es: " + iva);
    }
}
