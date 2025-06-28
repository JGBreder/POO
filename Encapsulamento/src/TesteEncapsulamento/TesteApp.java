package TesteEncapsulamento;

public class TesteApp {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Zico");
        System.out.println("Nome do cliente: " + cliente1.getNome());

        cliente1.setNome("Galinho");
        System.out.println("Nome do cliente: " + cliente1.getNome());

    }
}
