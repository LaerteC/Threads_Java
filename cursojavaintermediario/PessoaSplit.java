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
public class PessoaSplit {
    
    public static void main(String [] args){
        
        String alfabeto = String.join(", ","A","B","C","D","E");
        
        String [] letras = alfabeto.split(",");
        
        for(String letra :letras){
            
            System.out.println(letra);
        }
        
        String arquivo = "1;Laerte Souza;30";
        
        String [] infos = arquivo.split(";");
        
        Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]),infos[1],Integer.parseInt(infos[2]));
        
        System.out.println(pessoa);
    }
}
