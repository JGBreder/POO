package Questao1;
import java.util.List;

public class Carro {
        private String modelo;
        private String cor;
        private int ano;

        public Carro(String modelo, String cor, int ano) {
            this.modelo = modelo;
            this.cor = cor;
            this.ano = ano;
        }
        public void dirigir(){
            System.out.println(this.modelo + "| Cor: " + this.cor + " | Ano: " + this.ano);
        }
        public String toString(){
            return this.modelo + "| Cor: " + this.cor + " | Ano: " + this.ano;
        }
    }
