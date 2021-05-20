import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler as medidas da base e altura de um retângulo.
Em seguida,  mostrar o valor da área, perímetro e diagonal deste retângulo,
com quatro casas  decimais, conforme exemplo.

Exemplo:
 Entrada:       Saída:
5.0             AREA = 20.0000
4.0             PERIMETRO = 18.0000
                DIAGONAL = 6.4031
 */
public class CalculaRetangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo da Área do Retângulo");
        System.out.println("Seja bem vindo(a)!");
        System.out.println("Digite uma unidade de medida (Ex.: m, cm, ...):");
        String u = scanner.nextLine();
        System.out.println("Digite a medida da base do retângulo em "+u+":");
        double b = scanner.nextDouble();
        System.out.println("Digite a medida da altura do retângulo em "+u+":");
        double h = scanner.nextDouble();

        //area
        double a = b * h;

        //perimetro
        double p = 2 * b + 2 * h;

        //diagonal
        double d = Math.sqrt(b * b + h * h);

        System.out.printf("AREA = %.4f %s²%n", a, u);
        System.out.printf("PERIMETRO = %.4f %s%n", p, u);
        System.out.printf("DIAGONAL = %.4f %s%n", d, u);
        scanner.close();
    }
}
