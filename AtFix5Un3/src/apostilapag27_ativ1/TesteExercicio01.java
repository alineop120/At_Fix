/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apostilapag27_ativ1;

/**
 * Escola Técnica de Brasília - ETB
 * Curso Técnico de Informática
 * Linguagem Técnica de Programação I 
 * 25.03.2024
 * Aline Oliveira 
 * Turma: 2H
 *  Classe executável que dados o valor do depósito em uma poupança e a taxa de 
 * juros, informe a valor do rendimento (lucro) e o valor final (saldo resultante).
 */
public class TesteExercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Declaração */
        Exercicio01 ex1 = new Exercicio01();
        
        ex1.recebe();
        ex1.calculaRendimento();
        ex1.calculaValorFinal();
        ex1.mostra();
    }
    
}
