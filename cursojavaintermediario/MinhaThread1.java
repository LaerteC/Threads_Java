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
public class MinhaThread1 implements Runnable{

    
    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;
    
    
    public MinhaThread1(String nome){
        this.nome = nome;
        this.estaSuspensa = false;
        new Thread(this,nome).start();
    }
    @Override
    public void run() {

         System.out.println("Executando " +this.nome);
        
        for(int i=0;i<10;i++){
            
            System.out.println("Thread : " +nome);
            try {
                Thread.sleep(200);
                synchronized(this){
                    while(estaSuspensa){
                        wait();
                    }
                    if(this.foiTerminada){
                        break;
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println(" Thread Terminou !!!");
    }
    
    
     void suspend(){
        this.estaSuspensa = true;
    }
    
   synchronized void resume(){
        this.estaSuspensa = false;
        notify();
    }
   
   synchronized void stop(){
       this.foiTerminada = true;
       notify();
   }
}
