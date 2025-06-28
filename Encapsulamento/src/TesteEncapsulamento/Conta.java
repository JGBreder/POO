package TesteEncapsulamento;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;


    public Conta(int numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso");
            return true;
        }else{
            System.out.println("Saque não efetuado");
            return false;
        }
    }
}
