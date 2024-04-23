
package br.edu.java.etb.atfix4;

public class Exemplo03 {
    /*Declaração e Inicialização das variáveis*/
    final int X = 5; // A palavra "final" indica que x é uma constante inteira
    float y = 6.32F; // "F" ao final do número para indicar uma conversão para float
    double z =5.43; //O ponto faz a função da vírgula nas casas decimais
    char k = 'A'; // Sempre entre aspas simples
    boolean j = true;
    String nome = "etec";
        
    public void imprimeVar(){
        /* Impressão do valor das variáveis */
        System.out.println("X = " + X);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("k = " + k);
        System.out.println("j = " + j);
        System.out.println("nome = " + nome); // Uso do concatenador "+" para juntar texto e variável
    }
    
}
