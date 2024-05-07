package padroesestruturais.Composite;

public class Faixa {

    private Album titulo;

    public void setTitulo(Album titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        if (this.titulo == null) {
            throw new NullPointerException("Faixa sem titulo");
        }
        return this.titulo.getAlbum();
    }
}