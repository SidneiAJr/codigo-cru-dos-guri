import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Caixa<String> caixatexto = new Caixa<>();
        caixatexto.guardar("Ola");
        String texto = caixatexto.pegar();
        System.out.println(texto);
        try {
    Class<?> classe = Class.forName("Caixa");
    Object obj = classe.getDeclaredConstructor().newInstance();
    System.out.println(obj.getClass().getName()); // "Caixa"

    // chamando o método guardar via reflexão
    Method metodo = classe.getMethod("guardar", Object.class);
    metodo.invoke(obj, "via reflexão!");

    // chamando o pegar via reflexão
    Method pegar = classe.getMethod("pegar");
    Object resultado = pegar.invoke(obj);
    System.out.println(resultado); // "via reflexão!"

} catch (Exception e) {
    System.out.println("Erro: " + e.getMessage());
}
       
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


