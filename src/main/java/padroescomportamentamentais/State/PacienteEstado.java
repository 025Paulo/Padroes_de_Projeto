package padroescomportamentamentais.State;

public abstract class PacienteEstado {

    public abstract String getEstado();

    public boolean alta(Paciente paciente) {
        return false;
    }

    public boolean cirurgia(Paciente paciente) {
        return false;
    }

    public boolean internar(Paciente paciente) {
        return false;
    }

    public boolean observacao(Paciente paciente) {
        return false;
    }

    public boolean tratamento(Paciente paciente) {
        return false;
    }

    public boolean internarCTI(Paciente paciente) {
        return false;
    }

    public boolean internarUTI(Paciente paciente) {
        return false;
    }

}
