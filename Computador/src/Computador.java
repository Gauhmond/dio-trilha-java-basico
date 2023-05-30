public class Computador {
    public static void main(String[] args) {
    Comando comando = new Comando();
    System.out.println("Estado do Computador: " + comando.ligado);
    System.out.println("Programa aberto: " + comando.programa);
    System.out.println("----------------------");

    comando.ligarCPU();
    System.out.println("Estado do Computador: " + comando.ligado);
    comando.escolherPrograma("Chrome");
    System.out.println("Programa aberto: " + comando.programa);
    }
}
