/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiadora;

/**
 *
 * @author 364975
 */
public class TesteCopiadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno alu = new Aluno("Alana",12,"Goiana");
        System.out.println("Copia: "+alu.tirarCopias(10));
        System.out.println("Dados - "+alu);
        
        Professor prf = new Professor("Mario",39,"Recife");
       System.out.println("\nCopia: "+prf.tirarCopias(10));
        System.out.println("Dados - "+prf);
    }
    
}
