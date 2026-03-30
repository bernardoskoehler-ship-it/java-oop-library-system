import Interfaces.AdicionarRemover;

public class Administrador extends Usuario implements AdicionarRemover {
    Administrador(String nome, Biblioteca b) {
        super(nome, b);
    }
    @Override
    public void adicionarLivro(String nome) {
        b.adicionarLivro(nome);
    }
    @Override
    public void removerLivro(int i) {
        b.removerLivro(i);
    }
}
