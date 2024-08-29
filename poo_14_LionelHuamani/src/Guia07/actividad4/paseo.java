package Guia07.actividad4;

public class paseo {

    //atributos
    String nombre;
    int edad;
    
    // Metodos con parametros
    public void caminar( String dato1, int dato2) {
        nombre = "Yo " + dato1 + " sali a Caminar";
    }
    
    public void edad (String dato1 , int dato2){
        
        edad = dato2;
    }
    
    public void mostrarDatos (){
         System.out.println("\nDatos"+"\n"+nombre+"\nSu edad : "+edad);
    
    }
}
