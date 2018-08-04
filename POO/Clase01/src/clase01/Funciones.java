
package clase01;

public class Funciones {
    public static void main(String[] args) {
        ProcesarOperaciones("Luis", 12, 10, 11);
        ProcesarOperaciones("Maria", 20, 19, 18);
     
    }
    static String SaludoAlumno(String nombreAlumno){
        String mensaje = "Hola "+nombreAlumno;
        return mensaje;
    }
    
    static double CalculaPromedio(double n1, double n2, double n3){
        double promedio = (n1+n2+n3)/3;
        return promedio;
    }
    static String MensajeFinal(Double promedio){
        String mensaje;
        if (promedio>15) {
            mensaje="Felicitaciones";
        }else{
            mensaje="debe mejorar";
        }
        return mensaje;
    }
    static void ProcesarOperaciones(String nombre, double n1, double n2, double n3){
     String saludo=" ";
     double promedio= 0;
     String mensaje = " ";
     saludo= SaludoAlumno(nombre);
     promedio= CalculaPromedio(n1, n2, n3);
     mensaje = MensajeFinal(promedio);
        System.out.println(saludo+" "+mensaje);
    }
}

