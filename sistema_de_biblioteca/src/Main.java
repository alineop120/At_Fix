/*
    Author: Ítalo Sales Vasconcelos
    Desafio: Sistema de empréstimo, de uma biblioteca,
    que permite emprestar livros entre a biblioteca e
    clientes; além de empréstimos entre clientes. Cada
    cliente deve ter uma ID e um nome, cada livro deve
    ter informações como: Nome, autor(a) e quantidade
    de páginas.
 */

import library.LoanSystem.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Criando objetos usuários
        User user_1 = new User("Lucas");
        User user_2 = new User("Rafael");
        // Criando um objeto livro
        Book book_1 = new Book("Diário de um banana", "Jeff Kinney", "224");
        // Criando empréstimo
        Loan loan_library = new Loan(user_1, book_1);
        loan_library.getInfoLoan();
        System.out.println();
        // Criando empréstimo entre usuários
        user_1.loanUserToUser(book_1, user_2);
        // Devolução de livro entre usuários
        user_2.giveBackBook(user_1, book_1);
        System.out.println();
        // Fazendo a devolução do livro
        user_1.giveBackBook(loan_library, book_1);
    }
}