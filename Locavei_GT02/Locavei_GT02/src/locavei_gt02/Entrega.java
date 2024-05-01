package locavei_gt02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Entrega {
    // Atributos
    int codEntrega;
    int kmFim;
    char data;
    
    Scanner entrada = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();    
    /*
    + codEntrega : int
    + kmFim : int
    + data : String
    + cadastra() : void
    + mostra[] : void
    */
    
    // Metodos
    public void cadastro(){
        
        System.out.println("Informe código do veiculo: ");
        codEntrega = entrada.nextInt();
        System.out.println("Informe a quilometragem final do veiculo: ");
        kmFim = entrada.nextInt();
        System.out.println("Informe a data de entrega: ");
        data = entrada.next().charAt(0);
        
    }
    
    public void mostra(){
        System.out.println("----- INFORMAÇÕES SOBRE O VEICULO DE ENTREGA -----");
        System.out.println("Códido do Veiculo: "+codEntrega);
        System.out.println("Quilometragem final do veiculo: "+kmFim+"km");
        System.out.println("Data de entrega: "+df.format(data));
    }
    
}
