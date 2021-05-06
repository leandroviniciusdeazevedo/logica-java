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


public class CalculaMediaAritmetica {

    public static void main(String[] args){

        // *** ENTRADA DE DADOS ***
        double primeiroNumero = 30;
        double segundoNumero = 6;

        // *** PROCESSAMENTO ***
        double resultado = (primeiroNumero + segundoNumero) / 2;

        // *** SAIDA DE DADOS ***
        System.out.println("O resultado e " + resultado);

    }
}
