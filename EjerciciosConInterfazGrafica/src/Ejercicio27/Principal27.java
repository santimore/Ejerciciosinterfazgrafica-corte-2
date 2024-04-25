
package Ejercicio27;

import javax.swing.JOptionPane;

public class Principal27 {
    public static void main(String[] args) {
      String nombre = String.format(JOptionPane.showInputDialog("Ingrese su nombres:"));
      String genero = String.format(JOptionPane.showInputDialog("Ingrese su genero (M para masculino / F para femeninos):"));
        if (genero.equals("M")) {
            JOptionPane.showMessageDialog(null,"Bienvenido:"+nombre);
        } else if (genero.equals("F")) {
            JOptionPane.showMessageDialog(null,"Bienvenida:"+nombre);
        }else{
            JOptionPane.showMessageDialog(null,"Bienvenido@:"+nombre);
        } 
    }
}
