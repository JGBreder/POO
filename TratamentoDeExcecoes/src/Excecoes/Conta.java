package Excecoes;

public class Conta {
    private double saldo;
    private double limite;

    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (valor >= saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");

        }else{
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return limite;
    }
}
