package padroescomportamentamentais.Visitor;

public class Revista implements Item {

    private String titulo;
    private String editora;
    private int edicao;

    public Revista(String titulo, String editora, int edicao) {
        this.titulo = titulo;
        this.editora = editora;
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirRevista(this);
    }
}
