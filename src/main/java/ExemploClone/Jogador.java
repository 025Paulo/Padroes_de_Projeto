package ExemploClone;

public class Jogador implements Cloneable {
    private int camisa;
    private String nome;
    private Time time;
    private String faculdade;

    public Jogador(int camisa,String nome, Time time, String faculdade) {
        this.camisa = camisa;
        this.nome = nome;
        this.time = time;
        this.faculdade = faculdade;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    @Override
    public Jogador clone() throws CloneNotSupportedException {
        Jogador jogadorClone = (Jogador) super.clone();
        jogadorClone.time = (Time) jogadorClone.time.clone();
        return jogadorClone;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "camisa=" + camisa +
                ", nome='" + nome + '\'' +
                ", time=" + time +
                ", faculdade='" + faculdade + '\'' +
                '}';
    }
}
