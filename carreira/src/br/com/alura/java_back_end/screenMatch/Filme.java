package br.com.alura.java_back_end.screenMatch;

public class Filme {
    public int duracaoEmMinutos;
    public String nome;
    public int anoDeLancamento;
    public String descricao;
    public boolean incluidoNoBlano;
    public double somaDasAvaliacao;
    public int totalDeAvaliacao;

    void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Duracao em minutos: " + duracaoEmMinutos);
    }
    void avaliar(double nota) {
        somaDasAvaliacao += nota;
        totalDeAvaliacao ++;
    }

}
