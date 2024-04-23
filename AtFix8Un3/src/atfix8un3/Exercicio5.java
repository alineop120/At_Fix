/*
 * INFORMAÇÃO DA QUESTÃO 02 DA ATIVIDADE 2 – Controle de fluxo (complementar)
 * Faça uma classe executável que calcule e imprima o somatório dos números 
 * impares existentes em 300 e 700.
 */
package atfix8un3;

public class Exercicio5 {
    // Variável para armazenar o somatório dos números ímpares
    int i, soma,_numImpares;
    
    public void somatorioImpares(){
        // Loop para somar os números ímpares entre 300 e 700
        for (i = 100; i <= 500; i++)
        {    
            if (i % 2 != 0) // Verifica se o número não é par (ou seja, é ímpar)
            {
                soma += 1; // Adiciona o número ímpar à soma
                
            } 
        }   
    }
    
    public void mostraSomatorioImpares(){
        // Imprime o somatório dos números ímpares
        System.out.println("SomatorioNumeros pares: "+soma);
        
    }
}
