package padroescomportamentamentais.State;

public class PacienteEstadoObservacao extends PacienteEstado{

    private PacienteEstadoObservacao() {}
    private static PacienteEstadoObservacao instance = new PacienteEstadoObservacao();
    public static PacienteEstadoObservacao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em observacao";
    }

    public boolean internarCTI(Paciente paciente) {
        paciente.setEstado(PacienteEstadoCTI.getInstance());
        return true;
    }

    @Override
    public boolean observacao(Paciente paciente) {
        return false;
    }

    @Override
    public boolean tratamento(Paciente paciente) {
        return true;
    }

    @Override
    public boolean cirurgia(Paciente paciente) {
        return true;
    }

    @Override
    public boolean alta(Paciente paciente) {
        return true;
    }
}
