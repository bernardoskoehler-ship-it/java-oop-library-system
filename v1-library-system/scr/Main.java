public static void main(String[] args) {
    Biblioteca b = new Biblioteca();
    Padrao[] p = {
      new Padrao("Bruno"),
      new Padrao("Bernardo"),
      new Padrao("Beico")
    };

    p[0].alugar(0);
    p[0].alugar(0);
    p[0].devolver(0);
    b.mostrarLista();
    b.mostarLivro(0);
}
