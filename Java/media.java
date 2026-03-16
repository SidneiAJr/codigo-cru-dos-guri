class Programtest {
    public static void main(String[] args) {
        
        int media1 = 100;
        int media2 = 100;
        int media3 = 100;
        int media4 = 100;
        int soma = (media1+media2+media3+media4)/3;
        if(soma >=6){
            System.out.print("Aprovado");
        }else if(soma>=40 ){
            System.out.println("Recuperacao");
        }else{
            System.out.println("Reprovado");
        }
        


        System.out.print("Programa em Java\n");
        System.out.printf("Valor da Variavel num:%d",soma);

    }
}
