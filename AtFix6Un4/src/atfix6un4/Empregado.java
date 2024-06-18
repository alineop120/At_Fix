/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atfix6un4;

/**
 * Classe Empregado
 */
public class Empregado {
    private String nome;
    private double salario;

    // Construtor com parâmetros
    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para aumentar o salário em 5%
    public void aumentarSalario() {
        setSalario(getSalario() * 1.05); // Aumento de 5%
    }

    // Método toString para exibir os dados do empregado
    @Override
    public String toString() {
        return "Empregado [nome=" + getNome() + ", salario=" + getSalario() + "]";
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

