
package apostilapag27_ativ1;

import java.util.Scanner;

public class Exercicio01 {
    /* Declaração das variaveis de instância */
    float valorDeposito,txJuros,_valorRend,_valorFinal;
    
    /* Declaração e assinatura dos métodos de serviços da classe */
    public void recebe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        valorDeposito=sc.nextFloat();
        System.out.println("Digite taxa de juros: ");
        txJuros=sc.nextFloat();
    }
    public void calculaRendimento(){
        _valorRend = (valorDeposito * txJuros)/100;
            
    }
    public void calculaValorFinal() {
        _valorFinal = (valorDeposito + _valorRend);
        
    }
    public void mostra() {
        System.out.println("Rendimento = " +_valorRend);
        System.out.println("Montante = " +_valorFinal);
    }
    
}
