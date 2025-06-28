public class mainCelular {
    public static void main(String[] args) {
        Celular cel1 = new Celular();
        cel1.marca = "Motorola";
        cel1.modelo = "One";
        cel1.nivelBateria = 50;

        Celular cel2 = new Celular();
        cel2.marca = "Samsung";
        cel2.modelo = "s23";
        cel2.nivelBateria = 100;

        cel1.exibirInformacoes(cel1);
        System.out.println("---------------------");
        cel2.exibirInformacoes(cel2);
        System.out.println("=======================");
        cel1.carregarBateria(50);
        cel1.exibirInformacoes(cel1);
        System.out.println("---------------------");
        cel2.exibirInformacoes(cel2);
    }
}
