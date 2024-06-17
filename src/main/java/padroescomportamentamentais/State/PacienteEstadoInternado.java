package padroescomportamentamentais.State;

public class PacienteEstadoInternado extends PacienteEstado {
    public PacienteEstadoInternado() {}
    private static PacienteEstadoInternado instance = new PacienteEstadoInternado();
    public static PacienteEstadoInternado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Internado";
    }

    public boolean alta(Paciente paciente) {
        paciente.setEstado(PacienteEstadoAlta.getInstance());
        return true;
    }

    @Override
    public boolean cirurgia(Paciente paciente) {
        paciente.setEstado(PacienteEstadoCirurgia.getInstance());
        return true;
    }
    @Override
    public boolean internarCTI(Paciente paciente) {
        paciente.setEstado(PacienteEstadoCTI.getInstance());
        return true;
    }
    @Override
    public boolean internarUTI(Paciente paciente) {
        paciente.setEstado(PacienteEstadoUTI.getInstance());
        return true;
    }
    @Override
    public boolean observacao(Paciente paciente) {
        paciente.setEstado(PacienteEstadoObservacao.getInstance());
        return true;
    }
    @Override
    public boolean tratamento(Paciente paciente) {
        paciente.setEstado(PacienteEstadoTratamento.getInstance());
        return true;
    }
}
