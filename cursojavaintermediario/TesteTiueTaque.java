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
public class TesteTiueTaque {
    
    
    public static void main(String [] args){
        
        
    TiqueTaque tt = new TiqueTaque();
    
    ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
    
    ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);
    
        try {
    
            tique.t.join();
            taque.t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TesteTiueTaque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
