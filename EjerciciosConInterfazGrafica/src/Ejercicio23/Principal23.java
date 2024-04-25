
package Ejercicio23;
import javax.swing.JOptionPane;
public class Principal23 {
     public static void main(String[] args) {

        int[] Digitos = new int[3];
        for(int i = 0;i < Digitos.length; i++){
            Digitos[i] = (int) (Math.random() * 10);
        }
        JOptionPane.showMessageDialog(null,"Binvenido al juego del Rojo-amarillo-verde");
        JOptionPane.showMessageDialog(null,"Intente adivinar los digitos de la mejor forma correcta");

        boolean adivinado = false;

        while (!adivinado) {
            double numeros = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tus tres dígitos separados por espacios (0-9): "));
            int[] intento = new int[3];
            for (int i = 0; i < intento.length; i++) {
                intento[i] = JOptionPane.ABORT;
            }

            int Amarillo = 0;
            int Verde = 0;
            int rojo = 0;

            for (int i = 0; i < intento.length; i++) {
                if (intento[i] == Digitos[i]) {
                    Verde++;
                } else if (contiene(Digitos, intento[i])) {
                    Amarillo++;
                }else{
                    rojo++;
                }

            JOptionPane.showMessageDialog(null,"Verdes: " + Verde);
            JOptionPane.showMessageDialog(null,"Amarillos: " + Amarillo);
            JOptionPane.showMessageDialog(null,"Rojos:"+ rojo);

            if (Verde == 3) {
                adivinado = true;
                JOptionPane.showMessageDialog(null,"¡Ganaste!");
            }
        }
    } 
    
}

    private static boolean contiene(int[] numeros, int i) {
        for (int numero : numeros) {
            if (numero == i) {
                return true;
            }
        }
        return false;
    }
}

