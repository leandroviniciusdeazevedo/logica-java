public class CalculaAreaTrapezio {
    public static void main(String[] args) {

        double area;
        int b, h, B;
        h = 5;
        b = 7;
        B = 8;

        area = (b + B) / 2 * h;

        System.out.println(area);

        double area1, b1, h1, B1;
        h1 = 5;
        b1 = 7;
        B1 = 8;

        area1 = (int) (b1 + B1) / 2 * h1;

        System.out.println(area1);

        float area2, b2, h2, B2;
        h2 = 5f;
        b2 = 7f;
        B2 = 8f;

        area2 = (b2 + B2) / 2f * h2;

        System.out.println(area2);
    }
}