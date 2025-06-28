public class mainLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.autor = "Joao";
        livro1.titulo = "Pe de feijao";
        livro1.anoDePublicacao = 2006;

        Livro livro2 = new Livro();
        livro2.autor = "Pedro";
        livro2.titulo = "Curintia";
        livro2.anoDePublicacao = 2012;

        livro1.exibirInfo(livro1);
        System.out.println("--------------------");
        livro2.exibirInfo(livro2);
        System.out.println("======================");
        livro1.atualizarAno(2020);
        livro1.exibirInfo(livro1);
        System.out.println("--------------------");
        livro2.exibirInfo(livro2);
    }
}
