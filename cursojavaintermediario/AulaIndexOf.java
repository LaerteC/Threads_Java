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
public class AulaIndexOf {
    
    
    public static void main(String [] args){
        
        String anana = "banana";
        String ana = "ana";
        
        System.out.println(anana.indexOf('x')+ "  Encontrou ??");
        System.out.println(anana.indexOf('b') + " Encontrou ?");
        
        System.out.println(anana.indexOf('a') + " Encontrou");
        
        System.out.println(anana.indexOf(ana)+ " Tem ana ???");
        
        System.out.println(anana.lastIndexOf(ana) + " ultima vez que a string ana aparece ");
        
        System.out.println(anana.lastIndexOf('a') + " Ultima vez que aparece !!!");
        
        System.out.println(anana.contains("xaxa") + " TEMMM ???");
        
        System.out.println(anana.contains(ana) + " Tem ana ??");
    }
}
