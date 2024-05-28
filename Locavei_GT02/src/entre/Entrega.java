/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entre;
// Importar
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Entrega {
    // Atributos
    private int codEntrega; // Código da entrega
    private int kmFim; // Quilometragem final do veículo
    private String data; // Data de entrega como string
    
    private Scanner entrada = new Scanner(System.in); // Declarar

    // Construtor
    public Entrega(int codEntrega, int kmFim, String data) {
        this.codEntrega = codEntrega;
        this.kmFim = kmFim;
        this.data = data;
    }
    
    // Métodos
    public void cadastro(DateTimeFormatter dateFormatter) {
        // Cadastrar os detalhes da entrega
        // Solicita e lê o código do veículo
        System.out.println("----- INFORMAÇÕES SOBRE O CADASTRO -----");
        System.out.println("Informe código do veiculo: ");
        setCodEntrega(getEntrada().nextInt()); 
        
        // Solicita e lê a quilometragem final do veículo
        System.out.println("Informe a quilometragem final do veiculo: ");
        setKmFim(getEntrada().nextInt()); 
        
        // Solicita e lê a data de entrega como string
        System.out.println("Informe a data de entrega (dd/MM/yyyy): ");
        setData(getEntrada().next()); 
    }
    
    public void mostra() {
        // Método para mostrar os detalhes da entrega
        System.out.println("----- INFORMAÇÕES SOBRE O VEICULO DE ENTREGA -----");
        // Exibe o código do veículo
        System.out.println("Código do Veiculo: " + getCodEntrega());
        // Exibe a quilometragem final do veículo
        System.out.println("Quilometragem final do veiculo: " + getKmFim() + "km"); 
        // Exibe a data de entrega
        System.out.println("Data de entrega: " + getData()); 
    }
    
    // Getters and Setters

    /**
     * @return the codEntrega
     */
    public int getCodEntrega() {
        return codEntrega;
    }

    /**
     * @param codEntrega the codEntrega to set
     */
    public void setCodEntrega(int codEntrega) {
        this.codEntrega = codEntrega;
    }

    /**
     * @return the kmFim
     */
    public int getKmFim() {
        return kmFim;
    }

    /**
     * @param kmFim the kmFim to set
     */
    public void setKmFim(int kmFim) {
        this.kmFim = kmFim;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the entrada
     */
    public Scanner getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }
    
}

