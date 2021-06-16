package estruturarepeticao.para;

import java.util.Scanner;

public class ExUri1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();//menor -5
        int y = scanner.nextInt();//maior 6
        if (x > y) {
            int a = x;
            x = y;
            y = a;
        }
        int soma = 0;
        for (int i = x + 1; i < y; i ++){
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
        scanner.close();
    }
}
