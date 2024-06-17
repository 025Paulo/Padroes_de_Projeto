package padroescomportamentamentais.Iterator;

import java.util.Iterator;

public class Estacionamento {

    public static Integer contarVagasUtilizadas(Vaga vaga) {
        int quantidade = 0;
        for (Carro carro : vaga) {
            if (carro.isEstacionado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalVagas(Vaga vaga) {
        int quantidade = 0;
        for (Iterator<Carro> it = vaga.iterator(); it.hasNext(); ) {
            quantidade++;
            it.next();
        }
        return quantidade;
    }
}
