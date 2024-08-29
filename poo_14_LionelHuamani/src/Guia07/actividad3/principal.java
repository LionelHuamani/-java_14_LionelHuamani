package Guia07.actividad3;

import javax.swing.JOptionPane;


public class principal {

   
    public static void main(String[] args) {
      
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        Calculando cal = new Calculando();
        
        int suma = cal.suma(num1, num2);
        int división = cal.dividir(num1, num2);
        
        cal.mostrarDatos(suma, división);
                
    }
    
}
