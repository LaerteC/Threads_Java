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
public class MinhaThread extends Thread{
    
    
    private String nome;
    private int tempo;
    
    public MinhaThread(String nome,int tempo){
        
        this.nome = nome;
        this.tempo = tempo;
        start();
    }
    
    public void run(){
        
        try{
            for(int i =0; i<8;i++){
                System.out.println(nome + " Contador " + i);
                Thread.sleep(tempo);
            }
        }catch(InterruptedException e){
                
            e.printStackTrace();
        }
        
        System.out.println(" Terminou a Thread" + nome );
    }
}

