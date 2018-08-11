/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Administrador
 */
public class Obrero extends Empleado{
    
    public Obrero(){
        
    }
    //SOBRECARGA
    public void trabajar(String rutina1){
        System.out.println(rutina1);
    }
    public void trabajar(String rutina1,String rutina2){
        System.out.println(rutina1+" "+rutina2);
    }
    
    public void trabajar(String rutina1,String rutina2, String rutina3){
        System.out.println(rutina1+" "+rutina2+" "+rutina3);
    }

    @Override
    public void presentarse() {
         System.out.println("HOLA");
        super.presentarse();
        return;
        
    }

    
   
}
