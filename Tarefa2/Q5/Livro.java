public class Livro {
    String autor;
    String titulo;
    int anoDePublicacao;

    void exibirInfo(Livro livro){
        System.out.println("Autor: " + livro.autor);
        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Ano de Publicacao: " + livro.anoDePublicacao);
    }

    void atualizarAno(int novoAno){
        anoDePublicacao = novoAno;
    }
}
