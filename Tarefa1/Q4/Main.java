public class Main {
    public static void main(String[] args) {

        int idade = 18;

        if (idade < 16) {
            System.out.println("Você não pode votar ainda");

        }else if (idade >= 16 && idade < 18) {
            System.out.println("Você já pode votar");

        }else if (idade >= 18) {
            System.out.println("Você deve votar, obrigatoriamente");

        }else{
            System.out.println("Erro");
        }
    }
}