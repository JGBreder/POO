package Questao4;

import java.util.ArrayList;
import java.util.List;

public class ProntoSocorro {
    private String nome;
    private List<Medico> medicos;

    public ProntoSocorro(String nome){
        this.nome = nome;
        this.medicos = new ArrayList<>();
    }
    public void adicionarMedico(Medico medico){
        medicos.add(medico);
    }
    public String getNome(){
        return nome;
    }
    public String toString(){
        return nome;
    }
}
