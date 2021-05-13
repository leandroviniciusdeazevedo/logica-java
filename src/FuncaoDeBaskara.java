import java.util.Scanner;

public class FuncaoDeBaskara {
    public static void main(String[] args) {
        System.out.println("Para encontrar as raizes da equacao ax² + bx + c = 0, digite:");
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        double a = sc.nextDouble();
        System.out.println("b");
        double b = sc.nextDouble();
        System.out.println("c");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2.0) - 4*a*c;

        double x1 = (-b + Math.sqrt(delta))/(2.0*a);
        double x2 = (-b - Math.sqrt(delta))/(2.0*a);

        System.out.println("As raizes da equacao "+a+"x² + "+b+"x +"+c+" sao "+x1+" e "+x2);
        sc.close();
    }
}
