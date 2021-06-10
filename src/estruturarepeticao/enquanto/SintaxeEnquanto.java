package estruturarepeticao.enquanto;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class SintaxeEnquanto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Entre valores inteiros diferentes de 0 para encontrar sua soma.");
        System.out.println("Entre com um valor inteiro:");
        int x = scanner.nextInt();
        int soma = 0;

        while(x != 0){
            soma += x;
            System.out.println("Entre com outro valor inteiro:");
            x = scanner.nextInt();
        }
        System.out.println("Voce digitou 0 e a soma foi encerrada.");
        System.out.println("A soma dos valores digitados e: "+soma);
        scanner.close();
    }
}
