package padroesestruturais.Composite;

import java.util.ArrayList;
import java.util.List;

public class Gravadora extends Album{
    private List<Album> albums;

    public Gravadora(String descricao) {
        super(descricao);
        this.albums = new ArrayList<Album>();
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public String getAlbum() {
        String saida = "Gravadora: " + this.getDescricao() + "\n";
        for (Album album : albums) {
            saida += album.getAlbum();
        }
        return saida;
    }
}
