
package clase01;

public class Clase01 {

    public static void main(String[] args) {
        saludoVersionMetodo();
      
        String cadena = saludo("Luis");
        System.out.println(cadena);
        
        String[] nombres ={"Luis","Maria","Jose","Martin"};
        
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            System.out.println(saludo(nombres[i]));
        }
        
    }
    
    static String saludo(String nombre){
        String saludo = "Hola "+nombre+" como estas";
        return saludo;
    }
    static void saludoVersionMetodo(){
        System.out.println("Hola Como estas");
    }
}
