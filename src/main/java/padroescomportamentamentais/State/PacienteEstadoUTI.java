package padroescomportamentamentais.State;

public class PacienteEstadoUTI extends PacienteEstado {

    private PacienteEstadoUTI() {}
    private static PacienteEstadoUTI instance = new PacienteEstadoUTI();

    public static PacienteEstado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Internado no UTI";
    }

    @Override
    public boolean observacao(Paciente paciente) {
        paciente.setEstado(PacienteEstadoObservacao.getInstance());
        return true;
    }

    @Override
    public boolean cirurgia(Paciente paciente) {
        paciente.setEstado(PacienteEstadoCirurgia.getInstance());
        return true;
    }

    @Override
    public boolean tratamento(Paciente paciente) {
        paciente.setEstado(PacienteEstadoTratamento.getInstance());
        return true;
    }

    @Override
    public boolean alta(Paciente paciente) {
        return false;
    }
}

