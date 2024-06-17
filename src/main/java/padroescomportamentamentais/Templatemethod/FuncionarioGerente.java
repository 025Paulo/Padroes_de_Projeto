package padroescomportamentamentais.Templatemethod;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(String nome, float salarioBase, float horasTrabalhadas) {
        super(nome, salarioBase, horasTrabalhadas);
    }

    @Override
    public float calcularBonusSalario() {
        return 0.2f * getSalarioBase();
    }
}
