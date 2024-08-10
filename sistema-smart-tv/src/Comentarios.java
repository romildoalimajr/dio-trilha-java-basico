public class Comentarios {

    public static void main(String[] args) {
        //Olá, eu sou um comentário em um única linha

        /* Olá,
         * Eu sou um comentário
         * que posso ser mais detalho
         * quano necessário.
         */
    }

    /**
     * Estas duas estrelinhas acima
     * é para identiicar que você
     * pretende elaborar um comentário
     * a nivel de documentação.
     * Que incrível !!!
     */

     public void metodo(){

     }
     /*
      * Este método foi elabora as pressas
      * por isso eu abaareviei o nome das variáveis
      * mas olha, ele tem a finalidade de somar ou multiplicar
      */
     public int somaMultiplica(int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if(m == "M"){ // M = multiplicação
            r = n * x;
        }else{
            r = n + x; // se não soma mesmo
        }

        return r;
     }
    
}
