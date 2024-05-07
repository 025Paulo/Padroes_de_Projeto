package padroesestruturais.Adapter;

public class Musica {
    INota nota;
    NotaAdapter qualidade;

    public Musica() {
        nota = new NotaGeral();
        qualidade = new NotaAdapter(nota);
    }

    public void setNota (String geral) {
        nota.setNota(geral);
        qualidade.salvarNota();
    }

    public String getNota() {
        return qualidade.recuperarNota();
    }

    public float getEstrelas() {
        return qualidade.getEstrelas();
    }
}

