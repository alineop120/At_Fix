/**
 * NFORMAÇÃO DA QUESTÃO 01 DA ATIVIDADE 1 – Controle de fluxo
 * Faça uma classe executável que calcule e imprima o somatório de todos os 
 * números inteiros existentes entre 200 e 400.
 */
package atfix8un3;

public class Exercicio1 {
    // Variavéis
    int i, soma;
    
    public void somatorioInteiro(){
      // 1ª maneira:
        for (i = 200; i <= 400; i++){
            soma = i + soma;
          //soma += i;
          
        }
      // 2ª maneira:
        while (i <= 400){
            soma = i + soma;
            i++;
        }
    }
    
    public void mostraSomatorioInteiros(){
        System.out.println("Somatorio: "+soma);
    }
    
}
