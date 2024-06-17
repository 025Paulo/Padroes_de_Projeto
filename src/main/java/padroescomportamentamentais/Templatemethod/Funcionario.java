package padroescomportamentamentais.Templatemethod;

public abstract class Funcionario {

    protected String nome;
    private float salarioBase;
    private float horasTrabalhadas;

    public Funcionario(String nome, float salarioBase, float horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public float calcularSalarioTotal() {
        float salarioTotal = salarioBase;
        if (horasTrabalhadas > 40) {
            salarioTotal += calcularBonusSalario();
        }
        return salarioTotal;
    }

    public abstract float calcularBonusSalario();

    public String getInfo() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioTotal=" + calcularSalarioTotal() +
                '}';
    }
}
