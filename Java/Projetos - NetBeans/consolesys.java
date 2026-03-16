/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;


/**
 *
 * @author vraudemesa
 */
public class JavaApplication1 {

    
    
    
    public static void calc1(){
        Scanner entrada = new Scanner(System.in);
        double valorIni;
        System.out.print("Digite o valor inicial: ");
        valorIni=entrada.nextDouble();
        int tempo;
        System.out.print("Digite o tempo em anos: ");
        tempo=entrada.nextInt();
        double juros;
        System.out.print("Juros %: ");
        juros=entrada.nextDouble();
        double vf;
        double divjuros = juros/100;
        
        vf = valorIni * Math.pow((1 + divjuros), tempo);
        System.out.print("Valor futuro:"+ vf);
       //classe para calculadora de vf//  
    }
    public static void juros(){
        Scanner entrada = new Scanner(System.in);
        double rend;
        System.out.print("Digite o valor do rendimento: ");
        rend=entrada.nextDouble();
        double valorApli;
        System.out.print("Digite o valor do investimento inicial: ");
        valorApli=entrada.nextDouble();
        double res;
        res = (rend*100)/valorApli;
        System.out.print("O juros atual é: "+res);
    }
    public static void cad(){
     
        Scanner reb = new Scanner(System.in);
        String nome;
        System.out.print("Digite seu nome: ");
        nome = reb.nextLine();
        String sobrenome;
        System.out.print("Digite seu sobrenome: ");
        sobrenome = reb.nextLine();
        String tel;
        System.out.print("Digite seu Telefone: ");
        tel = reb.nextLine();
        String matricula;
        System.out.print("Digite seu Matricula: ");
        matricula = reb.nextLine();
        String salario;
        System.out.print("Digite seu Salario: ");
        salario = reb.nextLine();
        double res;
        int hrtr;
        System.out.print("Digite as horas trabalhas ");
        hrtr = reb.nextInt();
        res = Double.parseDouble(salario);
        double tl;
        double rec = hrtr*30;
        if(res>=2259.21 && res<=2826.65){
            double desc = res*0.075;
            System.out.println("O desconto de IR sera R$:"+desc);
        }else if(res>=2826.66 && res<=3751.05){
            double desc = res*0.15;
            System.out.println("O desconto de IR sera R$:"+desc);
        }else if(res>=3751.05 && res<=3751.06){
            double desc = res*0.225;
            System.out.println("O desconto de IR sera R$:"+desc);
        }else{
            double desc = res*0.275;
             System.out.println("O desconto de IR sera R$:"+desc);
        }
        tl = res/rec;
        tl = Math.round(tl * 100.0) / 100.0;
        String[] info = {nome , sobrenome,tel,matricula,salario};
        System.out.println("Ola Bem vindo " + info[0] + " " + info[1]+ "Telefone: " + info[2]+ " Matricula: "+ info[3]+" Salario bruto R$: "+ info[4]);
        System.out.println("Valor da hora R$:"+tl);
        
    }
    
    public static void main(String[] args) {
      
    int op;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite uma opcao : ");
    op=entrada.nextInt();
    
    switch(op){
        case 1:
        calc1();
        break;
        case 2:
        juros();
        break;
        case 3:
        cad();
        break;
        default:
        System.out.println("Opção inválida!");
        break;
   
       
       
    }
        
        
        
    }
    
}
