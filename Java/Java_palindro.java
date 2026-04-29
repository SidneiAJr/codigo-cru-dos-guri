package teste;

public class Teste {

   
    public static void main(String[] args) {
       testaPalavra t = new testaPalavra("Teste");
       t.testar();
    }
}

class testaPalavra{
    private String palavra;

    public testaPalavra(String palavra) {
        this.palavra = palavra;
    }
    
    public void testar(){
        String invertida = new StringBuilder(palavra).reverse().toString();
        if(palavra.equalsIgnoreCase(invertida)){
            System.out.println("Palindro!");
        }else{
            System.out.println("Nao e Palindro!");
        }

    }
    
    
}
