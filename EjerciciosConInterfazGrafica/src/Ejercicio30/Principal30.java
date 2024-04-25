
package Ejercicio30;

import javax.swing.JOptionPane;

public class Principal30 {
    public static void main(String[] args) {
        String distancia_km = JOptionPane.showInputDialog("Introduce la distancia en kilómetros:");
        double distancia_metros = Double.parseDouble(distancia_km) * 1000;
        JOptionPane.showMessageDialog(null, "La distancia en metros es: " + distancia_metros);
    }
}
