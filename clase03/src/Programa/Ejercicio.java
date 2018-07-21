
package Programa;

public class Ejercicio {
    public static void main(String[] args) {
        String[] nombre= new String [6];
        double[] nota= new double [6];
        
        nombre[0]= "luis";
        nombre[1]= "Angello";
        nombre[2]= "Martin";
        nombre[3]= "Makako";
        nombre[4]= "Choy";
        nombre[5]= "Eliel";
        
        nota[0]=10;
        nota[1]=20;
        nota[2]=12;
        nota[3]=13;
        nota[4]=17;
        nota[5]=20;
        
        for (int i = 0; i < nombre.length; i++) {
            for (int j = 0; j < nota.length; j++) {
                if(i==j){
                    if(nota[j]<10) {
                        System.out.println("El alumno "+nombre[i]+" tiene "+nota[j]+" debe mejorar");
                    }else if(nota[j]>16){
                        System.out.println("El alumno "+nombre[i]+" tiene "+nota[j]+" muy bien");
                    }else{
                        System.out.println("El alumno "+nombre[i]+" tiene "+nota[j]+" mejorando");
                    }
                }
                
            }
            
        }
        
        
    }
}
