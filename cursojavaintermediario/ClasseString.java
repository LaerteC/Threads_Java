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
public class ClasseString {
    
    public static void main(String [] args){
         
        char [] charsJava = {'J','A','V','A'};
        String java2 = new String(charsJava);
        
        System.out.println(java2);
        
        char[] abcdef = {'A','B','C','D','E','F'};
        String abc = new String(abcdef, 0,3);
        System.out.println(abc);
        
        byte[] ascii = {65,66,67,68,69,122};
        String abcde = new String(ascii);
        System.out.println(abcde);
    }
}
