/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaintermediario;

import java.util.Arrays;

/**
 *
 * @author laert
 */
public class ClassesStrings {
    
    public static void main(String [] args){
        
        String java = "Java é o que vai me dar Dinheiro";
        
        for(int i= 0; i<java.length();i++){
            
            System.out.println(java.charAt(i));
        }
        
        char[] arrayChar = new char[3];
        
        java.getChars(0,3,arrayChar,0);
        
        System.err.println(arrayChar);
         
        for(int i =0,j=0;i<3;i++,j++){
            
            arrayChar[j]= java.charAt(i);
        }
        
        System.out.println(arrayChar);
        
        byte[] arrayBytes = new byte[3];
        
        java.getBytes(0,3,arrayBytes,0);
        
        System.out.println(Arrays.toString(arrayBytes));
    }
}
