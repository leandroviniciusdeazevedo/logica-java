package estruturarepeticao.para;

import java.util.Scanner;

public class Ex1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x >= 1 && x <= 1000){
            for (int i = 1; i <= x; i += 2){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
