/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atfix3un4;

import java.util.Scanner;

/**
 * Escola Técnica de Brasília - ETB
 * Curso Técnico de Informática
 * LTP1-Java
 * 07.05.2024
 * Aline Oliveira de Pinho
 * 2H
 * Objetivo             
 */
public class TesteEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop){
            // Menu
            System.out.println("MENU -->");
            System.out.println("1] Programador");
            System.out.println("2] Executivo");
            System.out.println("3] Encerrar");
            int op = sc.nextInt();
            switch (op){
                case 1: 
                    Programador pr = new Programador("", 0, 0);
                    pr.recebe();
                    pr.calcIR();
                    pr.calcAdicional();
                    pr.mostra();
                    pr.bonusSalario();
                    pr.calcIR();
                    pr.mostra();
                
                case 2: 
                    Executivo ex = new Executivo("", 0);
                    ex.calcIR();
                    ex.calcProducao(.2f);
                    ex.mostra();
                    ex.bonusSalario();
                    ex.calcIR();
                    ex.mostra();
                    
                case 3: 
                    System.out.println("Programa encerado!");
                    System.exit(0);
                default: 
                    System.out.println("Opção errada, voltando para o menu!");
            }
        }
    }
}
