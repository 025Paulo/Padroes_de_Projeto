package padroescomportamentamentais.Visitor;

public class Livro implements Item {

    private String titulo;
    private String autor;
    private String isbn;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirLivro(this);
    }
}
