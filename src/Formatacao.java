public class Formatacao {

    public static void main(String[] args){

        double x = 12.345678;

        System.out.print(x); //imprime sem quebrar linha
        System.out.println(x); //imprime e insere quebra de linha
        
        System.out.printf("%.2f%n" , x); //imprime com 2 casas decimais
        System.out.printf("%.4f%n" , x); //imprime com 4 casas decimais
    }
}
