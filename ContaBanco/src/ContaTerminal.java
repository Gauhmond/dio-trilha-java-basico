import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println();
        System.out.println("Seja Bem vindo!");

        System.out.println("Digite sua agencia: ");
        String agencia = sc.next();

        System.out.println("Digite sua conta: ");
        int conta = sc.nextInt();

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

    System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" +  saldo + "já está disponivel para saque");
    }
}
