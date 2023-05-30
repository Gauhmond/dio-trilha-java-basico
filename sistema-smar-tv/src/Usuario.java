public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV está ligada? " + smartTV.ligada);
        System.out.println("Volume: " + smartTV.volume);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("------------------------");
    
        smartTV.ligar();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.selecionarCanal(15);

        System.out.println("TV está ligada? " + smartTV.ligada);
        System.out.println("Volume Atual: " + smartTV.volume);
        System.out.println("Canal Atual: " + smartTV.canal);
    }
}
