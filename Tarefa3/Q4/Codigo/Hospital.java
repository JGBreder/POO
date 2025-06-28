package Questao4;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private List<ProntoSocorro> unidades;
    private List<Paciente> pacientes;

    public Hospital(String nome){
        this.nome = nome;
        this.unidades = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void adicionarUnidade(ProntoSocorro unidade){
        unidades.add(unidade);
    }
    public void adicionarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
}
