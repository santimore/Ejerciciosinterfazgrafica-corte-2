package Ejercicio1;
//1. Programa que muestre en pantalla el texto “Fundamentos de Programación”.
public class Principal {
    public static void main(String[] args) {
        Ventana1 ventana1 = new Ventana1();
        ventana1.setTitle("Ejercicio1 con interfaz grafica...");
        ventana1.setLocationRelativeTo(null);
        ventana1.setVisible(true);
    }
}
