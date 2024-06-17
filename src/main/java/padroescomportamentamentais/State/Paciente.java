package padroescomportamentamentais.State;

public class Paciente {

    private String nome;
    private PacienteEstado estado;

    public Paciente() {
        this.estado = PacienteEstadoInternado.getInstance();
    }

    public void setEstado(PacienteEstado estado) {
        this.estado = estado;
    }

    public boolean internar() {
        return estado.internar(this);
    }

    public boolean alta() {
        return estado.alta(this);
    }

    public boolean cirurgia() {
        return estado.cirurgia(this);
    }

    public boolean observacao() {
        return estado.observacao(this);
    }

    public boolean tratamento() {
        return estado.tratamento(this);
    }

    public boolean internarCTI() {
        return estado.internarCTI(this);
    }

    public boolean internarUTI() {
        return estado.internarUTI(this);
    }


    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return estado.getEstado();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PacienteEstado getEstado() {
        return estado;
    }
}
