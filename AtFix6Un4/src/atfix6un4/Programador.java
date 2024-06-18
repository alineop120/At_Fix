/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atfix6un4;

/**
 * Classe Programador, subclasse de Empregado
 */
public class Programador extends Empregado {
    // Construtor com parâmetros
    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescreve o método aumentarSalario para aumentar 10%
    @Override
    public void aumentarSalario() {
        // Aumento de 10%
        double aumento = getSalario() * 0.10;
        super.setSalario(super.getSalario() + aumento);
    }

    // Método toString para exibir os dados do programador
    @Override
    public String toString() {
        return "Programador [nome=" + getNome() + ", salario=" + getSalario() + "]";
    }
}

