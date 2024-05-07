
package locavei_gt02;

import java.time.format.DateTimeFormatter;

/**
 * Instituição          Escola Técnica de Brasília - ETB
 * Nome do Curso        Curso Técnico de Informática
 * Disciplina           LTP1-Java
 * Date                 30.04.2024
 * Autores              Aline, Gabriel Moreira, João Gabriel, Verônica 
 * Turma                2H
 * Objetivo             Classe que armazena as Entregas dos Carros, referente a
 * uma locação
 */
public class TesteEntrega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrega ent = new Entrega(0,0);
        ent.cadastro(DateTimeFormatter dateFormatter);
        ent.mostra();
    }
    
}
