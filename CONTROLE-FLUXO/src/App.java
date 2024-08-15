public class App {
    public static void main(String[] args) throws Exception {
        int numero = 1; for (int x=1; x<2; x++){ numero = numero + x; } System.out.println("O valor de número é: " + numero);
        int num = 5, count = 1; do { num += count; System.out.println(num); } while (count <= 3);
        for(int x=1;x<=10;x++){ if(x % 2==0) System.out.println(x);}
        boolean condicao = false; while(condicao){ System.out.println("executou ... ");}
        String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"}; System.out.print(nomes.length);
        
    }
}
