public class OperadoresComparacao {
    public static void main(String[] args) {
        // MENOR QUE
        boolean menorQue = 5 < 10;
        System.out.println("5 é menor que 10 -> "+ menorQue);
        // MAIOR QUE
        boolean maiorQue = 5 > 10;
        System.out.println("5 é maior que 10 -> "+ maiorQue);
        // MENOR OU IGUAL
        boolean menorOuIgual = 10 <= 10;
        System.out.println("10 é menor ou igual a 10 -> "+ menorOuIgual);
        // MAIOR OU IGUAL
        boolean maiorOuIgual = 5 >= 10;
        System.out.println("5 é maior ou igual a 10 -> "+maiorOuIgual);
        // IGUALDADE
        boolean igual = 5 == 10;
        System.out.println("5 é igual a 10 -> "+igual);
        // DIFERENTE
        boolean diferente = 5 != 10;
        System.out.println("5 é diferente de 10 -> "+diferente);

        System.out.println("---------------------------------------------------");

        int x = 5;
        boolean a = x > 0; //true
        System.out.println(x+" é maior que 0 -> "+a);
        boolean b = x == 3; //false
        System.out.println(x+" é igual a 3 -> "+b);
        boolean c = 10 <= 30; //true
        System.out.println("10 é menor ou igual a 30 -> "+c);
        boolean d = x != 2; //true
        System.out.println(x+" é diferente de 2 -> "+d);

        System.out.println("-----------OPERADORES LOGICOS--------------");
        System.out.println("-----------   AND (E)  &&    --------------");

        boolean e = x <= 20 && x == 10; //false
        System.out.println(x+" é menor ou igual a 20 e igual a 10 -> "+e);

        boolean f = x > 0 && x != 3; //true
        System.out.println(x+" é maior que 0 e diferente de 3 -> "+f);

        boolean g = x <= 20 && x == 10 && x != 3; //false
        System.out.println(x+" é menor ou igual a 20 e igual a 10 e diferente de 3 -> "+g);

        System.out.println("-----------OPERADORES LOGICOS--------------");
        System.out.println("-----------   OR (OU)  ||    --------------");

        boolean h = x <= 20 || x == 10; //true
        System.out.println(x+" é menor ou igual a 20 ou igual a 10 -> "+h);

        boolean i = x > 0 || x != 3; //true
        System.out.println(x+" é maior que 0 e diferente de 3 -> "+i);

        boolean j = x <= 20 || x == 10 || x != 3; //true
        System.out.println(x+" é menor ou igual a 20 e igual a 10 e diferente de 3 -> "+j);

        System.out.println("-----------OPERADORES LOGICOS--------------");
        System.out.println("-----------   NOT (NÃO)  !   --------------");

        boolean k = !(x == 10); //true
        System.out.println(x+" não é igual a 10 -> "+k);

        boolean l = !(x >= 2); //false
        System.out.println(x+" não é maior ou igual a 2 -> "+l);

        boolean m = !(x <= 20 && x == 10); //true
        System.out.println(x+" não é menor ou igual a 20 e igual a 10 -> "+m);

    }
}
