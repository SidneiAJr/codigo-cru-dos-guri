public static void calc1(){
        Scanner entrada = new Scanner(System.in);
        double valorIni;
        System.out.print("Digite o valor inicial");
        valorIni=entrada.nextDouble();
        int tempo;
        System.out.print("Digite o tempo em anos");
        tempo=entrada.nextInt();
        double juros;
        System.out.print("Juros %");
        juros=entrada.nextDouble();
        double vf;
        double divjuros = juros/100;
        
        vf = valorIni * Math.pow((1 + divjuros), tempo);
        System.out.print("Valor futuro:"+ vf);
        
        
    }
    
    public static void main(String[] args) {
      
    int op;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite uma opção");
    op=entrada.nextInt();
    
    switch(op){
        case 1:
        calc1();
        break;
        default:
        System.out.println("Opção inválida!");
        break;
   
       
       
    }
        
        
        
    }
