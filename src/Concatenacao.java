import java.util.Locale;
import java.util.Scanner;

public class Concatenacao {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.printf("Seu nome  é %s, você tem %d anos e %.2f de altura.", nome, idade, altura);

        scanner.close();

    }
}
