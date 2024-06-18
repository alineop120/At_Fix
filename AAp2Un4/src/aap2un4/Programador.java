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
public class Programador extends Empregado {

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double aumentarSalario() {
        setSalario(getSalario() * 1.10);
        return getSalario();
    }

    @Override
    public double aplicarBonus() {
        setSalario(getSalario() + 500);
        return getSalario();
    }
}