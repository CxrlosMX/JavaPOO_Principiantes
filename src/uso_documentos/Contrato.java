/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uso_documentos;

/**
 *
 * @author El Camaleon
 */
public class Contrato {
    private String nombre;
    private int duracionMes;
    public void insertarDatos(String nombre, int duracionMes){
    this.duracionMes=duracionMes;
    this.nombre=nombre;
    }
    
    public void visualizar(){
    
     System.out.println("El contrato esta a nombre de;"+this.nombre);
    System.out.println("Con una duracion de; "+this.duracionMes);}
    
}
