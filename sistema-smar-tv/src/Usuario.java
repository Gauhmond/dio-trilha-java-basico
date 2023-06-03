public class Usuario {
    public static void main (String [] args){
        SmartTv smartTv = new SmartTv();
        System.out.println("Estado da TV: "+ smartTv.ligada);
        System.out.println("Canal: "+ smartTv.canal);
        System.out.println("Volume: "+ smartTv.volume);

        smartTv.ligarTv();
        System.out.println("Estado da TV: "+ smartTv.ligada);

        smartTv.desligarTv();
        System.out.println("Estado de TV: "+ smartTv.ligada);

        smartTv.ligarTv();
        System.out.println("Estado da TV: "+ smartTv.ligada);

        smartTv.escolherCanal(13);
        System.out.println("Estado de TV: " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Canal: "+ smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
    }
}