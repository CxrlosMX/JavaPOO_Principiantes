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
public class Uso_documentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Factura factura1=new Factura();
        factura1.insertarDatos("Jorge Cruz", 120000);
        Factura factura2=new Factura();
        factura2.insertarDatos( "Félix García", 30000);
        
        Contrato contrato1=new Contrato();
        contrato1.insertarDatos("Alejandro Calderon", 12);
        Contrato contrato2=new Contrato();
        contrato2.insertarDatos("Javier Fernández", 6);
        System.out.println("--------------Datos de la Factura 1------------------");
        factura1.visualizar1();
        System.out.println("--------------Datos de la Factura 2------------------");
        factura2.visualizar1();
        System.out.println("--------------Datos del Contrato 1--------------------");
        contrato1.visualizar();
        System.out.println("--------------Datos del Contrato 2--------------------");
        contrato2.visualizar();
    }
    
}
