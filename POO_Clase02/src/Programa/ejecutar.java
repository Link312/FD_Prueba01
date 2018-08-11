
package Programa;
import Clases.*;
public class ejecutar {

    public static void main(String[] args) {
        // TODO code application logic here
        Director director1 = new Director("Martin","Contreras");
        //director1.setNombre("Martin");
        //director1.setApellido("Contreras");
        director1.setTipoDocumento("DNI");
        director1.setNroDocumento("12345678");
        director1.setProfesion("Director TI");
        director1.getSalario();   
        
        director1.presentarse();
        
        Obrero obreroConstruccion = new Obrero();
        obreroConstruccion.setNombre("Anthony");
        obreroConstruccion.setApellido("Choy");
        obreroConstruccion.setTipoDocumento("DNI");
        obreroConstruccion.setNroDocumento("12345678");
        obreroConstruccion.setProfesion("Albañil");
        obreroConstruccion.getSalario(); 
        obreroConstruccion.trabajar("Limpiar");
        
        obreroConstruccion.presentarse();
    }
    
    
}

