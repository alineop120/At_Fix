package library.LoanSystem;

public class Book {
    private boolean isLoan = false;
    private final String[] infoBook = new String[3];

    // Construtor da Classe Book
    public Book(String name, String author, String pages) {
        infoBook[0] = name;
        infoBook[1] = author;
        infoBook[2] = pages;
    }

    // Método que retorna se o livro já foi emprestado
    public boolean getIsLoan() {
        return this.isLoan;
    }

    // Método que gerencia a disponibilidade do livro
    public void setLoan(boolean bool) {
        this.isLoan = bool;
    }

    // Método que retorna as informações do livro
    public String getInfoBook(String i) {
        switch (i) {
            case "name":
                return infoBook[0];
            case "author":
                return infoBook[1];
            case "pages":
                return infoBook[2];
            case "all":
                return String.format(
                        "Nome do livro: %s\nAutor(a) do livro: %s\nPáginas: %s\n",
                        infoBook[0],
                        infoBook[1],
                        infoBook[2]);
            default:
                return "";
        }
    }
}
