
package banco;

import java.util.Scanner;


public class TesteConta {
    
    public static void main(String[] args) 
    {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while(loop)
        {
            System.out.println("\nMENU -->");
            System.out.println("1]Conta Comum");
            System.out.println("2]Conta Poupança");
            System.out.println("3]Encerrar");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            switch(op)
            {
                 case 1:Comum cco = new Comum("",0f);
                 cco.recebe();
                 cco.saca(200);
                 cco.mostra();
                 break;
                 case 2:Poupanca pop = new Poupanca("",0f,0);//instanciação da classe Empregado
                 pop.recebe();
                 pop.saca(300);
                 pop.mostra();
                 break;
                 case 3:System.out.println("\nEncerrando!");
                 System.exit(0);
                 break;
                 default:System.out.println("\nOpção errada!");

            } 
        } 
    }
}
    

