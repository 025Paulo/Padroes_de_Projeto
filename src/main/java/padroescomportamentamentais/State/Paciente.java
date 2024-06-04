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



    //////// final abaixo

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
