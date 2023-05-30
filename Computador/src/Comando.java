public class Comando {
    boolean ligado = false;
    String programa = "Nenhum";

    public void ligarCPU(){
        ligado = true;
        System.out.println("Ligando Computador!");
        System.out.println(".");
        System.out.println("..");
        System.out.println("...");
    }
    public void escolherPrograma(String novoPrograma){
        programa = novoPrograma;
    }
    
    
}
