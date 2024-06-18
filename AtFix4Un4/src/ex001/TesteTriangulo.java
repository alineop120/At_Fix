/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex001;

import java.util.Scanner;

/**
 * ESCOLA TÉCNICA DE BRASÍLIA - ETB
 * Linguagem Técnica de Programação 1
 * 18.06.2024
 * @author Aline Oliveira
 * 2H
 * Classe que leia os 3 lados do triângulo e diga se ele é equilátero, 
 * isósceles ou escaleno
 */
public class TesteTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Leitura dos lados do triângulo
            System.out.println("Digite o lado 1 do triângulo:");
            int lado1 = scanner.nextInt();
            
            System.out.println("Digite o lado 2 do triângulo:");
            int lado2 = scanner.nextInt();
            
            System.out.println("Digite o lado 3 do triângulo:");
            int lado3 = scanner.nextInt();
            
            // Criando o objeto Triangulo
            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
            
            // Exibindo informações sobre o triângulo usando toString()
            System.out.println("Informações do triângulo:");
            System.out.println(triangulo);
            
            // Verificando e exibindo o tipo de triângulo
            if (triangulo.ehEquilatero()) {
                System.out.println("O triângulo é Equilátero.");
            } else if (triangulo.ehIsosceles()) {
                System.out.println("O triângulo é Isósceles.");
            } else if (triangulo.ehEscaleno()) {
                System.out.println("O triângulo é Escaleno.");
            } else {
                System.out.println("Os lados fornecidos não formam um triângulo válido.");
            }
        }
    }   
}
