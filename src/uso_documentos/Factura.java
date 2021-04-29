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
public class Factura {
       private String comprador;
    private double importe;
     public void insertarDatos(String comprador, int importe){
    this.comprador=comprador;
    this.importe=importe;
    }
    
    public void visualizar1(){
    
     System.out.println("Factura a nombre xde; "+this.comprador);
    System.out.println("Por un importe de; "+this.importe);
    
}
}
