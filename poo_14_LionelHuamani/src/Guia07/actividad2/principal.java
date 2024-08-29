
package Guia07.actividad2;

import javax.swing.JOptionPane;


public class principal {

    
    public static void main(String[] args) {
       comida comer = new comida();
       
       comer.comida= JOptionPane.showInputDialog("Ingrese su plato de comida: ");
       comer.numero_comida= Integer.parseInt(JOptionPane.showInputDialog("Cuantos platos quiere? "));
       comer.mostrar_datos();
    }
    
}
