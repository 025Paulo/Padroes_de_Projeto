package padroesestruturais.Decorator;

public class CafeTipo implements Cafe {
    public String preco;
    public String acucar;


    public CafeTipo(String preco, String acucar) {
        this.preco = preco;
        this.acucar = acucar;

    }

    public CafeTipo(String preco) {
        this.preco = preco;
    }

    public String getPreco() {
        return preco;
    }

    public String getAcucar() {
        return acucar;
    }
}
