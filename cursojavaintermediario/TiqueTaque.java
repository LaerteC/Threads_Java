/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaintermediario;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laert
 */
public class TiqueTaque {
    
      boolean tique;
      
     synchronized void tique(boolean estaExecutando){
          
         if(!estaExecutando){
             
             tique = true;
             notify();
             return;
         }
         
         System.out.print("Tique");
         
         tique = true;
         
         notify();
         
         while(tique){
          
             try {
                 wait();
             } catch (InterruptedException ex) {
                 Logger.getLogger(TiqueTaque.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
      }
     
       synchronized void taque(boolean estaExecutando){
           
           if(!estaExecutando){
               
               tique = false;
               notify();
               return;
           }
           
           System.out.println(" Taque ");
           
           tique = false;
           
           notify();
           
            while(!tique){
          
             try {
                 wait();
             } catch (InterruptedException ex) {
                 Logger.getLogger(TiqueTaque.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
           
           
       }
}
