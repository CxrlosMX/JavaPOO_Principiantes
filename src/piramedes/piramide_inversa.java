/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramedes;

/**
 *
 * @author El Camaleon
 */
public class piramide_inversa {
    public static void main (String args[]){
        int n=10;
      
         for (int i = 0; i < n; i++) {

         for (int j = 0; j <= i; j++) {
         System.out.print("*");

         }
         System.out.println("");
         }

         for (int i = n - 1; i != 0; i--) {

         for (int j = i; j != 0; j--) {
         System.out.print("*");
         }
         System.out.println("");
         }
         
        
    
    }
    
}
