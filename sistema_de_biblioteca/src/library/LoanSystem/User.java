package library.LoanSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class User {
    private final String name_user;
    private String id_user;
    private ArrayList<Book> loan_books_user;
    protected Loan user_loan;
    private int loan_books_u2u;

    // Construtor da classe usuário
    public User(String name_user) {
        loan_books_user = new ArrayList<>();
        this.name_user = name_user;
        idMaker();
    }
    // Método que retorna o nome do(a) usuário(a)
    public String getNameUser() {
        return name_user;
    }
    // Método que retorna a ID do usuário
    public String getIdUser() {
        return this.id_user;
    }
    // Método que cria uma ID pro usuário
    private void idMaker() {
        String year = String.valueOf( LocalDateTime.now().getYear() );
        String nano_seconds = String.valueOf( LocalDateTime.now().getNano() ).substring(0,2);
        this.id_user = ( year + nano_seconds + "-" + this.name_user.charAt(0) );
    }
    // Métodos para gerenciar os livros anexados oo usuário(a)
    protected void setBooksUser(String action ,Book book) {
        switch (action) {
            case "add" : this.loan_books_user.add(book); break;
            case "minus" : this.loan_books_user.remove(book); break;
            case "clear" : this.loan_books_user.clear();
        }
    }
    // Métodos para devolver o livro
    public void giveBackBook(Loan loan, Book book) {
        book.setLoan(false);
        loan.returnBook();
        System.out.printf("O livro '%s' for devolvido a biblioteca por %s (User_id: %s)\n",
                        book.getInfoBook("name"),
                        this.name_user,
                        this.id_user);
    }
    public void giveBackBook(User user, Book book) {
        user.user_loan.returnBook();
        user.setBooksUser("add", book);
        System.out.printf("%s devolveu o livro '%s' para %s (User_id: %s)\n",
                        this.name_user,
                        book.getInfoBook("name"),
                        user.getNameUser(),
                        user.getIdUser());
    }
    // Método para um usuário(a) emprestar para outro(a) usuário(a)
    public void loanUserToUser(Book book, User user) {
        if (loan_books_u2u < 3) {
            if (loan_books_user.contains(book)) {
                book.setLoan(false);
                user_loan = new Loan(user, book);
                loan_books_u2u++;
                System.out.printf("O livro '%s' foi emprestado por %s para %s (User_id: %s)\n",
                        book.getInfoBook("name"),
                        this.name_user,
                        user.getNameUser(),
                        user.getIdUser());
            } else {
                System.err.printf("Usuário(a) %s não possui o livro %s para poder emprestar\n",
                                this.name_user,
                                book.getInfoBook("name"));
            }
        } else {
            System.err.println("Você não pode emprestar mais de 3 livros");
        }
    }
}