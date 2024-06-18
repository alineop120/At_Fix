/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atfix6un4;

/**
 * ESCOLA TÉCNICA DE BRASÍLIA - ETB
 * Linguagem Técnica de Programação 1
 * 18.06.2024
 * @author Aline Oliveira
 * 2H
 * Classe executável para testar as classes em polimorfismo
 */
public class TesteEmpregado {

    public static void main(String[] args) {
        // Criando objetos de cada classe
        Empregado empregado = new Empregado("João", 3000.0);
        Programador programador = new Programador("Maria", 4000.0);
        Gerente gerente = new Gerente("José", 5000.0);

        // Aumentando o salário de cada objeto
        empregado.aumentarSalario();
        programador.aumentarSalario();
        gerente.aumentarSalario();

        // Exibindo os dados finais usando toString()
        System.out.println("Dados finais:");
        System.out.println(empregado);
        System.out.println(programador);
        System.out.println(gerente);
    }
}


