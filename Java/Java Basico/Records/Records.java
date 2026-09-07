public class Records {

    // record - classe imutavel automatica!
    record User(String nome, int idade) {}

    // record com metodo customizado
    record Produto(String nome, double preco) {
        // validacao no construtor
        Produto {
            if (preco < 0) throw new IllegalArgumentException("Preco negativo!");
        }

        // metodo extra
        String descricao() {
            return nome + " por R$ " + preco;
        }
    }

    public static void main(String[] args) {
        User user = new User("Teste", 25);

        // getters automaticos!
        System.out.println(user.nome());   // Teste
        System.out.println(user.idade());  // 25

        // toString automatico!
        System.out.println(user); // User[nome=Teste, idade=25]

        // equals automatico!
        User user2 = new User("Teste", 25);
        System.out.println(user.equals(user2)); // true

        Produto p = new Produto("Camiseta", 49.90);
        System.out.println(p.descricao()); // Camiseta por R$ 49.90
    }
}