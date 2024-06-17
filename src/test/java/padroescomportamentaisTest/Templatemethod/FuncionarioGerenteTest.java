package padroescomportamentaisTest.Templatemethod;

import org.junit.jupiter.api.Test;
import padroescomportamentamentais.Templatemethod.FuncionarioGerente;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioGerenteTest {

    @Test
    void deveCalcularBonusCorretamente() {
        FuncionarioGerente gerente = new FuncionarioGerente("Rossi", 4000.0f, 45.0f);
        assertEquals(800.0f, gerente.calcularBonusSalario(), 0.001f);
    }

    @Test
    void naoDeveCalcularBonusParaMenosDe40Horas() {
        FuncionarioGerente gerente = new FuncionarioGerente("Pedro", 3800.0f, 35.0f);
        assertEquals(760.0f, gerente.calcularBonusSalario(), 0.001f);
    }

    @Test
    void deveCalcularSalarioTotalCorretamenteComBonus() {
        FuncionarioGerente gerente = new FuncionarioGerente("Gerson", 4200.0f, 50.0f);
        assertEquals(5040.0f, gerente.calcularSalarioTotal(), 0.001f);
    }

    @Test
    void deveRetornarInformacoesCorretas() {
        FuncionarioGerente gerente = new FuncionarioGerente("Lorran", 3900.0f, 38.0f);
        assertEquals("Funcionario{nome='Lorran', salarioBase=3900.0, salarioTotal=3900.0}", gerente.getInfo());
    }
}
