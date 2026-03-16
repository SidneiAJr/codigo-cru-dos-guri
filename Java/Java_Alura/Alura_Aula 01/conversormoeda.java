import java.util.Scanner;

public class convmoedas {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int op =0;
        double saldo; 
        double quantidade;
        op = entrada.nextInt();
        while(op!=5){
            switch(op){
            case 1:
            //conversor total com impostos
            break;
            case 2:
            //Conversor Separado
            break;
            case 3:
            //conversor com cartão de credito
            break;
            case 4:
            //Carteira
            break;
            default:
            System.out.println("Favor Informar A opção correta:");
        }
        }
    }
}
public static void conversor(double saldo,double quantidade,Scanner entrada){
     System.out.println("Informe o Valor que gostaria de converter");
     double valor;
     valor = entrada.nextDouble();
     double dolar = 0.17;
     double eur = 0.16;
     double gold = 0.0291;
     double cny = 0.79;
     double conv1 = valor/dolar;
     double conv2 = valor/eur;
     double conv3 = valor/gold;
     double conv4 = valor/cny;
     System.out.println("Dolar $"+conv1);
     System.out.println("Euro $"+conv2);
     System.out.println("Gold $"+conv3); 
     System.out.println("Yuan $"+conv4);
     


     
}
