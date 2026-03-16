package com.mycompany.ts;
import java.util.Scanner;

public class Ts {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        double saldo = 0;

        // Exibe o menu
        System.out.println("1 - Conversor");
        System.out.println("2 - Conversor Separado");
        System.out.println("3 - Conversor com Cartão de Crédito");
        System.out.println("4 - Carteira");
        System.out.println("5 - Sair");

        // Loop de execução do menu
        while (op != 5) {
            op = entrada.nextInt();  // Lê a opção do usuário

            // Processa a opção escolhida
            switch (op) {
                case 1:
                    conversor(saldo, entrada);  // Chama o conversor direto
                    break;
                case 2:
                    conversoruni(saldo, entrada);  // Chama o conversor separado
                    break;
                case 3:
                    compracredito(saldo, entrada);  // Chama o método de conversão com cartão de crédito
                    break;
                case 4:
                    // Implementar lógica para Carteira
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Favor informar a opção correta:");
                    break;
            }
        }

        entrada.close();  // Fecha o scanner
    }

    // Método para realizar a conversão (direto)
    public static void conversor(double saldo, Scanner entrada) {
        System.out.println("Informe o valor que gostaria de converter:");
        double valor = entrada.nextDouble();

        // Taxas de conversão
        double dolar = 0.17;
        double eur = 0.16;
        double gold = 0.0291;
        double cny = 0.79;
        double pesoarg = 192.30;
        double pesochile = 168.97;
        double pesoven = 12.43;

        // Realizando as conversões
        double conv1 = valor * dolar;
        double conv2 = valor * eur;
        double conv3 = valor * gold;
        double conv4 = valor * cny;
        double conv5 = valor * pesoarg;
        double conv6 = valor * pesochile;
        double conv7 = valor * pesoven;

        // Exibindo os resultados das conversões
        System.out.println("Dólar $ " + conv1);
        System.out.println("Euro $ " + conv2);
        System.out.println("Gold $ " + conv3);
        System.out.println("Yuan $ " + conv4);
        System.out.println("Peso Argentino $ " + conv5);
        System.out.println("Peso Chile $ " + conv6);
        System.out.println("Peso Venezuelano $ " + conv7);

        // Verificação do saldo
        if (saldo >= 0) {
            System.out.println("Sem saldo, favor verificar.");
        } else {
            System.out.println("Conversão realizada com sucesso");
        }
    }

    // Método para conversor separado (a ser implementado)
    public static void conversoruni(double saldo, Scanner entrada) {
        System.out.println("Selecione a moeda que gostaria de converter:");
        int opcao = entrada.nextInt();
        double valor = entrada.nextDouble();
        while (opcao != 3) {
            switch (opcao) {
                case 1:
                    System.out.println("1 - DOLAR");
                    double dolar = 0.17;
                    double convertido = valor * dolar;
                    System.out.println("Dolar $ " + convertido);
                    break;
                case 2:
                    System.out.println("2 - EURO");
                    double euro = 0.16;
                    double convertido2 = valor * euro;
                    System.out.println("Euro $ " + convertido2);
                    break;
                case 3:
                    System.out.println("3 - GOLD");
                    double ouro = 0.0291;
                    double convertido3 = valor * ouro;
                    System.out.println("Gold $ " + convertido3);
                    break;
                default:
                    System.out.println("Favor informar a opção correta:");
                    break;
            }

            // Atualiza a opção após cada escolha no menu
            opcao = entrada.nextInt();
        }
    }

    // Método para conversão com cartão de crédito (incluindo juros e IOF)
    public static void compracredito(double saldo, Scanner entrada) {
        System.out.println("Selecione o valor que gostaria de converter com cartão de crédito:");
        double valor = entrada.nextDouble();
        double juros = 0.07;  // Taxa de juros
        double iof = 0.04;    // Taxa de IOF
        double dolar = 0.17;  // Taxa de conversão para Dólar
        double euro = 0.16;  // Taxa de Conversão e não preço
        double pesoarg = 192.33;

        // Calculando o valor total com juros e IOF
        double conversaojuros = (valor * (1 + juros)) * (1 + iof) * dolar;
        System.out.println("Valor em Dólar com Juros e IOF: $ " + conversaojuros);
        double conversaojuros2 = (valor * (1 + juros)) * (1 + iof) * euro;
        System.out.println("Valor em Euro com Juros e IOF: $ " + conversaojuros2);
        double conversaojuros3 = (valor * (1 + juros)) * (1 + iof) * pesoarg;
        System.out.println("Valor em Peso Argentino com Juros e IOF: $ " + conversaojuros3);
        
    }
}
