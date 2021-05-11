import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImc {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        // PROCESSAMENTO
        double imc = peso/altura/altura;
        String valoresConcatenados = nome+", seu IMC é ";

        // SAIDA DE DADOS
        System.out.print(valoresConcatenados);//concatenacao feita anteriormente em variavel
        System.out.printf("%.2f%n" , imc);
        scanner.close();
    }

}
