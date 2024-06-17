package padroescomportamentamentais.State;

public class PacienteEstadoCTI extends PacienteEstado{

    private PacienteEstadoCTI() {}
    private static PacienteEstadoCTI instance = new PacienteEstadoCTI();
    public static PacienteEstadoCTI getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Internado no CTI";
    }

    public boolean observacao(Paciente paciente) {
        paciente.setEstado(PacienteEstadoObservacao.getInstance());
        return true;
    }

}
