package ExemploBuilder;

import java.util.Date;

public class JogadorBuilder {

    private Jogador jogador;

    public JogadorBuilder() {
        jogador = new Jogador();
    }
    public Jogador build() {
        if (jogador.getNumeroCamisa() < 0 || jogador.getNumeroCamisa() >= 100) {
            throw new IllegalArgumentException("Numero inválido");
        }
        if (jogador.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (jogador.getTime().equals("")) {
            throw new IllegalArgumentException("Time inválido");
        }
        return jogador;
    }


    public JogadorBuilder setNome(String nome) {
        jogador.setNome(nome);
        return this;
    }

    public JogadorBuilder setDataNascimento(Date dataNascimento) {
        jogador.setDataNascimento(dataNascimento);
        return this;
    }

    public JogadorBuilder setNomeMae(String nomeMae) {
        jogador.setNomeMae(nomeMae);
        return this;
    }

    public JogadorBuilder setNomePai(String nomePai) {
        jogador.setNomePai(nomePai);
        return this;
    }

    public JogadorBuilder setCpf(String cpf) {
        jogador.setCpf(cpf);
        return this;
    }

    public JogadorBuilder setEmail(String email) {
        jogador.setEmail(email);
        return this;
    }

    public JogadorBuilder setSalario(int salario) {
        jogador.setSalario(salario);
        return this;
    }

    public JogadorBuilder setInstagram(String instagram) {
        jogador.setInstagram(instagram);
        return this;
    }

    public JogadorBuilder setNumeroCamisa(int numeroCamisa) {
        jogador.setNumeroCamisa(numeroCamisa);
        return this;
    }

    public JogadorBuilder setTime(String time) {
        jogador.setTime(time);
        return this;
    }
}