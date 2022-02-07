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
public class UsoTrimSubString {
    
    public static void main(String [] args){
            
        String teste = " Hoje estou aprendendo TRIM, Substring";
        
        System.out.println(teste);
        
        System.out.println(teste.substring(8));
        
        System.out.println(teste.substring(8,25));
        
        String ola = "olá";
        String mundo = " mundo";
       
        String olaMundo = ola.concat(mundo);
        
        System.out.println(olaMundo);
        
        
        String espacos = "i s p a ç o";
        String semEspaco = espacos.replace('i', 'E');
        
        System.out.println(semEspaco);
        
        semEspaco = semEspaco.replaceAll(" ","");
        
        System.out.println(semEspaco);
        
        String nome = " meu nome é ";
        
        System.out.println(nome);
        
        System.out.println(nome.trim());
        
        
    }
}
