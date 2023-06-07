import java.util.Scanner;

public class VerificarLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        if (Character.isLetter(letra)) {
            letra = Character.toLowerCase(letra); // Converte para minúscula para facilitar a comparação

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("A letra digitada é uma vogal.");
            } else {
                System.out.println("A letra digitada é uma consoante.");
            }
        } else {
            System.out.println("O caractere digitado não é uma letra.");
        }

        scanner.close();
    }
}
