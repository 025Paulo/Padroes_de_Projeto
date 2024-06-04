package padroescomportamentamentais.State;

public class PacienteEstadoInternado extends PacienteEstado {


    public String PacienteEstadoInternado() {};
    private static PacienteEstadoInternado instance = new PacienteEstadoInternado();
    public static PacienteEstadoInternado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Internado";
    }

    @Override
    public boolean alta(Paciente paciente) {
        paciente.setEstado(PacienteEstadoAlta.getInstance());
        return true;
    }
}
