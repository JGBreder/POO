public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public void mostrarInfo(Pessoa pessoa){
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Altura: " + pessoa.altura);

    }

    public void alterarIdade(int novaIdade){
        idade = novaIdade;
    }

    public void calcularImc(double peso, double altura){
        double imc = peso/(altura*altura);
        System.out.println("IMC: " + imc);

    }
}


