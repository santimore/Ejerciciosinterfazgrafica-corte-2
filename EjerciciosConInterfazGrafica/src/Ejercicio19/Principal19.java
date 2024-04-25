
package Ejercicio19;

import javax.swing.JOptionPane;

public class Principal19 {
        public static void main(String[] args) {
        double sueldoBasico, horasExtras, descuento, totalGanado;
        String mensaje;
        
        sueldoBasico = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo básico:"));
        horasExtras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto por horas extras:"));
        
        descuento = sueldoBasico * 0.2;
        totalGanado = sueldoBasico + horasExtras - descuento;
        
        mensaje = "Sueldo básico: " + sueldoBasico + "\n";
        mensaje += "Monto por horas extras: " + horasExtras + "\n";
        mensaje += "Descuento: " + descuento + "\n";
        mensaje += "Total ganado: " + totalGanado;
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
