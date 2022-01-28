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
public class PrincipalEnum {
    
    
    enum Operacao{
        
        SOMAR("+") {
            @Override
            public double executarOperacao(double x, double y) {
                return x+y;
            }
        },SUBTRAIR("-") {
            @Override
            public double executarOperacao(double x, double y) {
                return x-y;
            }
        },MULTIPLICAR("*") {
            @Override
            public double executarOperacao(double x, double y) {
                return x*y;
            }
        },DIVIDIR("/") {
            @Override
            public double executarOperacao(double x, double y) {
                return x/y;
            }
        };
        
        private String simbolo;
        
        Operacao(String simbolo){
            this.simbolo = simbolo;
        }
        
        public String toString(){
            
            return this.simbolo;
        }
        
        public abstract double executarOperacao(double x,double y);
    }
    
    public static void main(String [] args){
        
        
        double x = 6;
        double y = 3;
        
        for(Operacao op : Operacao.values()){
            System.out.print(x + "");
            System.out.print(op.toString()+ " ");
            System.out.print(y + "");
            System.out.println(op.executarOperacao(x, y));
        }
               
     
    }
    
}
