package Excecoes;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(50, 5000);

        try{
            conta.sacar(100);

        }catch(IllegalArgumentException e){
            System.out.println(" Erro ao tentar sacar: " + e.getMessage());
        }

        try{
            conta.sacar(10);

        }catch(IllegalArgumentException e){
            System.out.println(" Saque realizado com sucesso: " + e.getMessage());
        }

        System.out.println("Saldo atual: " + conta.getSaldo());

    }
}