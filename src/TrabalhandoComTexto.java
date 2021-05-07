import java.util.Scanner;

public class TrabalhandoComTexto {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        // PROCESSAMENTO
        double imc = peso/altura/altura;
        String valoresConcatenados = nome+", voce tem "+idade+" anos de idade, "+altura+" m de altura e pesa "+peso+" kg.";

        // SAIDA DE DADOS
        System.out.println(valoresConcatenados);//concatenacao feita anteriormente em variavel
        System.out.println("Seu IMC: "+imc);//concatenacao feita aqui
        scanner.close();
    }

}
