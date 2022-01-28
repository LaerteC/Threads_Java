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
public class TesteThread {
    
    public static void main(String [] args){
        
        
        MinhaThread thread1 = new MinhaThread("Thread # 1", 1000);
        
        MinhaThread thread2 = new MinhaThread("Thread # 2", 2000);
        
        
    }
}
