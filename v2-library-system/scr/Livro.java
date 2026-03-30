public class Livro {
    private String nome;
    private boolean disponivel = true;
    private String nomeDono;

    Livro(String nome) {
        setNome(nome);
    }
    private void setNome(String nome) {
        if(nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
            return;
        }
        this.nome = "NULL";
        System.out.println("Nome inserido invalido, nome padrao *NULL* adotado");
    }
    public String getNome() {
        return nome;
    }
    public String getNomeDono() {
        return nomeDono;
    }
    public boolean isDisponivel() {
        return disponivel;
    }

    public void alugarPara(String usuario) {
        disponivel = false;
        nomeDono = usuario;
    }
    public void devolver() {
        disponivel = true;
        nomeDono = null;
    }

}
