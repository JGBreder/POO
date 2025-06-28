package Questao2;

public class Main {

    public static void main(String[] args) {
        Instrutor instrutor1 = new Instrutor("Fran " , "Física " , "fran.azevedo@unifesspa.edu.br " , 15);
        Curso curso1 = new Curso("Eng. Computação ", "Avançado " , "Matéria de álgebra", 300, instrutor1);

        instrutor1.informacaoInstrutor();
        System.out.println("\n");

        curso1.mostrarCurso();
    }
}
