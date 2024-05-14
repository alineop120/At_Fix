
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

    public static void main(String[] args) {
        // Define um DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Cria um objeto Entrega
        Entrega ent = new Entrega(0, 0, "");
        
        // Chama o método cadastro e passa o DateTimeFormatter
        ent.cadastro(dateFormatter);

        // Chama o método mostra para exibir os detalhes
        ent.mostra();
    }
}
