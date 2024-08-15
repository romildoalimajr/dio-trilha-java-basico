import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int quantDoce = 0;

        while(mesada > 0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Valor do Doce.: " + valorDoce  + " Adicionado no carrinho " );
            mesada = mesada - valorDoce;
            quantDoce ++;    
        }
        System.out.println("Mesada.: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada com " + quantDoce + " doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
