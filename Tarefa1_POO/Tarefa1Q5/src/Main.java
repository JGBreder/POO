//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int numero, resultado, limite=101;

        for(numero=0; numero<limite; numero++) {
            resultado = numero%3;

            if(resultado==0){
                System.out.println(numero);
            }
        }

    }
}