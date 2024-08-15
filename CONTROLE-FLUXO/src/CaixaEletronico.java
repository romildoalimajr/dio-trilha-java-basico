public class CaixaEletronico {

        public static void main(String[] args) {
            double saldo = 25.0;
            double valorSolicitado = 22.0;

            if(valorSolicitado < saldo){
                saldo = saldo - valorSolicitado;
                System.out.println("\n Novo saldo é R$ " + saldo);
            }else{
                System.out.println("\n Saldo insuficiente!!!!");
            }

            System.out.println("\nO saldo atual é R$ " + saldo);
        }
    
}
