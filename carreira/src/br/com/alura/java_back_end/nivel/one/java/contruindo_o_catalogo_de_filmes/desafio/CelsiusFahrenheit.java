package br.com.alura.java_back_end.nivel.one.java.contruindo_o_catalogo_de_filmes.desafio;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        double temperatura = 25.5;
        double temperaturaFahrenheit;

        temperaturaFahrenheit = (temperatura * 9 / 5) + 32;
//        temperaturaFahrenheit = (temperatura * 1.8 + 32);
        System.out.println("Temperatura: " + temperaturaFahrenheit  );
        System.out.println("Temperatura: " + (int) temperaturaFahrenheit);
    }
}
