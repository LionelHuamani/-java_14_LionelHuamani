
package Guia07.actividad2;

public class comida {
    
    //Atributos
    String comida;
    int numero_comida;
    
    
    //Metodos
   public void comer(){
    System.out.println("Mi comida favorita es: " + comida);
}
   public void numero(){
    System.out.println("El numero de platos de comida son: "+numero_comida);
   }
   public void mostrar_datos(){
    System.out.println("\nDatos"+"\nComida: "+comida+"\nPlatos pedidos: "+numero_comida);
   }
}
