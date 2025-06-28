public class CadastroUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João", "joao@example.com");
        usuario.cadastrar();

        Usuario usuario2 = new Usuario("Pedro", "pedro@example.com");
        usuario2.cadastrar();

        usuario2.alterar("pedro@example.com");
        usuario2.cadastrar();
    }
}