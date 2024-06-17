package padroescomportamentamentais.State;

public class PacienteEstadoCirurgia extends PacienteEstado {

    private PacienteEstadoCirurgia() {}
    private static PacienteEstadoCirurgia instance = new PacienteEstadoCirurgia();
    public static PacienteEstadoCirurgia getInstance(){
        return instance;
    }

    public String getEstado() {
        return "Foi para cirurgia";
    }

    @Override
    public boolean observacao(Paciente paciente) {
        return true;
    }

    @Override
    public boolean cirurgia(Paciente paciente) {
        return false;
    }

    @Override
    public boolean tratamento(Paciente paciente) {
        return true;
    }

    @Override
    public boolean alta(Paciente paciente) {
        return true;
    }



}
