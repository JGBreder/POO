package Questao4;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nome;
    private String areaAtuacao;
    private List<Consulta> consultas;

    public Medico(String nome){
        this.nome = nome;
        this.areaAtuacao = areaAtuacao;
        this.consultas = new ArrayList<>();
    }
    public void adicionarConsulta(Consulta consulta){
        consultas.add(consulta);
    }
    public String getNome(){
        return nome;
    }
    public String getAreaAtuacao(){
        return areaAtuacao;
    }
    public List<Consulta> getConsultas(){
        return consultas;
    }
    public String toString(){
        return nome + " Área: " + areaAtuacao;
    }
}
