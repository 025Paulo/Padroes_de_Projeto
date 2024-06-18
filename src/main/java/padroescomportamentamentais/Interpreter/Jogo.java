package padroescomportamentamentais.Interpreter;

public class Jogo {

    public static String formula = "pontuacao1 * 2 + pontuacao2";

    public static double calcularPontuacao(double pontuacao1, double pontuacao2) {
        String expressao;
        expressao = formula.replace("pontuacao1", Double.toString(pontuacao1));
        expressao = expressao.replace("pontuacao2", Double.toString(pontuacao2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}


