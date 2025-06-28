package Questao4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Hospital Regional");

        ProntoSocorro prontoSocorro = new ProntoSocorro("Pronto Socorro");

        hospital.adicionarUnidade(prontoSocorro);

        Medico medico1 = new Medico("Dr. Estranho");

        prontoSocorro.adicionarMedico(medico1);

        Paciente paciente1 = new Paciente("Peter Parker", "165.753.526-65");

        hospital.adicionarPaciente(paciente1);

        Consulta consulta1 = new Consulta(LocalDate.of(2020, 07, 12), "Urgência", paciente1, medico1);

        medico1.adicionarConsulta(consulta1);

        System.out.println("\nRelatório da consulta:");
        consulta1.getRelatorio();
    }
}
