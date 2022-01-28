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
public class MinhaThreadSoma implements Runnable{
    
    private String nome;
    private int[] numeros;
    
    private Calculadora calc  = new Calculadora();;
    public MinhaThreadSoma(String nome, int [] numeros){
        
        this.nome = nome;
        this.numeros = numeros;
       
          
        new Thread(this,nome).start();
        
    }

    @Override
    public synchronized void run() {
        
        System.out.println(this.nome + " Iniciada ");
        int soma = calc.somaArray(this.numeros);
        
        System.out.println(" O resultado da soma é :" +soma);
        
        System.out.println(this.nome + "Terminou");
    }
    
    
}
