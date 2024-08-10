public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("TV Volume Atual.: " + smartTv.volume);

        smartTv.mudarCanal(13);


        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("TV Canal Atual.: " + smartTv.canal);
        System.out.println("TV Volume Atual.: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - TV Ligada ? " + smartTv.ligada);
    }
}
