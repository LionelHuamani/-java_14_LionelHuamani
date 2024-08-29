
package Guia07.actividad3;

public class Calculando {
    
    //metodos con retorno
    public int suma(int numero1 , int numero2){
        
        int sumar = numero1+numero2;
        return sumar;
       
    } 
     public int dividir(int numero1 , int numero2){
        
        int division= numero1/numero2;
        return division;
     }
     
     public void mostrarDatos(int sumar ,int division){
     
         System.out.println("La suma es: "+ sumar);
         System.out.println("La division es: "+ division);
     }

}
