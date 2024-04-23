/*
                    ----- INFORMAÇÕES DA QUESTÃO -----
    Uma prefeitura abriu uma linha de crédito para seus funcionários. O valor 
    máximo da prestação não poderá ultrapassar 25% do salário bruto. Faça uma 
    classe executável que dados o valor do salário bruto e o valor da prestação, 
    informe se o empréstimo pode ou não ser concedido.

    FRASE: Sobre quem ou sobre o quê eu quero saber de algo.
 */
package atfixa7un3;

import java.util.Scanner;

public class Credito 
{
    // Variáveis
    float salario, salario_bruto, valor_max, prestacao;
    Scanner entrada = new Scanner(System.in);
    
    public void receberValores() 
    {
        System.out.println("Informe o seu salário: ");
        salario = entrada.nextFloat();
        
        System.out.println("Informe o valor da prestação: ");
        prestacao = entrada.nextFloat();
    }
    
    public void calcularSalario() 
    {
        salario_bruto = (float) (salario * 0.25); // 25% do salário bruto
        valor_max = salario_bruto;
    }
    
    public void verificarEmprestimo() 
    {
        if (prestacao <= valor_max) 
        {
            System.out.println("O empréstimo pode ser concedido.");
        } 
        else 
        {
            System.out.println("O empréstimo não pode ser concedido.");
        }
    }
    
    public void mostrarSalario() 
    {
        System.out.println("O salário bruto é: " + salario_bruto);
        System.out.println("O valor máximo da prestação é: " + valor_max);
    }
}

