
package Guia07.actividad4;

import javax.swing.JOptionPane;

public class principal {

    
    public static void main(String[] args) {
                
        String name = JOptionPane.showInputDialog("Su nombre porfavor: ");
        int Num = Integer.parseInt(JOptionPane.showInputDialog("Su edad porfavor: "));
        
        paseo pas = new paseo();
        
        pas.edad(name,Num);
        pas.caminar(name, Num);
        pas.mostrarDatos();
    }
    
}
