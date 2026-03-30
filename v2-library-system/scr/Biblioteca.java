import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<>();

    private boolean indiceValido(int valor) {
        if(valor >= 0 && valor < livros.size()) {
            return true;
        }
        System.out.println("Valor inserido invalido");
        return false;
    }

    void adicionarLivro(String nome) {
        livros.add(new Livro(nome));
        System.out.println(nome +" foi adicionado");
    }
    void removerLivro(int i) {
        if(!indiceValido(i)) {
            return;
        }
        Livro livro = livros.get(i);
        if (!livro.isDisponivel()) {
            System.out.println("Nao foi possivel remover o livro pois ele se encontra indisponivel no momento");
            return;
        }
        System.out.println(livro.getNome() +" foi removido!");
        livros.remove(i);
    }

    void alugarLivro(int i,String usuario) {
        if(!indiceValido(i)) {
            return;
        }
        Livro livro = livros.get(i);
        if(!livro.isDisponivel()) {
            System.out.println(livro.getNome() +" nao esta disponivel!");
            return;
        }
        livro.alugarPara(usuario);
        System.out.println(livro.getNome() +" foi alugado por " +usuario);
    }
    void devolverLivro(int i, String usuario) {
        if(!indiceValido(i)) {
            return;
        }
        Livro livro = livros.get(i);
        if(livro.isDisponivel()) {
            System.out.println(livro.getNome() +" esta disponivel");
            return;
        }
        if(!livro.getNomeDono().equals(usuario)) {
            System.out.println(livro.getNome() +" nao foi alugado por voce");
            return;
        }
        livro.devolver();
        System.out.println(usuario + " devolveu " + livro.getNome());
    }
    public void mostrarLivros() {
        for(Livro p : livros) {
            System.out.println("Nome do livro: " +p.getNome() +" | Disponivel: " +p.isDisponivel());
        }
    }
    public void mostrarLivro(int i) {
        if(!indiceValido(i)) {
            return;
        }
        Livro livro = livros.get(i);
        System.out.println("Livro: " +livro.getNome());
        if(!livro.isDisponivel()) {
            System.out.println("Alugado por: " +livro.getNomeDono());
            return;
        }
        System.out.println("Esta disponivel!");
    }
}
