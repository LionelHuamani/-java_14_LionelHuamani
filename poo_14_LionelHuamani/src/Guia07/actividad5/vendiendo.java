
package Guia07.actividad5;

public class vendiendo {
    
    //atributos
    String fruta;
    int cantidad;
    
    // metodo constrcutor
    public vendiendo(String _fruta, int _cantidad){
        fruta = _fruta;
        cantidad = _cantidad;
    }
    
    public void mostrarDatos(){
        System.out.println("La fruta que le gusta es: "+ fruta);
        System.out.println("La catidad que quiere es: "+ cantidad);
    }
}
