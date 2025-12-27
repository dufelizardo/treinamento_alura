package br.com.alura.java_back_end.controle_bancario;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ControleBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        DADOS INICIAIS DO CLIENTE
        String nome = "Edu Felizardo";
        String tipoConta = "Corrente";
        Double saldoInicial = 15873.45;
        int operacao = 0;
        String saldo = "";

        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale( "pt", "BR" ));
        formatador.setMaximumFractionDigits(2);
        formatador.setMinimumFractionDigits(2);

        System.out.println("****************************");
        System.out.println("Nome do Conta:" + nome);
        System.out.println("Tipo de Conta:" + tipoConta);
        System.out.println("Saldo do Conta: R$ " + formatador.format(saldoInicial));
        System.out.println("****************************");

//      Inicialização do sistema
        System.out.println("""
                Operações:
                1 - Consultar saldo
                2 - Operação de Transferência
                3 - Operação de Depósito
                4 - sair
                Digite a operação desejada:
                """);
        operacao = sc.nextInt();

        while (operacao != 4) {

//            Menu
            switch (operacao) {
                case 1:
                    saldo = formatador.format(saldoInicial);
                    System.out.println("Saldo disponível: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser transferido: ");
                    double valor = sc.nextDouble();

                    if (valor <= saldoInicial) {
                        saldoInicial -= valor;
                        saldo = formatador.format(saldoInicial);
                        System.out.println("Transferencia realizada com sucesso!");
                        System.out.println("Saldo atual: " + saldo);
                    } else  {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 3:
                    saldo = formatador.format(saldoInicial);
                    System.out.println("Saldo atual: " + saldo);
                    System.out.println("Digite o valor a ser Depositado: ");
                    double valorDepositado = sc.nextDouble();
                    if (valorDepositado <= 0) {
                        System.out.println("Não é permitido valor R$ 0.00 ou negativo!");
                    } else  {
                        saldoInicial += valorDepositado;
                        saldo = formatador.format(saldoInicial);
                        System.out.println("Deposito realizado com sucesso!");
                        System.out.println("Saldo atual: " + saldo);
                    }
            }
            System.out.println("Digite a próxima opção: ");
            operacao = sc.nextInt();
        }
        System.out.println("Finalizado o acesso com sucesso!");
        sc.close();
    }
}
