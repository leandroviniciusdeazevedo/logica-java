package estruturarepeticao.para;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SintaxePara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        /*int n = scanner.nextInt();
        while (n > 0){
            int x = scanner.nextInt();
            soma += x;
            n -= 1;
        }
        System.out.println(soma);
        */
        System.out.println("Quantos numeros quer somar?");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Digite o "+i+"° numero:");
            int x = scanner.nextInt();
            soma += x;
        }
        if (n > 0){
            System.out.println("A soma dos "+n+" numeros digitados: "+soma);
        }
        scanner.close();
    }
}
