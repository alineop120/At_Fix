/*
 * INFORMAÇÃO DA QUESTÃO 03 DA ATIVIDADE 1 – Controle de fluxo
 * Faça uma classe executável que dado um número inteiro, calcule e imprima o 
 * seu fatorial. O fatorial de um número n é n * n-1 * n-2 ... até n = 1. Por 
 * exemplo, o fatorial de 4 é 24 ( 4 * 3 * 2 * 1).
 */
package atfix8un3;

import java.util.Scanner;

public class Exercicio3 {
    int num;
    boolean div = true;
    
    Scanner entrada = new Scanner(System.in);
    
    public void verificaDivisao(){
        
        while(div){
            System.out.println("\n*** Sistema Divisibilidade - SiDiv ***\n***"
                    + " Modulo: ED  ANO:2024 ***\n");
            System.out.println("Digite um número: ");
            num = entrada.nextInt();
            if (num % 5 == 0)
            {
                System.out.println("\n----------------------------------\n"
                    + "Número é divisível por 5! \n----------------------------------\n");
            }
            else
            {
                System.out.println("\n----------------------------------\n"
                    + "Número não é divisível por 5! \n----------------------------------\n"); 
                System.out.println("\nPrograma será encerrado!");
                div=false;
                //System.exit(0);
            } 
        }
    }   
}
