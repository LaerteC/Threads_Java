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
public class MinhaThread1Teste {
    
    
    public static void main(String [] args){
        
        MinhaThread1 t1 = new MinhaThread1("#1");
        MinhaThread1 t2 = new MinhaThread1("#2");
        
        t1.suspend();
        
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread1Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t2.suspend();
        
        t1.resume();
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread1Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t2.resume();
        t2.stop();
    }
}
