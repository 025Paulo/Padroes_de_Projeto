package padroesestruturaistest.Composite;

import org.junit.Test;
import padroesestruturais.Composite.Faixa;
import padroesestruturais.Composite.Genero;
import padroesestruturais.Composite.Gravadora;

import static org.junit.Assert.assertEquals;

public class AlbumTest {

    @Test
    public void deveRetornarTituloMusica() {
        Gravadora gravadora1 = new Gravadora("Album Kendrick Lamar");
        Genero generoHipHop = new Genero("HipHop", "HipHop");
        gravadora1.addAlbum(generoHipHop);

        Gravadora gravadora2 = new Gravadora("TDE");
        gravadora2.addAlbum(gravadora1);


        Gravadora titulo = new Gravadora("TPAB");
        titulo.addAlbum(gravadora2);

        Faixa faixa = new Faixa();
        faixa.setTitulo(titulo);

        String resultado = faixa.getTitulo();

        String esperado = "Gravadora: TPAB\n" +
                "Gravadora: TDE\n" +
                "Gravadora: Album Kendrick Lamar\n" +
                "genero Musica: HipHop - genero musica: HipHop\n";
        assertEquals(esperado, resultado);

    }
}
