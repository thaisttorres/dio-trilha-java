public class Usuario {
    public static void main(String[] args) throws Exception {


        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal (13);

        System.out.println("Volume atual: " +smartTv.volume);



        System.out.println("Tv Ligada? " +smartTv.ligada);
        System.out.println("Está no canal: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " +smartTv.ligada);

    }
}
