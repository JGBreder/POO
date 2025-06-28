package Questao3;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador("Acer", "Nitro V 15", "I5", 16,
                new PlacaMae("Gigabyte", "Z390", 4, "DDR5"));
        pc.exibir();

        pc.atualizarComp("Dell", "G15", "I7", 16,
                new PlacaMae(" Asus ", " X570 ", 3, "DDR5"));
        pc.exibir();
    }
}
