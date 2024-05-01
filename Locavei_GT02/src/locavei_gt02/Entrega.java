/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locavei_gt02;

    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import java.util.Scanner;

public class Entrega {
    // Atributos
    int codEntrega; // Código da entrega
    int kmFim; // Quilometragem final do veículo
    LocalDate data; // Data de entrega
    
    Scanner entrada = new Scanner(System.in); // Objeto Scanner para entrada do usuário
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de data

    // Métodos
    public void cadastro(){
        // Método para cadastrar os detalhes da entrega
        
        // Solicita e lê o código do veículo
        System.out.println("----- INFORMAÇÕES SOBRE O CADASTRO -----");
        System.out.println("Informe código do veiculo: ");
        codEntrega = entrada.nextInt(); 
        
        // Solicita e lê a quilometragem final do veículo
        System.out.println("Informe a quilometragem final do veiculo: ");
        kmFim = entrada.nextInt(); 
        
        // Solicita e lê a data de entrega como string
        System.out.println("Informe a data de entrega (dd/MM/yyyy): ");
        String dataString = entrada.next(); 
        // Converte a string para LocalDate
        try 
        {
            data = LocalDate.parse(dataString, dateFormatter); 
        } 
        catch (Exception e) 
        {
            System.out.println("Formato de data inválido."); // Exibe mensagem de erro se o formato for inválido
        }
    }
    
    public void mostra(){
        // Método para mostrar os detalhes da entrega
        System.out.println("----- INFORMAÇÕES SOBRE O VEICULO DE ENTREGA -----");
        // Exibe o código do veículo
        System.out.println("Código do Veiculo: "+codEntrega);
        // Exibe a quilometragem final do veículo
        System.out.println("Quilometragem final do veiculo: "+kmFim+"km"); 
        // Exibe a data de entrega formatada
        System.out.println("Data de entrega: " + dateFormatter.format(data)); 
    }
    
}
