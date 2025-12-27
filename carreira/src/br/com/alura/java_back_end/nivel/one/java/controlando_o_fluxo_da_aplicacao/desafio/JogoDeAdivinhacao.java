package br.com.alura.java_back_end.nivel.one.java.controlando_o_fluxo_da_aplicacao.desafio;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String continuar = "S";
        int jogada = 0;

        Random aleatorio = new Random();

        while (!continuar.equals("N")) {

            int number = aleatorio.nextInt(100) + 1;

            for (int i = 1; i <= 5; i++) {
                if (i == 1) {
                    System.out.println("""
                        Você tem 5 chances para acertar o número.
                        O número está entre 1 e 100.
                        Boa sorte!
                        """);
                }

                System.out.println("Digite um número, " + i + "° chance: ");
                jogada = sc.nextInt();

                if (jogada < number) {
                    System.out.println("Seu palpite é menor que o número secreto.");
                } else if (jogada > number) {
                    System.out.println("Seu palpite é maior que o número secreto.");
                } else {
                    System.out.println("Parabéns você acertou!\n" +
                            "Seu palpite: " + jogada + "\n" +
                            "Número Secreto: " + number);
                    break;
                }

                if (i == 5) {
                    System.out.println("Infelizmente você não conseguiu descobrir o número secreto.\n!!!");
                }
            }
            System.out.println("Deseja continuar? (S/N)");
            continuar = sc.next().trim().toUpperCase();
        }

        sc.close();
    }
}
