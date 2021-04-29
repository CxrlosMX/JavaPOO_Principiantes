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
public class piramede_1 {

    public static void main(String args[]) {
        /*
         Crea una aplicación que dibuje una pirámide de asteriscos. Nosotros le pasamos 
         la altura de la pirámide por teclado. Este es un ejemplo, si introducimos 5 de altura:
         */

        int n = 20;

        /*  Rombo medio
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
         */
        for (int i = 1; i <= n; i++) {
            //Espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            //Asteriscos
           for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
