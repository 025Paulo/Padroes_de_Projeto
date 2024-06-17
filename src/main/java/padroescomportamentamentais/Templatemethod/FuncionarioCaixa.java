package padroescomportamentamentais.Templatemethod;

public class FuncionarioCaixa extends Funcionario {

    public FuncionarioCaixa(String nome, float salarioBase, float horasTrabalhadas) {
        super(nome, salarioBase, horasTrabalhadas);
    }

    @Override
    public float calcularBonusSalario() {
        return 0.1f * getSalarioBase();
    }
}
