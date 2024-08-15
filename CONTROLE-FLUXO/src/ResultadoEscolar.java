public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 10;

        if(nota >= 7){
            System.out.println("\nAprovado");
        }else if(nota >= 5 && nota < 7){
            System.out.println("\nProva de Recuperação");
        }
        else{
            
            System.out.println("\nReprovado");
        }
    }    
}
