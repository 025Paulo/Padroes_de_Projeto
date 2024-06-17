package padroescomportamentamentais.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Vaga implements Iterable<Carro>{

    private List<Carro> carros = new ArrayList<Carro>();

    public Vaga(Carro... carros) {
        this.carros = Arrays.asList(carros);
    }

    @Override
    public Iterator<Carro> iterator() {
        return carros.iterator();
    }

}
