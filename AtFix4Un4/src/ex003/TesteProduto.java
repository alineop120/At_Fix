/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex003;

import java.util.Scanner;

/**
 * ESCOLA TÉCNICA DE BRASÍLIA - ETB
 * Linguagem Técnica de Programação 1
 * 18.06.2024
 * @author Aline Oliveira
 * 2H
 * Classe que leia o código, a descrição e a quantidade mínima desejada 
 * e mostre o menu
 */
public class TesteProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Leitura dos dados iniciais do produto
            System.out.println("Informe o código do produto:");
            int codigo = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            
            System.out.println("Informe a descrição do produto:");
            String descricao = scanner.nextLine();
            
            System.out.println("Informe a quantidade mínima desejada em estoque:");
            int quantidadeMinima = scanner.nextInt();
            
            System.out.println("Informe o preço de venda do produto:");
            double precoVenda = scanner.nextDouble();
            
            // Cria um objeto Produto com os dados fornecidos
            Produto produto = new Produto(codigo, descricao, quantidadeMinima, precoVenda);
            
            int opcao;
            do {
                // Mostra o menu de opções
                System.out.println("\n===== Menu =====");
                System.out.println("1 - Registro da Compra (reporEstoque)");
                System.out.println("2 - Alterar Preço de Venda (alterarPreco)");
                System.out.println("3 - Registro da Venda (darBaixa)");
                System.out.println("4 - Verificar Reposição (precisaRepor)");
                System.out.println("5 - Fim");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                        // Registro da Compra
                        System.out.println("Informe a quantidade comprada para reposição:");
                        int quantidadeCompra = scanner.nextInt();
                        produto.reporEstoque(quantidadeCompra);
                        break;
                    case 2:
                        // Alterar Preço de Venda
                        System.out.println("Informe a taxa percentual de alteração do preço:");
                        double taxa = scanner.nextDouble();
                        produto.alterarPreco(taxa);
                        break;
                    case 3:
                        // Registro da Venda
                        System.out.println("Informe a quantidade vendida:");
                        int quantidadeVenda = scanner.nextInt();
                        produto.darBaixa(quantidadeVenda);
                        break;
                    case 4:
                        // Verificar Reposição
                        if (produto.precisaRepor()) {
                            System.out.println("É necessário repor o estoque.");
                        } else {
                            System.out.println("Não é necessário repor o estoque.");
                        }
                        break;
                    case 5:
                        // Finalizar o programa
                        System.out.println("Programa encerrado.");
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha novamente.");
                }
                
            } while (opcao != 5);
        }
    }    
}