package Objetos;
import POO.Docente;
public class referenciasObjetos {
    public static void main(String[] args) {
        Docente objDocente1 = new Docente();
        objDocente1.setNombre("Luis");
        objDocente1.setApellido("Perez");
        objDocente1.setDni("12345678");
        objDocente1.setSueldo(1000);
        
        String nombreDocente = objDocente1.getNombre();
    }
 
}
