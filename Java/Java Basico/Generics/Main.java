public class Main {
    public static void main(String[] args) {
        Caixa<String> caixatexto = new Caixa<>();
        caixatexto.guardar("Ola");
        String texto = caixatexto.pegar();
        System.out.println(texto);
    }
}

class Caixa<T>{
    private T conteudo;

    public void guardar(T coisa){
        this.conteudo = coisa;
    }

    public T pegar(){
        return this.conteudo;
    }
}


