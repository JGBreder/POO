package Q1;

public class Circulo {
    private int x;
    private int y;
    private int raio;

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    void mostrarArea() {
        float area = (float) (3.14*(raio*raio));
        System.out.println("Area: " + area);

    }
}
