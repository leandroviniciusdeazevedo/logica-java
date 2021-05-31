import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora atual (hh mm):");
        int hora = scanner.nextInt();
        scanner.nextInt();

        if (hora < 12 && hora >= 6) {
            System.out.println("Bom dia");
        } else if (hora >= 12 && hora <= 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
        scanner.close();
    }
}
