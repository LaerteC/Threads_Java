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
public class MinhaRunnable implements Runnable{

    private String nome;
    private int tempo;
    
    public MinhaRunnable(String nome,int tempo){
        this.nome = nome;
        this.tempo = tempo;
   
        
    }
    
    @Override
    public void run() {
        
        for(int i=0; i<8 ; i++){
            
            System.out.println(nome + " Contador " + i);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           
        }
        
         System.out.println(nome + " Terminou a execução da THREADD !!!");
        
    }
    
    
}
