
package Guia07.actividad1;

public class calculadora {
    public Double ecuacion;
    public void calcular_suma(Double numero_one , Double numero_two){
    ecuacion = numero_one + numero_two;
    }   
    public void calcular_resta(Double numero_one , Double numero_two){
    ecuacion = numero_one - numero_two;
    }  
    public void calcular_multiplicar(Double numero_one , Double numero_two){
    ecuacion = numero_one * numero_two;
    }  
    public void calcular_dividir(Double numero_one , Double numero_two){
    ecuacion = numero_one / numero_two;    
    }   
}
