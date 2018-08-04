
package clase01;

public class Metodos {
    public static void main(String[] args) {
        saludaAlumno("Luis");
        CalcularPromedio(12, 20, 20);
    }
    static void saludaAlumno (String nombre){
        System.out.println("Hola "+nombre);
    }
    static void CalcularPromedio (double n1, double n2, double n3){
        double promedio = (n1+n2+n3)/3;
        if (promedio>15) {
            System.out.println("Felicitaciones");
        }else{
            System.out.println("Debe mejorar");
        }
    }
}
