package padroescomportamentamentais.Interpreter;

public class Jogador {
    private double pontuacao1;
    private double pontuacao2;

    public double getPontuacao1() {
        return pontuacao1;
    }

    public void setPontuacao1(double pontuacao1) {
        this.pontuacao1 = pontuacao1;
    }

    public double getPontuacao2() {
        return pontuacao2;
    }

    public void setPontuacao2(double pontuacao2) {
        this.pontuacao2 = pontuacao2;
    }

    public double calcularPontuacao() {
        return Jogo.calcularPontuacao(this.pontuacao1, this.pontuacao2);
    }
}
