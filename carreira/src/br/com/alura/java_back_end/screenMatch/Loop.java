package br.com.alura.java_back_end.screenMatch;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double avaliacaoMedia = 0;
        double avaliacaoTotal = 0;
        double avaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme: ");
            avaliacao = sc.nextDouble();
            avaliacaoTotal += avaliacao;
        }
        avaliacaoMedia = avaliacaoTotal / 3;

        System.out.println("Média de avaliação: " + avaliacaoMedia );
        sc.close();
    }
}
