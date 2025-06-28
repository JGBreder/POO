package Questao3;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRAM;
    private PlacaMae placaMae;

    public Computador(String marca, String modelo, String processador, int memoriaRAM, PlacaMae placaMae) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = placaMae;
    }
    public void exibir(){
        System.out.println(" DETALHES DO COMPUTADOR ");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Processador: " + this.processador);
        System.out.println("Memoria RAM: " + this.memoriaRAM + "GB");
        this.placaMae.exibir();
    }
    public void atualizarComp(String marca, String modelo, String processador, int memoriaRAM, PlacaMae placaMae){
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = placaMae;
        System.out.println("Computador e placa-mãe atualizados com sucesso");
        System.out.println("\n");
    }

}