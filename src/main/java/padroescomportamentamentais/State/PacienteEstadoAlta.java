package padroescomportamentamentais.State;

public class PacienteEstadoAlta extends PacienteEstado {

    private PacienteEstadoAlta() {};
    private static PacienteEstadoAlta instance = new PacienteEstadoAlta();
    public static PacienteEstadoAlta getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Teve alta";
    }

    @Override
    public boolean observacao(Paciente paciente) {
        return false;
    }

    @Override
    public boolean cirurgia(Paciente paciente) {
        return false;
    }

    @Override
    public boolean tratamento(Paciente paciente) {
        return false;
    }

    @Override
    public boolean alta(Paciente paciente) {
        return false;
    }
}
