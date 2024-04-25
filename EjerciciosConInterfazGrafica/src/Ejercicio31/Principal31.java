
package Ejercicio31;

import javax.swing.JOptionPane;

public class Principal31 {
    
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo en milimetros:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo en milimetros:"));

        int area = (int) ((base * altura)/2);

        JOptionPane.showMessageDialog(null,"El area del triangulo es de:"+""+area+""+"(Milimetros)");
        
        double centimetros_enLaBase = base * 0.1;

        double centimetros_enLaAltura = altura * 0.1;

        double metros_cuadrados_enLaBase = base * 0.001;

        double metros_cuadrasos_enLaAltura = altura * 0.001;
        
        JOptionPane.showMessageDialog(null,"la base tiene: "+centimetros_enLaBase+"(centimetros)"+"\\n tiene:"+ base+"(Milimetros)"+"\n tiene:"+metros_cuadrados_enLaBase+"(Metros cuadrados)");
        JOptionPane.showMessageDialog(null,"la altura tiene: "+centimetros_enLaAltura+"(Centimetros)"+"\\n tiene:"+ altura+"(Milimetros)"+"\\n tiene"+metros_cuadrasos_enLaAltura+"(Metros cuadrados)");

    }
}
