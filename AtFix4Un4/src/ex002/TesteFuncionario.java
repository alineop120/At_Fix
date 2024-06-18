/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex002;

import java.util.Scanner;

/**
 * ESCOLA TÉCNICA DE BRASÍLIA - ETB
 * Linguagem Técnica de Programação 1
 * 18.06.2024
 * @author Aline Oliveira
 * 2H
 * Classe que leia o nome, o salário-base e o nível do cargo e 
 * mostre seu contracheque
 */
public class TesteFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que insira os dados do funcionário
            System.out.println("Informe o nome do funcionário:");
            String nome = scanner.nextLine();
            
            System.out.println("Informe o salário-base do funcionário:");
            double salarioBase = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner
            
            System.out.println("Informe o nível do cargo do funcionário (I, II ou III):");
            String nivelCargo = scanner.nextLine().toUpperCase(); // Converte para maiúsculas
            
            // Cria um objeto Funcionario com os dados fornecidos
            Funcionario funcionario = new Funcionario(nome, salarioBase, nivelCargo);
            
            // Mostra o contracheque do funcionário
            System.out.println();
            funcionario.mostrarContracheque();
        }
    }    
}
