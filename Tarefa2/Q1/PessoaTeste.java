public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Joao";
        p1.idade = 25;
        p1.altura = 1.75;

        p1.mostrarInfo(p1);
        p1.calcularImc(70, 1.75);
        System.out.println("====================");
        p1.alterarIdade(26);
        p1.mostrarInfo(p1);
        p1.calcularImc(70, 1.75);
    }
}
