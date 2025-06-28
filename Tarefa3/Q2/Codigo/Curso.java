package Questao2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private List<Instrutor> instrutores;

    public Curso(String nome, String nivel, String deescricao, int cargaHoraria, Instrutor instrutorInicial) {
        this.nome = nome;
        this.nivel = nivel;
        this.descricao = deescricao;
        this.cargaHoraria = cargaHoraria;
        this.instrutores = new ArrayList<>();
        this.instrutores.add(instrutorInicial);

    }
    public void mostrarCurso(){
        System.out.println("Caracteristicas do Curso: ");
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Descricao: " + descricao);
        System.out.println("Carga Horaria: " + cargaHoraria);
        System.out.println("\n");
        System.out.println("Instrutor(es): ");
        System.out.println(instrutores.toString());

    }
}
