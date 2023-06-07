import java.util.Locale;
import java.util.Scanner;

public class VerificaDigito {
    public static void main (String [] args) {
        int N;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite um número:");
        
        N = sc.nextInt();

        if (N % 2 == 0)
            System.out.println("Este número é par!");
        else
            System.out.println("Este número é impar!");

    } 
}
