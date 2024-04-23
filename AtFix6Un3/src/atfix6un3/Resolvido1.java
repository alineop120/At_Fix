
package atfix6un3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Resolvido1 {

    double nota_trab, prova_escr, prova_final, media;

    public void recebe() {
        System.out.println("*** Sistema Gerador de Médias - SGM ***\n***"
                + " Modulo:ED              ANO:2024 ***");
        Scanner entrada = new Scanner(System.in); //Instancia o objeto da classe Scanner
        System.out.print("\nDigite a nota do trabalho: "); //Mostra mensagem solicitando nota do trabalho
        nota_trab = entrada.nextDouble();//Recebe o valor da nota do trabalho
        System.out.print("Digite a nota da prova escrita: "); //Mostra mensagem solicitando nota da avaliação
        prova_escr = entrada.nextDouble();//Recebe e Lê o valor da prova escrita
        System.out.print("Digite a nota do exame final: "); //Mostra mensagem solicitando nota do exame final
        prova_final = entrada.nextDouble();//Recebe e Lê o valor da nota do exame fina
    }

    public void calcMedia() {
        media = (nota_trab * 2 + prova_escr * 3 + prova_final * 5) / 10; //Calcula a média ponderada
    }

    public void mostraConceito() {
        /*Mostra o conceito obtido com a média alcançada*/
        if (media >= 8 && media <= 10) {
            System.out.println("Obteve conceito A");
        } else if (media >= 7) {
            System.out.println("Obteve conceito B");
        } else if (media >= 6) {
            System.out.println("Obteve conceito C");
        } else if (media >= 5) {
            System.out.println("Obteve conceito D");
        } else {
            System.out.println("Obteve conceito E");
        }
    }

    public void mostraMedia() {
        System.out.println("\n*** Sistema Gerador de Médias - SGM ***\n***"
                + " Modulo:SD              ANO:2024 ***");
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("\nMédia ponderada: " + df.format(media)); //Mostra resultado da média
    }

}
