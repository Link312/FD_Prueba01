
package Programa;

public class Bidimensional {
    public static void main(String[] args) {
        int[][] bidimensional = new int [3][3];
        bidimensional[0][0]= 20;
        bidimensional[0][1]= 11;
        bidimensional[0][2]= 13;
        
        bidimensional[1][0]= 5;
        bidimensional[1][1]= 15;
        bidimensional[1][2]= 25;
        
        bidimensional[2][0]= 10;
        bidimensional[2][1]= 16;
        bidimensional[2][2]= 13;
        
        System.out.println("Longitud de bidimensional: "+bidimensional.length);
        
        for (int i = 0; i < bidimensional.length; i++) {
            //System.out.println("Valores: "+bidimensional[i]);
            for (int j = 0; j < bidimensional[i].length; j++) {
                System.out.println("Valores:"+i+","+j+" "+bidimensional[i][j]);
            }
        }
        
        
    }
    
 
}
