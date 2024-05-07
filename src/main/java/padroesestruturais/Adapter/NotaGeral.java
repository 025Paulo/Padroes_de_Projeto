package padroesestruturais.Adapter;

public class NotaGeral implements INota {
    private String geral;

    @Override
    public String getNota() {
        return this.geral;
    }
    @Override
    public void setNota(String geral) {
        this.geral = geral;
    }

}

