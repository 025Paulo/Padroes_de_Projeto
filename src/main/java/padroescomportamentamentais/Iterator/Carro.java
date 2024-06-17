package padroescomportamentamentais.Iterator;

public class Carro {

    private String placa;
    private boolean estacionado;

    public Carro(String placa, boolean estacionado) {
        this.placa = placa;
        this.estacionado = estacionado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isEstacionado() {
        return estacionado;
    }

    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;
    }
}
