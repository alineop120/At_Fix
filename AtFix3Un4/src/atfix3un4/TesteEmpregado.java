/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atfix3un4;

/**
 * Instituição          Escola Técnica de Brasília - ETB
 * Nome do Curso        Curso Técnico de Informática
 * Disciplina           LTP1-Java
 * Date                 07.05.2024
 * Autores              Aline Oliveira de Pinho
 * Turma                2H
 * Objetivo             
 */
public class TesteEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado emp = new Empregado("");
	emp.recebe();
	emp.calcIR();
	emp.mostra();
    }
    
}
