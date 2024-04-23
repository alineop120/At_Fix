/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apostilapag27_ativ1;

/**
 * Escola Técnica de Brasília - ETB
 * Curso Técnico de Informática
 * Linguagem Técnica de Programação I 
 * 25.03.2024
 * Aline Oliveira 
 * Turma: 2H
 * Classe executável que dados a distância percorrida (em Km) e o tempo gasto em uma
viagem (em horas) e calcule e informe a velocidade média do carro.
 */
public class TesteExercicio02 {

    public static void main(String[] args){
        
        /* criação da instância da classe */
        Exercicio02 ex = new Exercicio02();
        ex.recebeDados();
        ex.calcVelocMedia();
        ex.mostraResult();
        
    } 
}
