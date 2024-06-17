package padroescomportamentamentais.State;

public class PacienteEstadoTratamento extends PacienteEstado {

    public PacienteEstadoTratamento() {}
    public static PacienteEstadoTratamento instance = new PacienteEstadoTratamento();
    public static PacienteEstadoTratamento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Paciente em tratamento";
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
        return false;
    }

    @Override
    public boolean alta(Paciente paciente) {
        paciente.setEstado(PacienteEstadoAlta.getInstance());
        return true;
    }

}
