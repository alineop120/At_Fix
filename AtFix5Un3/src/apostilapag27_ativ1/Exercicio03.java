/*
                     ----- INFORMAÇÕES DA QUESTÃO 03 -----
    Faça uma classe executável que dado o salário de um funcionário, informe o 
valor de imposto de renda a ser pago, sabendo que o imposto equivale a 5% do 
salário

 */
package apostilapag27_ativ1;

import java.util.Scanner;

public class Exercicio03 {
    //Variáveis
    float salario, imposto;
    
    Scanner sc = new Scanner(System.in); 
    
    public void receberSalario(){
        System.out.println("Informe o seu sálario: ");
        salario = sc.nextFloat();
    }
    
    public void calcImposto(){
        // Fórmula para calcular o imposto
        imposto = (float) (salario * 0.05);
        
    }
    
    public void valorAPagar(){
        //Mostrar o valor do imposto a ser pago
        System.out.println("O valor do imposto é "+imposto);
        
    }
    
}
