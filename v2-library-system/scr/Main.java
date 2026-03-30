public static void main(String[] args) {
    Biblioteca b = new Biblioteca();
    Padrao[] p = {
      new Padrao("Bernardo", b),
      new Padrao("Leo", b)
    };
    Administrador a = new Administrador("Duda", b);

    a.adicionarLivro("Pulginha Legacy");
    a.adicionarLivro("Sniper Americano");
    a.adicionarLivro("Harry Poter");
    a.adicionarLivro("1987");

    p[1].alugarLivro(0);
    p[1].alugarLivro(3);
    p[0].devolverLivro(0);
    b.mostrarLivro(0);
    b.mostrarLivros();
}
