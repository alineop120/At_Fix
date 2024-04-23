
package atfix6un3;

import java.util.Scanner;

public class Resolvido3 {
    int i, num, qtde;
    
    Scanner entrada = new Scanner(System.in); 

    public void contaPares(){
        qtde = 0; //qtde armazenará a quantidade de números pares 
        for (i=1; i<=10; i++) {
            System.out.print("Digite um número: "); 
            num = entrada.nextInt(); 
            if (num%2 == 0) //se o resto da divisão entre o numero e 2 for zero 
            qtde = qtde + 1; //se o número for par soma mais um else 
            System.out.println("Número impar");
        } 
    }
    
    public void mostraNum(){
        System.out.println("Quantidade de números pares :" + qtde); 
        System.out.println("Obrigado por usar o programa!"); 
    }
}
