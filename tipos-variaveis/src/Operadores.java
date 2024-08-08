public class Operadores {
    public static void main(String[] args) {
        
       int a, b;

       a = 5;
       b = 6;

       String resultado = "";
       
       if(a==b){
        resultado = "verdadeiro";
       }else{
        resultado = "falso";
       }

       System.out.println(resultado);

       System.out.println("Operador ternário");
       a = 6;

       String resultado2 = a==b ? "verdadeiro" : "falso";

       System.out.println(resultado2);
       

    }
}
