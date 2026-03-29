package calculadora_horas;
import java.util.Scanner;


public class Calculadora_horas {

    public static void main(String[] args) {
       calculadora calc = new calculadora(1,1,1,1,1,1);
       calc.verificar();
    }
}

class calculadora{
   private int totalHorasM;
   private int totalhorassemana;
   private int totalpresença;
   private int semanas;
   private int res1 ;
   private int res2 = totalpresença/100;
   private int res3;

    public calculadora(int totalHorasM, int totalhorassemana, int totalpresença, int semanas, int res1, int res3) {
        this.totalHorasM = totalHorasM;
        this.totalhorassemana = totalhorassemana;
        this.totalpresença = totalpresença;
        this.semanas = semanas;
        this.res1 = res1;
        this.res3 = res3;
    }
   
   
   void verificar(){
       Scanner entrada = new Scanner(System.in);
       System.out.println("Insira carga Horaria da Materia em Horas: ");
       int totalHorasM = entrada.nextInt();
       System.out.println("Insira o % de Aprovação (ex: 75):  ");
       double totalpresenca = entrada.nextInt();
       System.out.println("Quantidade de Aulas na Semana: ");
       int semanas = entrada.nextInt();
       double perc = totalpresenca/100;
       double total = totalHorasM*perc;
       double total2 = total/semanas;
       System.out.println("Total de Horas: "+total2);
   }

}
