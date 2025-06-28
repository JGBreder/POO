public class mainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Uno";
        carro1.marca = "Fiat";
        carro1.anoFabricacao = 2006;

        Carro carro2 = new Carro();
        carro2.modelo = "Fusca";
        carro2.marca = "Volkswagen";
        carro2.anoFabricacao = 1994;

        carro1.mostrarInfo(carro1);
        System.out.println("------------------------");
        carro2.mostrarInfo(carro2);
        carro1.atualizarAno(2010);
        System.out.println("##########################");
        carro1.mostrarInfo(carro1);
        System.out.println("------------------------");
        carro2.mostrarInfo(carro2);
    }
}
