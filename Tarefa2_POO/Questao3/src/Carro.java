public class Carro {
    String marca;
    String modelo;
    int anoFabricacao;

    public void mostrarInfo(Carro carro) {
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano Fabricacao: " + carro.anoFabricacao);
    }

    void atualizarAno(int novoAno){
        anoFabricacao = novoAno;
    }
}
