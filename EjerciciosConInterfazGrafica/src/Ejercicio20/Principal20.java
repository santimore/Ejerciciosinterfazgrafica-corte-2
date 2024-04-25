
package Ejercicio20;

import javax.swing.JOptionPane;

public class Principal20 {
        public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, nota5, sumaNotas, promedioNotas, dobleNotas;
        String mensaje;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2:"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3:"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 4:"));
        nota5 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 5:"));
        
        sumaNotas = nota1 + nota2 + nota3 + nota4 + nota5;
        promedioNotas = sumaNotas / 5;
        dobleNotas = promedioNotas * 2;
        
        mensaje = "Nota 1: " + nota1 + "\n";
        mensaje += "Nota 2: " + nota2 + "\n";
        mensaje += "Nota 3: " + nota3 + "\n";
        mensaje += "Nota 4: " + nota4 + "\n";
        mensaje += "Nota 5: " + nota5 + "\n";
        mensaje += "Suma de notas: " + sumaNotas + "\n";
        mensaje += "Promedio de notas: " + promedioNotas + "\n";
        mensaje += "Doble de promedio: " + dobleNotas;
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
