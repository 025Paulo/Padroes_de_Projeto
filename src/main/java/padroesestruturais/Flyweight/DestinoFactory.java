package padroesestruturais.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DestinoFactory {
    private static Map<String, Destino> destinos = new HashMap<>();

    public static Destino getDestino(String cidade, String estado) {
        Destino destino = destinos.get(cidade);
        if (destino == null) {
            destino = new Destino(cidade, estado);
            destinos.put(cidade, destino);
        }
        return destino;
    }

    public static int getTodosDestinos() {
        return destinos.size();
    }
}
