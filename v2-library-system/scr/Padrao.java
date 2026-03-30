import Interfaces.AlugarDevolver;

public class Padrao extends Usuario implements AlugarDevolver {
    Padrao(String nome, Biblioteca b) {
        super(nome, b);
    }

    @Override
    public void alugarLivro(int i) {
        b.alugarLivro(i, getNome());
    }

    @Override
    public void devolverLivro(int i) {
        b.devolverLivro(i, getNome());
    }
}
