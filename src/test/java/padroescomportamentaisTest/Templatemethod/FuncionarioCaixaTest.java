package padroescomportamentaisTest.Templatemethod;

import org.junit.jupiter.api.Test;
import padroescomportamentamentais.Templatemethod.FuncionarioCaixa;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioCaixaTest {

    @Test
    void deveCalcularBonusCorretamente() {
        FuncionarioCaixa funcionario = new FuncionarioCaixa("João", 3000.0f, 42.0f);
        assertEquals(300.0f, funcionario.calcularBonusSalario(), 0.001f);
    }

    @Test
    void naoDeveCalcularBonusParaMenosDe40Horas() {
        FuncionarioCaixa funcionario = new FuncionarioCaixa("Maria", 2800.0f, 35.0f);
        assertEquals(280.0f, funcionario.calcularBonusSalario(), 0.001f);
    }

    @Test
    void deveCalcularSalarioTotalCorretamenteComBonus() {
        FuncionarioCaixa funcionario = new FuncionarioCaixa("Carlos", 3200.0f, 45.0f);
        assertEquals(3520.0f, funcionario.calcularSalarioTotal(), 0.001f);
    }

    @Test
    void deveRetornarInformacoesCorretas() {
        FuncionarioCaixa funcionario = new FuncionarioCaixa("Ana", 2900.0f, 38.0f);
        assertEquals("Funcionario{nome='Ana', salarioBase=2900.0, salarioTotal=2900.0}", funcionario.getInfo());
    }
}