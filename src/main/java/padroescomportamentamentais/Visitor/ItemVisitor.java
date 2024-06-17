package padroescomportamentamentais.Visitor;

public class ItemVisitor implements Visitor {
    @Override
    public String exibirLivro(Livro livro) {
        return "Livro{" +
                "titulo='" + livro.getTitulo() + '\'' +
                ", autor='" + livro.getAutor() + '\'' +
                ", isbn='" + livro.getIsbn() + '\'' +
                '}';
    }

    @Override
    public String exibirRevista(Revista revista) {
        return "Revista{" +
                "titulo='" + revista.getTitulo() + '\'' +
                ", editora='" + revista.getEditora() + '\'' +
                ", edicao=" + revista.getEdicao() +
                '}';
    }

    @Override
    public String exibirJornal(Jornal jornal) {
        return "Jornal{" +
                "nome='" + jornal.getNome() + '\'' +
                ", data='" + jornal.getData() + '\'' +
                '}';
    }
}
