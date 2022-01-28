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
public class TesteSincroniza {
    
    public static void main(String [] args){
        int [] vetor = {1,2,4,5};
        MinhaThreadSoma t1 = new MinhaThreadSoma("# 1", vetor);
        MinhaThreadSoma t2 = new MinhaThreadSoma("# 2", vetor);
    }
    
}
