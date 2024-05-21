package atfix3un4;

import java.util.Scanner;

public class Empregado {
    // Atributos
    private String nome;
    private double salario, ir;
    private final float TXIR = 0.05f;
    
    // Declarar
    Scanner sc = new Scanner(System.in);
    
    // Metodos
    public Empregado (String nome) {
        this.nome = nome;
    }
    
    public void recebe(){
	System.out.println("Digite o nome do empregado: ");
	nome = sc.nextLine();
	System.out.println("Digite o salario do empregado: ");
	salario = sc.nextDouble();
    }
    
    public double calcIR(){
        return ir = (float) (this.salario * TXIR);
    }
    
    public void mostra(){
	System.out.println("NOME: "+nome+"\nSALARIO: "+salario
	+"\nIMPOSTO DE RENDA: "+calcIR());	
    }

    // Get's
    public String getNome(){
	return this.nome;
    }
    
    public double getSalario(){
	return this.salario;
    }

    public double getIR(){
	return this.ir;
    }

    // SET's
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
	
    public void setIR(){
        this.ir = ir;
    }
}
