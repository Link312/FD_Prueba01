
package Clases;

public class Director extends Empleado{
    //Director director1 = new Director;
    public Director(){}
    
    public Director(String nombre, String apellido){
        this.setNombre(nombre);
        this.setApellido(apellido);
    }
    //override
    @Override
    public double getSalario() {
        return 20000; //To change body of generated methods, choose Tools | Templates.
    }

    public String getCodigoSOcio() {
        return codigoSOcio;
    }

    public void setCodigoSOcio(String codigoSOcio) {
        this.codigoSOcio = codigoSOcio;
    }

    public void consultarAcciones(){
        System.out.println("Accion de director, consultar acciones");
    }
    public String codigoSOcio;
}
