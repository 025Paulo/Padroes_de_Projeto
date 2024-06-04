package padroescomportamentamentais.Observer;

import java.util.Observable;

public class Nubank extends Observable {

    private Integer dia;
    private String mes;

    public Nubank(Integer dia, String mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public void mandarPix() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Nubank{" +
                "dia=" + dia +
                ", mes='" + mes + '\'' +
                '}';
    }

}
