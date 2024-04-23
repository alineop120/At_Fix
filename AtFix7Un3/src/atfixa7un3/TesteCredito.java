package atfixa7un3;

/**
     * Escola Técnica de Brasília
     * Curso Técnico de Informática
     * Linguagem Técnica de Programação 1
     * Aline Oliveira de Pinho 16.04.2024
     * Turma: 2H
     * Objetivo: Classe executável que dados o valor do salário bruto e o valor 
     da prestação
     */
public class TesteCredito {

    public static void main(String[] args) {
        Credito cd = new Credito();
        cd.receberValores();
        cd.calcularSalario();
        cd.verificarEmprestimo();
        cd.mostrarSalario();
    }
    
}
