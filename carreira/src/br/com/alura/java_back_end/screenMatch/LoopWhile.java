package br.com.alura.java_back_end.screenMatch;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double avaliacaoMedia = 0;
        double avaliacaoTotal = 0;
        double avaliacao = 0;
        int contador = 0;

//        avaliacaoMedia = avaliacaoTotal / 3;
        while (avaliacao != -1){
            System.out.println("Digite sua avaliação para o filme: ");
            avaliacao = sc.nextDouble();
            if(avaliacao != -1){
                avaliacaoTotal += avaliacao;
                contador++;
            }
        }

        avaliacaoMedia = avaliacaoTotal / contador;

        System.out.println("Média de avaliação: " + avaliacaoMedia );
        sc.close();
    }
}
