import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a nota");
    double n1 = entrada.nextDouble();
    System.out.println("Digite a nota");
    double n2 = entrada.nextDouble();
    System.out.println("Digite a nota");
    double n3 = entrada.nextDouble();
    double resultado = n1+n2+n3;
    System.out.println(resultado);
    }
}
