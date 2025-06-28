package Questao3;

public class PlacaMae {
    private String fabricante;
    private String chipset;
    private int qtdSlot;
    private String tipoMemoria;

    public PlacaMae(String facbricante, String chipset, int qtdSlot, String tipoMemoria) {
        this.fabricante = facbricante;
        this.chipset = chipset;
        this.qtdSlot = qtdSlot;
        this.tipoMemoria = tipoMemoria;
    }

    public void exibir(){
        System.out.println("===========================");
        System.out.println(" DETALHES DA PLACA MAE ");
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Chipset: " + this.chipset);
        System.out.println("Quantidade de slots: " + this.qtdSlot);
        System.out.println("Memoria: " + this.tipoMemoria + "\n");
    }
}
