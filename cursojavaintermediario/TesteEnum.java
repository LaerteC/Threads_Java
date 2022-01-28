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
public class TesteEnum {
    
    public static void main(String [] args){
        
        DiaSemana dia = DiaSemana.DOMINGO;
        
        System.out.println(dia.toString() + " ---- "+ dia.getValor());
         
        Data data = new Data(19,01,2022,DiaSemana.QUARTA);
        
    }
    
}
