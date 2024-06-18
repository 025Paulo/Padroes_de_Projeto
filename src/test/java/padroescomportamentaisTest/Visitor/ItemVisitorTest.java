package padroescomportamentaisTest.Visitor;

import org.junit.jupiter.api.Test;
import padroescomportamentamentais.Visitor.ItemVisitor;
import padroescomportamentamentais.Visitor.Jornal;
import padroescomportamentamentais.Visitor.Livro;
import padroescomportamentamentais.Visitor.Revista;

import static org.junit.jupiter.api.Assertions.*;

class ItemVisitorTest {

    @Test
    void deveExibirLivro() {
        Livro livro = new Livro("Capitaes de Areia", "Jorge Amado", "123456");
        ItemVisitor visitor = new ItemVisitor();

        String resultado = visitor.exibirLivro(livro);
        assertEquals("Livro{titulo='Capitaes de Areia', autor='Jorge Amado', isbn='123456'}", resultado);
    }

    @Test
    void deveExibirRevista() {
        Revista revista = new Revista("Rolling Stone", "Penske Media Corporation", 42);
        ItemVisitor visitor = new ItemVisitor();

        String resultado = visitor.exibirRevista(revista);
        assertEquals("Revista{titulo='Rolling Stone', editora='Penske Media Corporation', edicao=42}", resultado);
    }

    @Test
    void deveExibirJornal() {
        Jornal jornal = new Jornal("Daily News", "12-03-2024");
        ItemVisitor visitor = new ItemVisitor();

        String resultado = visitor.exibirJornal(jornal);
        assertEquals("Jornal{nome='Daily News', data='12-03-2024'}", resultado);
    }
}
