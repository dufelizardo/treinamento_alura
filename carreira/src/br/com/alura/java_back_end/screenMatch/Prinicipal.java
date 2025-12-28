package br.com.alura.java_back_end.screenMatch;

public class Prinicipal {
    public static void main(String[] args) {
        Filme filme = new Filme();    // Tipo referencia

        filme.nome = "Alura";
        filme.anoDeLancamento = 2015;
        filme.descricao = "Plataforma de estudos de TI.";
        filme.duracaoEmMinutos = 180;

        filme.exibirFichaTecnica();
        filme.avaliar(8);
        filme.avaliar(10);
        filme.avaliar(9.5);
        System.out.println(filme.somaDasAvaliacao);
        System.out.println(filme.totalDeAvaliacao);
    }
}
