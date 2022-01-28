/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaintermediario;

/**
 *
 * @author laert
 */
public class TesteRunnable {
    
    public static void main(String [] args) throws InterruptedException{
        
        MinhaRunnable thread = new MinhaRunnable("Numero 1", 1000);
        MinhaRunnable thread2 = new MinhaRunnable("Numero 2",900);
        MinhaRunnable thread3 = new MinhaRunnable("Numero 3",600);
        
        
        
        Thread t1 = new Thread(thread);
        t1.start();
        
        Thread t2 = new Thread(thread2);
        t2.start();
        
        Thread t3 = new Thread(thread3);
        t3.start();
        
//        while(t1.isAlive()){
//            
//           Thread.sleep(1000);
//        };
        
          t1.join();
          t2.join();
          t3.join();
          
        
    }
    
}
