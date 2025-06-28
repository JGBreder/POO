public class Celular {
    String marca;
    String modelo;
    int nivelBateria;

    void exibirInformacoes(Celular celular){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Nivel Bateria: " + nivelBateria);
    }

    void carregarBateria(int bateria){
        if (bateria < 100){
            nivelBateria = 100;
        }else{
            System.out.println("Bateria cheia");
        }
    }
}
