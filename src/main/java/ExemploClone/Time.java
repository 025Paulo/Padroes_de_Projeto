package ExemploClone;

public class Time implements Cloneable {
    private String estadio;
    private String endereco;

    public Time(String estadio, String endereco) {
        super();
        this.estadio = estadio;
        this.endereco = endereco;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Time{" +
                "estadio='" + estadio + '\'' +
                ", endereco='" + endereco + '\'' + '}';
    }

}


