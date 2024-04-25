
package Ejercicio25;

import javax.swing.JOptionPane;

public class Principal25 {
    public static void main(String[] args) {
        double gradosCentigrados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese  la cantidad de grados centigrados:"));
        //Calculo del valor en fahrenheit
        double conversión = (gradosCentigrados * 9 / 5)+ 32;
        JOptionPane.showMessageDialog(null,"La convercion es :"+conversión);
    }
}
