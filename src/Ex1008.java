import java.util.Locale;
import java.util.Scanner;

/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário. A seguir,
mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número,
quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido,
com um espaço em branco antes e depois da igualdade.
No caso do salário, também deve haver um espaço em branco após o $.

Exemplos de Entrada	Exemplos de Saída
25                  NUMBER = 25
100                 SALARY = U$ 550.00
5.50

1                   NUMBER = 1
200                 SALARY = U$ 4100.00
20.50

6                   NUMBER = 6
145                 SALARY = U$ 2254.75
15.55
 */
public class Ex1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int numeroDoFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double salarioPorHora = scanner.nextDouble();
        double salario = horasTrabalhadas * salarioPorHora;

        System.out.println("NUMBER = "+numeroDoFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);

    }
}
