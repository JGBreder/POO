public class Usuario {
    private String nome;
    private String email;


    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void cadastrar() {
        System.out.println("Cadastrando usuário: " + nome);
        System.out.println("Email: " + email);
    }

    String alterar(String email) {
        this.email = email = "pedro@gmail.com";
        return email;
    }

}
