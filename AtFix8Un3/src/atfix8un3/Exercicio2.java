/**
 * INFORMAÇÃO DA QUESTÃO 02 DA ATIVIDADE 1 – Controle de fluxo
 * Faça uma classe executável que calcule e imprima a média do somatório dos 
 * números inteiros existentes entre 500 e 700.
 */
package atfix8un3;

public class Exercicio2 {
    // Variavéis
    int i, soma = 0, contador = 0, media;
    
    public void somarNumInteiros() {
        // Loop para somar os números inteiros entre 500 e 700
        for (i = 500; i <= 700; i++) 
        {
            soma += i; // Somando cada número
            contador++; // Incrementando o contador de números
        }
    }
    
    public void calcularMedia(){
        // Calculando a média
        media = (int) soma / contador;
    }
    
    public void mostrarMedia(){
        // Imprime a média
        System.out.println("A média do somatório dos números inteiros entre 500 e 700 é: " + media);
        
    }
    
}
