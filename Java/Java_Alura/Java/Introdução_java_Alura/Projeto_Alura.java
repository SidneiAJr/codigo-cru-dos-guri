import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a Opção:  ");
        int opcao = entrada.nextInt();
        double salario = 0;
        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    salario = sacar(salario, entrada);
                    break;
                case 2:
                    salario = Info(salario, entrada);
                    break;
                case 3:
                    salario = emp(salario, entrada);
                    break;
                case 4:
                    salario = financiamento(salario, entrada);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static double sacar(double salario, Scanner entrada) {
        System.out.println("Bem-vindo ao programa!");
        System.out.println("Por Favor, Informe seu Nome:");
        String nome = entrada.next();  // Usa o mesmo Scanner para entrada
        System.out.println("Por Favor, Informe o Valor da Retirada:");
        double retirada = entrada.nextDouble();
        if (retirada <= salario) {
            salario -= retirada;
            System.out.println("Retirada de R$ " + String.format("%.2f", retirada) + " realizada com sucesso!");
            System.out.println("Seu novo saldo é: R$ " + String.format("%.2f", salario));
        } else {
            System.out.println("Saldo insuficiente para a retirada.");
        }
        return salario;
    }

    public static double Info(double salario, Scanner entrada) {
        System.out.println("Bem-vindo ao programa!");
        System.out.println("Por Favor, Informe seu Nome:");
        String nome = entrada.next();
        System.out.println("Informe Seu Salário:");
        salario = entrada.nextDouble();
        System.out.println("Informe sua idade:");
        double emprestimo = salario * 0.30;
        System.out.println("Temos uma oferta para você de R$ " + String.format("%.2f", emprestimo));
        System.out.println("Olá " + nome + ", bem-vindo!");
        System.out.println("Saldo disponível: R$ " + String.format("%.2f", salario));
        return salario;
    }

    public static double emp(double salario, Scanner entrada) {
        System.out.println("Bem-vindo ao sistema de Empréstimos!");
        System.out.println("Faça Simulação de Empréstimos!");
        System.out.println("Insira o Valor que Gostaria de Retirar R$: ");
        double valor = entrada.nextDouble();
        System.out.println("Quantidade de Parcelas ");
        int parcela = entrada.nextInt();
        double jurosTotais = valor * 0.20;
        double valorTotal = valor + jurosTotais;
        double emprestimototal = valorTotal / parcela;
        System.out.println("Valor Total do Empréstimo será R$ " + String.format("%.2f", valorTotal));
        System.out.println("Valor da Parcela será R$ " + String.format("%.2f", emprestimototal));
        return valorTotal;
    }

    public static double financiamento(double salario, Scanner entrada) {
        System.out.println("Bem-vindo ao sistema de Empréstimos!");
        System.out.println("Faça Simulação de Financiamento!");
        System.out.println("Insira o Valor que Gostaria de Retirar R$: ");
        double valor = entrada.nextDouble();
        System.out.println("Quantidade de Parcelas: ");
        int parcela = entrada.nextInt();
        double jurosTotais = 0;
        double valorTotal = 0;
        double emprestimototal = 0;
        if (valor >= 1000000) {
            jurosTotais = valor * 0.50;
            valorTotal = valor + jurosTotais;
            emprestimototal = valorTotal / parcela;
            System.out.println("Valor Total do Empréstimo será R$ " + String.format("%.2f", valorTotal));
            System.out.println("Valor da Parcela será R$ " + String.format("%.2f", emprestimototal));
        } else if (valor >= 500000) {
            jurosTotais = valor * 0.35;
            valorTotal = valor + jurosTotais;
            emprestimototal = valorTotal / parcela;
            System.out.println("Valor Total do Empréstimo será R$ " + String.format("%.2f", valorTotal));
            System.out.println("Valor da Parcela será R$ " + String.format("%.2f", emprestimototal));
        } else {
            System.out.println("Valor de empréstimo abaixo do limite permitido.");
            return 0;
        }
        return valorTotal;
    }
}




