package aplicação.java;
import java.util.Scanner;
public class sistemacartao {
   
public static double limite(double saldo,Scanner entrada){
    System.out.println("Bem vindo!");
    System.out.println("Digite o valor do produto");
    double compra;
    compra = entrada.nextDouble();
    System.out.println("Digite o Nome do Produto");
    String Nome;
    System.out.println("Produto Com Valor R$"+compra+"Nome do Produto");
    if (compra <= saldo) {
            saldo -= compra;
            System.out.println("Compra realizada. Saldo atual: " + saldo);
        } else if(compra<=saldo) {
            double saldoneg = (saldo - compra);
            saldo = saldoneg;
            double juros = Math.abs(saldo)*0.07;
            saldo -=juros;
            System.out.println("Compra Realizada com sucesso, Enrou no Limite Emergencial " + saldo);
            System.out.println("Saldo Total com Juros " + saldo);
        }else{
            System.out.println("Saldo Insuficiente!");
        }
    return saldo;
}

public static void main(String[]args ){
    double saldo = 1550;
    Scanner entrada = new Scanner(System.in);
    int menu = 0;
    System.out.println("Menu:");
        System.out.println("1 - Realizar compra");
        System.out.println("2 - Sair");
    menu = entrada.nextInt();
    while(menu!=2){
        switch(menu){
            case 1:
            saldo = limite(saldo, entrada);
            break;
            default:
            System.out.println("Opção Invalida");
            break;
    }
    }
}

}
