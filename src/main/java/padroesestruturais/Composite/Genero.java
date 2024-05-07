package padroesestruturais.Composite;

public class Genero extends Album {
    private String generoMusica;

    public Genero(String descricao, String generoMusica) {
        super(descricao);
        this.generoMusica = generoMusica;
    }

    public String getGenero() {
        return generoMusica;
    }

    public void setGenero(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public String getAlbum() {
        return "genero Musica: " + this.getDescricao() + " - genero musica: " + this.generoMusica + "\n";
    }
}
