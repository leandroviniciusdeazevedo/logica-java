import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String variavelSemEspaco = sc.next();
        System.out.println(variavelSemEspaco);

        double valorComVirgula = sc.nextDouble();
        System.out.println(valorComVirgula);

        int valorInteiroSemVirgula = sc.nextInt();
        System.out.println(valorInteiroSemVirgula);

        char variavelQueRecebeSomenteUmCaracter = sc.next().charAt(0);
        System.out.println(variavelQueRecebeSomenteUmCaracter);

        String x, s1, s2, s3;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        s1 = sc.nextLine();//falha
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.printf("x %s y %d z %.1f s1 %s s2 %s s3 %s %n", x, y, z, s1, s2, s3);

        int i;
        String s4, s5, s6;

        i = sc.nextInt();
        sc.nextLine();//sem ele aqui ocorre falha
        s4 = sc.nextLine();
        s5 = sc.nextLine();
        s6 = sc.nextLine();

        System.out.println("i " +i);
        System.out.println("s4 " +s4);
        System.out.println("s5 " +s5);
        System.out.println("s6 " +s6);
        sc.close();

    }
}
