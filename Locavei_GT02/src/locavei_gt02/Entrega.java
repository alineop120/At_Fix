/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locavei_gt02;

    import java.util.Scanner;

public class Entrega {
    // Atributos
    private int codEntrega; // Código da entrega
    private int kmFim; // Quilometragem final do veículo
    private String data; // Data de entrega
    
    Scanner entrada = new Scanner(System.in); // Objeto Scanner para entrada do usuário

    // Construtor
    public Entrega(int codEntrega, int kmFim, String data){
        this.codEntrega= codEntrega;
        this.kmFim = kmFim;
        this.data = data;
    }
    
    // Métodos
    public void cadastro(){
        // Cadastrar os detalhes da entrega
        // Solicita e lê o código do veículo
        System.out.println("----- INFORMAÇÕES SOBRE O CADASTRO -----");
        System.out.println("Informe código do veiculo: ");
        codEntrega = entrada.nextInt(); 
        
        // Solicita e lê a quilometragem final do veículo
        System.out.println("Informe a quilometragem final do veiculo: ");
        kmFim = entrada.nextInt(); 
        
        // Solicita e lê a data de entrega como string
        System.out.println("Informe a data de entrega (dd/MM/yyyy): ");
        data = entrada.nextLine(); 
    }
    
    public void mostra(){
        // Método para mostrar os detalhes da entrega
        System.out.println("----- INFORMAÇÕES SOBRE O VEICULO DE ENTREGA -----");
        // Exibe o código do veículo
        System.out.println("Código do Veiculo: "+codEntrega);
        // Exibe a quilometragem final do veículo
        System.out.println("Quilometragem final do veiculo: "+kmFim+"km"); 
        // Exibe a data de entrega formatada
        System.out.println("Data de entrega: " +data); 
    }
    
    public int getCodEntraga(){
        return this.codEntrega;
    }
    
    public int getKmFim(){
        return this.kmFim;
    }
    
    public String getData(){
        return this.data;
    }
    
    public void setCodEntraga(int codEntraga){
        this.codEntrega = codEntrega;
    }
    
    public void setKmFim(int kmFim){
        this.kmFim = kmFim;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
}
