package padroescomportamentaisTest.Command;

import org.junit.jupiter.api.Test;
import padroescomportamentamentais.Command.*;

class ControleRemotoTest {

    @Test
    void deveLigarLuz() {
        Luz luzSala = new Luz("Sala");
        Comando ligarLuz = new LigarLuzComando(luzSala);
        ControleRemoto controle = new ControleRemoto();

        controle.executarComando(ligarLuz);
    }

    @Test
    void deveDesligarLuz() {
        Luz luzQuarto = new Luz("Quarto");
        Comando desligarLuz = new DesligarLuzComando(luzQuarto);
        ControleRemoto controle = new ControleRemoto();

        controle.executarComando(desligarLuz);
    }

    @Test
    void deveCancelarUltimoComando() {
        Luz luzCozinha = new Luz("Cozinha");
        Comando ligarLuz = new LigarLuzComando(luzCozinha);
        ControleRemoto controle = new ControleRemoto();

        controle.executarComando(ligarLuz);
        controle.cancelarUltimoComando();
    }
}
