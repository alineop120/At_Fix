package atfix3un4;

import java.util.Scanner;

public abstract class Empregado {
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
	setNome(sc.nextLine());
	System.out.println("Digite o salario do empregado: ");
	setSalario(sc.nextDouble());
    }
    
    public double calcIR(){
        return ir = (float) (this.getSalario() * TXIR);
    }
    
    public abstract void bonusSalario(); //método abstrato é implemantado nas classes filhas
    
    public void  aumentaSalario(double s){
        this.salario=this.salario + s;
    }
    
    public void mostra(){
	System.out.println("NOME: "+getNome()+"\nSALARIO: "+getSalario()
	+"\nIMPOSTO DE RENDA: "+calcIR());	
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the ir
     */
    public double getIr() {
        return ir;
    }

    /**
     * @param ir the ir to set
     */
    public void setIr(double ir) {
        this.ir = ir;
    }

    
}
