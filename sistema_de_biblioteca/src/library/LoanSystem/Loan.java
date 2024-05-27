package library.LoanSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Loan {
    private final User user;
    private final Book book;
    private final String[] date = new String[2];

    // Construtor da classe Loan
    public Loan(User user, Book book) {
        this.user = user;
        this.book = book;
        verifyBooks();
        user.setBooksUser("add", book);
    }
    // Método que define o empréstimo como terminado
    protected void returnBook() {
        user.setBooksUser("minus", book);
    }
    // Método para verificar disponibilidade do livro
    private void verifyBooks(){
        if(book.getIsLoan()){
            System.err.println("Livro indisponível!");
        } else {
            book.setLoan(true);
            setDate();
        }
    }
    // Método para configurar data de empréstimo e devolução do livro
    private void setDate(){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();

        this.date[0] = "Livro emprestado em: " +
                now.toLocalDate().format(f);
        this.date[1] = "Data para a devolução do livro: " +
                now.toLocalDate().plusDays(7).format(f);
    }
    // Método que imprime informações do empréstimo
    public void getInfoLoan(){
        System.out.printf("O livro '%s' foi emprestado para %s (User_id: %s)\n%s\n%s\n",
                this.book.getInfoBook("name"),
                this.user.getNameUser(),
                this.user.getIdUser(),
                date[0], date[1]
        );
    }
}