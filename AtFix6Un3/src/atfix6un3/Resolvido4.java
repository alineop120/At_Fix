
package atfix6un3;

import java.util.Scanner;

public class Resolvido4 {
    // Variavéis
    int i=1, cont=0;
    double salario, soma=0, media=0;
    
    Scanner entrada = new Scanner(System.in);
    
    public void salorioMaior(){
        // Informar e calcular os salarios
        while (i<=3) {
        System.out.print("Digite o seu sálario: ");
        salario = entrada.nextDouble();
            if (salario > 1000){ //se o salário for maior do que mil
                soma=soma+salario; //soma o salário anterior com o salário atual
                cont= cont+1; //soma mais um ao contador
                media = soma/cont;
                i++;
                }else{
                    System.out.println("Você nao ganha mais do que R$1000,00");
                    i++;
                }
            }
    }
    
    public void mostrarSalarMaior(){
        // Mostrar salarios maior do que mil
        System.out.println("Soma dos salarios maiores do que mil: " + soma);
        System.out.println("Quabtidade de salario maiores do que mil: " + cont);
        System.out.println("Media dos salario maiores do que mil: " + media);
    }
}
