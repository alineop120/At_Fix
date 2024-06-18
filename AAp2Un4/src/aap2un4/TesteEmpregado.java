/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aap2un4;

import java.util.Scanner;

/**
 * Classe principal para testar as classes Empregado, Programador e Gerente.
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            
            // Loop para solicitar dados de vários empregados
            while (continuar) {
                // Solicitar dados do empregado
                Empregado emp = solicitarDadosEmpregado(scanner);
                
                // Exibir informações iniciais do empregado
                System.out.println(emp);
                
                // Aumentar salário e aplicar bônus
                emp.aumentarSalario();
                emp.aplicarBonus();
                
                // Exibir informações finais do empregado
                System.out.println("Após aumento e bônus:");
                System.out.println(emp);
                
                // Perguntar se deseja adicionar outro empregado
                System.out.print("Deseja adicionar outro empregado? (sim/não): ");
                String resposta = scanner.nextLine();
                continuar = resposta.equalsIgnoreCase("sim");
            }
        }
    }

    // Método para solicitar dados do empregado
    private static Empregado solicitarDadosEmpregado(Scanner scanner) {
        System.out.print("Digite o nome do empregado: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário do empregado: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir nova linha
        System.out.print("Digite o cargo do empregado (Programador/Gerente): ");
        String cargo = scanner.nextLine();

        Empregado emp;
        if (cargo.equalsIgnoreCase("Programador")) {
            emp = new Programador(nome, salario);
        } else if (cargo.equalsIgnoreCase("Gerente")) {
            emp = new Gerente(nome, salario);
        } else {
            throw new IllegalArgumentException("Cargo inválido! O cargo deve ser Programador ou Gerente.");
        }

        return emp;
    }
}