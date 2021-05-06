/*
Suponha um programa que solicita ao usuario dois numeros e depois
mostra a media aritmetica deles

    Ex:
        *** ENTRADA DE DADOS ***
        Digite o primeiro numero: 3
        Digite o segundo numero: 6

        *** PROCESSAMENTO ***
        MEDIA = (3 + 6) / 2

        *** SAIDA DE DADOS ***
        Media aritmetica: 4.5

 */


public class CalculaMediaAritmetica {//classe - dentro dos {} vai seu conteudo

    public static void main(String[] args){//metodo - dentro dos {} vai seu conteudo

        // *** ENTRADA DE DADOS ***
        System.out.println("Digite o primeiro valor");//metodo
        double primeiroNumero = 30;//declaracao de variavel tipo double

        System.out.println("Digite o segundo valor");//metodo
        double segundoNumero = 6;

        // *** PROCESSAMENTO ***
        double resultado = (primeiroNumero + segundoNumero) / 2;

        // *** SAIDA DE DADOS ***
        System.out.println("O resultado e " + resultado);//metodo

    }
}
