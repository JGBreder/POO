package Questao1;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(" João " , " ab " , 19);
        Carro carro1 = new Carro(" Ford Mustang " , "Preto", 2015);
        Carro carro2 = new Carro(" Porsche " , " Azul ", 2019);

        p1.usarCarro(carro1);
        p1.usarCarro(carro2);
        System.out.println("\n");

        p1.adicionarCarro(carro1);
        p1.adicionarCarro(carro2);
        System.out.println("\n");

        System.out.println("Registro de carros usados: ");
        p1.registroVeiculo(carro1);
        p1.registroVeiculo(carro2);
    }
}
