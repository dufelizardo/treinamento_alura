package br.com.alura.java_back_end.screenMatch;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu filme preferido: ");
        String filme = sc.nextLine();

        System.out.println("Qual o ano de lancamento? ");
        int anoLancamento = sc.nextInt();

        System.out.println("Digite sua avaliação para o filme: ");
        double notaDoFilme = sc.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(notaDoFilme);
        sc.close();
    }
}
