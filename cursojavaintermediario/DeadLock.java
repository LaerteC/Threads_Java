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
public class DeadLock {
    
    
    public static void main(String [] args){
        
      final String RECURSO1 = "Recurso #1";
      final String RECURSO2 = "Recurso #2";
      
      Thread t1 = new Thread(){
        public void run(){
            synchronized(RECURSO1){
                System.out.println("Thread #1 : Bloqueou recurso 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DeadLock.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.println("Thread #1 : Tentando o acesso ao recurso 2");
                
                synchronized(RECURSO2){
                    System.out.println("Thread #1: Bloqueou recurso 2");
                }
            }
        }   
      };
      
      Thread t2 = new Thread(){
          public void run(){
              synchronized (RECURSO2){
                  System.out.println("Thread #2 : Bloqueou recurso 2");
                  
                  try {
                      Thread.sleep(120);
                  } catch (InterruptedException ex) {
                                 Logger.getLogger(DeadLock.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
                  System.out.println(" Thread #2: Tentnado o acesso ao recurso 1");
                  
                  synchronized (RECURSO1){
                      System.out.println(" Thread #2: Bloqueou recurso 2");
                  }
              }
          }
      };
      
      t1.start();
      t2.start(); 
    }
}
 