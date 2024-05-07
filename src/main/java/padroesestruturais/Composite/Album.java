package padroesestruturais.Composite;

import padroesestruturais.Adapter.Musica;

public abstract class Album {
    private String descricao;

    public Album(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getAlbum();
}
