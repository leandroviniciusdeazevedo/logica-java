import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImc2 {

    public static void main(String[] args) {
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

        // SAIDA DE DADOS
        System.out.printf("%s, seu IMC é %.2f%n" , nome, imc);
        if(imc < 18.5){
            System.out.println("Class: Abaixo do peso");
        }else if (imc >= 18.5 && imc < 25){
            System.out.println("Class: Peso Normal");
        }else if (imc >= 25 && imc < 30) {
            System.out.println("Class: Sobrepeso");
        }else if (imc >= 30 && imc < 35) {
            System.out.println("Class: Obesidade grau I");
        }else if (imc >= 35 && imc < 40) {
            System.out.println("Class: Obesidade grau II");
        }else {
            System.out.println("Class: Obesidade morbida");
        }
        scanner.close();


    }

}
