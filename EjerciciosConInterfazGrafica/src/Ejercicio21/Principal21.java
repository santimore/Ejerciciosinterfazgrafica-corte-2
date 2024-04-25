
package Ejercicio21;

import javax.swing.JOptionPane;

public class Principal21 {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int temp = a;
        a = b;
        b = temp;
        JOptionPane.showMessageDialog(null,"A es"+"="+ a +"....."+
                                                        "B es"+"="+b );
    }
}


