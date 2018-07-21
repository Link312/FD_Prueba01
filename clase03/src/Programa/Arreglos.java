/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;
public class Arreglos {
    public static void main(String[] args) {
        String apellido [] = new String [5];
        /*
        String apellido [];
        apellido = new String [n];
        */
        String nombre [];
        nombre = new String [5];
        
        //asignar valores
        apellido [0]="perez";
        apellido [1]="ramirez";
        apellido [2]="cordova";
        apellido [3]="Leon";
        apellido [4]="Lopez";
        
        String[] departamentos = {"lima","departamentos","puno","cuzco","ayacucho"};
        
        System.out.println("Eltamaño del arreglo departamentos es: "+departamentos.length);
        System.out.println("El tamaño del arreglo nombres es: "+nombre.length);
        System.out.println("El tamaño del arreglo apellidos es:"+apellido.length);
        
        //recirrer arreglo valor por valor:
        
        for(int i=0 ; i<departamentos.length;i++){
            System.out.println("El valor del en la posicion"+i+"="+departamentos[i]);
        }   
            
         // cual es la nota mayor
         
         double [] nota= new double [5];
         nota[0]=01;
         nota[1]=02;
         nota[2]=11;
         nota[3]=12.5;
         nota[4]=14;
         double mayor=0;
         
         for (int j=0;j<nota.length;j++){
             if(nota[j]>mayor){
                 mayor=nota[j];    
             }       
         }     
    System.out.println("El mayor es:"+mayor);
    }
}


