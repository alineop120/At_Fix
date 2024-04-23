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
 * Classe executável que dado o valor de um produto, informe o novo valor de 
venda sabendo-se que este sofreu um aumento de 25%.
 */
public class TesteProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto pd = new Produto();
        
        pd.receberDados();
        pd.calcularNvValor();
        pd.mostrarDados();
    }
    
}
