abstract class Usuario {
    private String nome;
    Biblioteca b;

    Usuario(String nome, Biblioteca b) {
        setNome(nome);
        this.b = b;
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
}
