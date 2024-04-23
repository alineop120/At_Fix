
package atfix6un3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Resolvido2 {

    double num1, num2, soma, multiplica,raiz, produto;
    int op;
    Scanner entrada = new Scanner(System.in); //Instancia o objeto da classe Scanner
    DecimalFormat df = new DecimalFormat("#,##0.00");
    

    public void menuEscolha() {

        /*Mostra um menu de opções*/
        System.out.println("\n*** Sistema de Cálculos - SisC ***\n***"
                + " Modulo:Menu       ANO:2024 ***\n");
        System.out.println("1- Somar dois números");
        System.out.println("2- Raiz quadrada de um número");
        System.out.println("3- Produto entre dois numeros");
        System.out.print("Digite sua opção: "); //Mostra mensagem solicitando a opção do usuário
        op = entrada.nextInt();//Recebe a opção do usuário
    }

    public void validaOp() {

       
        /* entrada no switch..case */
        switch (op) {

            /*Se a opção igual a 1, soma dois números*/
            case 1:
                 System.out.println("\n*** Sistema de Cálculos - SisC ***\n***"
                + " Modulo:ED         ANO:2024 ***");
                System.out.println("\n<< Somar dois números >> ");
                System.out.print("Digite um valor para o primeiro número: ");
                num1 = entrada.nextDouble();
                System.out.print("Digite um valor para o segundo número: ");
                num2 = entrada.nextDouble();
                calcSoma();
                mostraSoma();
                break;
            /* Se a opção igual a 2, extrai a raiz quadrada*/
            case 2:
                 System.out.println("\n*** Sistema de Cálculos - SisC ***\n***"
                + " Modulo:ED         ANO:2024 ***");
                System.out.println("\n<< Raiz quadrada de um número >>");
                System.out.print("Digite um número: ");
                num1 = entrada.nextDouble();
                calcRaiz();
                mostraRaiz();
                break;
            case 3:
                System.out.println("\n*** Sistema de Cálculos - SisC ***\n***"
                + " Modulo:ED         ANO:2024 ***");
                System.out.println("\n<< Produto dois números >> ");
                System.out.print("Digite um valor para o primeiro número: ");
                num1 = entrada.nextDouble();
                System.out.print("Digite um valor para o segundo número: ");
                num2 = entrada.nextDouble();
                calcProduto();
                mostraProduto();
                break;
            default:
                System.out.println("\nOpção inválida !");
                System.exit(0);
        }
    }
    
    public void calcSoma(){
        soma = num1 + num2;
        
    }
     public void calcProduto(){
        produto = num1 * num2;
        
    }
    
    
    public void calcRaiz(){
       raiz = Math.sqrt(num1);
        
    }
    
    
    public void mostraSoma(){
        System.out.println("\n*** Sistema de Cálculos - SisC ***\n***"
                + " Modulo:SD         ANO:2024 ***");
        
        System.out.println("A soma de " + df.format(num1) + " e " + df.format(num2) + " é " + df.format(soma));
    }
    
    public void mostraRaiz(){
        System.out.println("\n*** Sistema de Cálculos - SisC ***\n***"
                + " Modulo:SD         ANO:2024 ***");
        System.out.println("A raiz quadrada de " + df.format(num1) + " é " + df.format(raiz));
    }
    
     public void mostraProduto(){
         System.out.println("\n*** Sistema de Cálculos - SisC ***\n***"
                + " Modulo:SD         ANO:2024 ***");
        System.out.println("O produto de " + df.format(num1) + " e " + df.format(num2) + " é " + df.format(produto));
    }

}
