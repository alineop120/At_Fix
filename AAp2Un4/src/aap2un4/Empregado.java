/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aap2un4;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author 364975
 */
public abstract class Empregado {
    // Atributos
    private String nome;
    private double salario;
    public Scanner sc = new Scanner(System.in);
    public DecimalFormat df = new DecimalFormat("#,##0.00");
    
    // Construtor
    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    // Métodos
    public void recebe(){
        System.out.print("\nDigite o nome do empregado: ");
        setNome(sc.nextLine());
        System.out.print("Digite o salário do empregado: ");
        setSalario(sc.nextDouble());
    }
    
    /* Calcular aumento de salario */
    public void aumentarSalario(double salario){
        double aumento = 0.05;
        this.salario = this.salario + aumento;
    }
    
    
    @Override
    public String toString() {//metodo com retono String - converte para String
        return("\nNOME: " + getNome() + "\nSALÁRIO: " + df.format(getSalario()));
    }
    
    // Getts e Setts
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
}
