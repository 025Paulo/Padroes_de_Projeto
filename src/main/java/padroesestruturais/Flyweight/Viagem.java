package padroesestruturais.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private List<Passageiro> passageiros = new ArrayList<>();

    public void marcarViagem(String nomePassageiro, String nomeDestino, String estado) {
        Destino destino = DestinoFactory.getDestino(nomeDestino, estado);
        Passageiro passageiro = new Passageiro(nomePassageiro, destino);
        passageiros.add(passageiro);
    }

    public List<String> obterPassageiros() {
        List<String> saida = new ArrayList<String>();
        for (Passageiro passageiro : this.passageiros) {
            saida.add(passageiro.obterPassageiro());
        }
        return saida;
    }
}
