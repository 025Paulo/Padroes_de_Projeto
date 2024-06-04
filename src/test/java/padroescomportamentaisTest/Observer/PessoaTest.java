package padroescomportamentaisTest.Observer;

import org.junit.jupiter.api.Test;
import padroescomportamentamentais.Observer.Nubank;
import padroescomportamentamentais.Observer.Pessoa;

import static org.junit.Assert.assertEquals;

class PessoaTest {

    @Test
    void deveNotificarPessoa() {
        Nubank nubank = new Nubank(21, "maio");
        Pessoa pessoa = new Pessoa("Paulo");
        pessoa.gerarChavePix(nubank);
        nubank.mandarPix();
        assertEquals("Paulo, você recebeu um pix na Nubank{dia=21, mes='maio'}", pessoa.getNotificacaoPix());
    }

    @Test
    void deveNotificarPessoas() {
        Nubank nubank = new Nubank(21, "maio");
        Pessoa pessoa1 = new Pessoa("Paulo");
        Pessoa pessoa2 = new Pessoa("Bruno");
        pessoa1.gerarChavePix(nubank);
        pessoa2.gerarChavePix(nubank);
        nubank.mandarPix();
        assertEquals("Paulo, você recebeu um pix na Nubank{dia=21, mes='maio'}", pessoa1.getNotificacaoPix());
        assertEquals("Bruno, você recebeu um pix na Nubank{dia=21, mes='maio'}", pessoa2.getNotificacaoPix());
    }

    @Test
    void naoDeveNotificarPessoa() {
        Nubank nubank = new Nubank(21, "junho");
        Pessoa pessoa = new Pessoa("Alex");
        nubank.mandarPix();
        assertEquals(null, pessoa.getNotificacaoPix());
    }


}
