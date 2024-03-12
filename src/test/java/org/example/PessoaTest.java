package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveEmitirReciboPF () {
        Fabrica fabrica = new FabricaPF();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Recibo Pessoa Fisica", pessoa.emitirRecibo());
    }

    @Test
    void deveEmitirReciboPJ () {
        Fabrica fabrica = new FabricaPJ();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Recibo pessoa juridica", pessoa.emitirRecibo());
    }

    @Test
    void deveEmitirHistoricoPF () {
        Fabrica fabrica = new FabricaPF();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Historico Recibo pessoa fisica", pessoa.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoPJ() {
        Fabrica fabrica = new FabricaPJ();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Historico Recibo pessoa juridica", pessoa.emitirHistorico()) ;
    }

}