/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author 364975
 */
public class TesteConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while(loop){
            System.out.println("MENU ->");
            System.out.println("1} Comum");
            System.out.println("2} Poupança");
            System.out.println("3} Encerrar");
            int op = sc.nextInt();
            switch (op){
                case 1: Comum cco = new Comum("", 0);
                    cco.saca(300);
                    cco.mostra();
                case 2: Poupanca cp = new Poupanca("", 0); 
                    cp.
            }
        }
    }
    
}
