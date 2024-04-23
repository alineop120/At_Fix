/*
 * INFORMAÇÃO DA QUESTÃO 01 - ATIVIDADE 2 – Controle de fluxo (complementar)
 * Faça uma classe executável que calcule e imprima o somatório dos números 
 * pares existentes entre 100 e 500.
 */
package atfix8un3;

public class Exercicio4 {
    // Variavéis
    int i, soma = 0;
    
    public void somaPares()
    {
        
        for (i = 100; i <= 500; i++)
        {
            if (i % 2 == 0) // Verifica se o número é par
            { 
                soma += 1; // Adiciona o número par à soma
            } 
        }
    }
    
    public void mostraSomaPares(){
        // Imprime o somatório dos números pares
        System.out.println("Somatorio dos Numeros Pares: "+soma);
    }
    
}
