/**
 * Erro: O programa ele não encerar no número 0 (zero);
 */
package atfix6un3;

import java.util.Scanner;
    
public class Resolvido5 
{
    //Variavéis
    double soma, soma_par, media, media_par, perc;
    int num, cont, cont_par, cont_impar;

    Scanner entrada = new Scanner(System.in);
        
    public void varContagem()
    {
        // Inicializar as variáveis de contagem
        cont = 0;
        cont_par = 0;
        cont_impar = 0;
        soma_par = 0;
        soma = 0;  
    }
    
    public void entradaDados()
    {
        System.out.println("Digite um valor ou zero para encerrar o programa ");
        num = entrada.nextInt(); //entrada de dados antes da repetição
        
        while (num!=0) // Símbolo != é chamado de diferente
        {
            soma = soma + num; //soma os números
            cont = cont + 1; //conta a quantidade de números
            if (num%2 == 0) //verifica se é par
            {
                soma_par = soma_par + num; //soma os pares
                cont_par = cont_par + 1; //conta os pares
            } 
            else 
            {
                cont_impar = cont_impar + 1; //conta os ímpares
            } 
            System.out.println("Digite um valor ou zero para encerrar o programa ");
            num = entrada.nextInt(); //entrada de dados dentro da repetição
        }
    }
    
    public void saidaDados()
    {
        System.out.println("Soma dos valores = "+ soma);
        System.out.println("Quantidade de valores digitados = " +cont);
        media = soma / cont;
        System.out.println("Média dos valores digitados = " +media);
        media_par = soma_par / cont_par;
        System.out.println("Média dos números pares = "+media_par);
        perc = cont_impar * 100 / cont;
        System.out.println("Percentual de números ímpares digitados = "+perc + "%");
    }   
}
