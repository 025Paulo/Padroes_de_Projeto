package padroesestruturais.Adapter;

public class NotaAdapter extends NotaEstrelas {
    private INota notaGeral;

    public NotaAdapter(INota notaGeral) {
        this.notaGeral = notaGeral;
    }

    public String recuperarNota() {
        if (this.getEstrelas() >= 9.0f)
            notaGeral.setNota("5 Estrelas");
        else
        if (this.getEstrelas() >= 8.0f)
            notaGeral.setNota("4 Estrelas");
        else
        if (this.getEstrelas() >= 7.0f)
            notaGeral.setNota("3 Estrelas");
        else
            notaGeral.setNota("2 Estrelas");
        return notaGeral.getNota();
    }

    public void salvarNota() {
        if (notaGeral.getNota().equals("5 Estrelas"))
            this.setEstrelas(9.0f);
        else
        if (notaGeral.getNota().equals("4 Estrelas"))
            this.setEstrelas(8.0f);
        else
        if (notaGeral.getNota().equals("3 Estrelas"))
            this.setEstrelas(7.0f);
        else
            this.setEstrelas(0.0f);
    }
}
