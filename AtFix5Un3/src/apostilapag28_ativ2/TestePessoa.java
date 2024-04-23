/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apostilapag28_ativ2;

/**
 * Escola Técnica de Brasília - ETB
 * Curso Técnico de Informática
 * Linguagem Técnica de Programação 1 - Java  
 * 09.04.2024
 * Aline Oliveira de Pinho 
 * 2H
 * Classe executável que dados o peso atual de uma pessoa e o peso desejado 
 após processo de emagrecimento, informe o percentual do peso que deverá ser 
 eliminado.
 */
public class TestePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa ps = new Pessoa();
        
        ps.receber();
        ps.calcPeso();
        ps.calcPersen();
        ps.mostrar();
    }
    
}
