/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aap2un4;

/**
 *
 * @author 364975
 */
public abstract class Empregado {
    private String nome;
    private double salario;

    // Construtor padrão
    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos seletores e modificadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método abstrato para aumentar salário
    public abstract double aumentarSalario();

    // Método para aplicar bônus
    public double aplicarBonus() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: " + salario;
    }
}
