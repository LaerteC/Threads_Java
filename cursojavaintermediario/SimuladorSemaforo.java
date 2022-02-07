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
public class SimuladorSemaforo {
    
    public static void main(String [] args){
        
        Semaforo semaforo = new Semaforo();
        
        for(int i=0;i<10;i++){
            
            System.out.println(semaforo.getCor());
            
            semaforo.esperaCorMudar(); 
        }
        
        semaforo.desligarSemaforo();
    }
    
}
