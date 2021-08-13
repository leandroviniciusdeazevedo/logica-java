package br.com.logica.orientacaoobjeto.vetores;

import java.util.Locale;
import java.util.Scanner;

/*
       Faça um programa que leia N números reais e armazene-os em um vetor.
       Em seguida:
       - Imprimir todos os elementos do vetor
       - Mostrar na tela a soma e a média dos elementos do vetor

       Entrada             |       Saída
       4                           8.0 4.0 10.0 14.0
       8.0 4.0 10.0 14.0           36.00
                                   9.00
        */
public class Ex03VetorNumeros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double vetor[] = new double[n];
        for (int i = 0; i < n; i++){
            vetor[i] = sc.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < n; i++){
            System.out.print(vetor[i]+" ");
            soma += vetor[i];
        }
        double media = soma/n;
        System.out.println();
        System.out.printf("%.2f%n",soma);
        System.out.printf("%.2f%n",media);
        sc.close();
    }

}
