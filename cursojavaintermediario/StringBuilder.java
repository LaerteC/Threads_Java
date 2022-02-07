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
public class StringBuilder {
    
    
    public static void main(String [] args){
        
        String [] letras = {"B","C","D","E","F","G","H","J"};
        String alfabeto = "";
        
        for(String letra : letras){
            alfabeto += letra;
        }
        
        System.out.println(alfabeto);
        
        StringBuffer sb = new StringBuffer();
        
        for(String letra: letras){
            
            sb.append(letra);
        }
        
        alfabeto =sb.toString();
        
        System.out.println(alfabeto);
        
        alfabeto = new String(sb);
        System.out.println(sb.reverse());
        
       
    }
}
