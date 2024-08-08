public class Operadores {
    public static void main(String[] args) {

        String nomeUm = "ROMILDO";
        String nomeDois = new String("ROMILDO");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numeroUm é maior a numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é menor a numeroDois? " + simNao);


    }
}

