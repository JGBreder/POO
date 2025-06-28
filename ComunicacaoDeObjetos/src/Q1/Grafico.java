package Q1;

public class Grafico {

    public boolean preenchido;
    public char caractere;


    public Grafico(boolean preenchido, char caractere) {
        this.preenchido = preenchido;
        this.caractere = caractere;
    }


    void plota(int valor) {
        for (int i = 1; i < valor; i++) {
            if (preenchido) {
                System.out.print(caractere);
            } else {
                System.out.print(' ');
            }
            System.out.print((preenchido) ? caractere : ' ');
        }
        System.out.println(caractere);
    }
}
