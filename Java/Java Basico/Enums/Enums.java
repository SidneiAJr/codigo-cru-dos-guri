public class Enums {

    enum Status {
        PENDENTE, APROVADO, CANCELADO
    }

    // enum com atributo e metodo
    enum Cor {
        VERMELHO("#FF0000"),
        VERDE("#00FF00"),
        AZUL("#0000FF");

        private final String hex;

        Cor(String hex) {
            this.hex = hex;
        }

        public String getHex() {
            return hex;
        }
    }

    public static void main(String[] args) {
        Status s = Status.APROVADO;

        switch (s) {
            case PENDENTE -> System.out.println("Aguardando...");
            case APROVADO -> System.out.println("Aprovado!");
            case CANCELADO -> System.out.println("Cancelado!");
        }

        System.out.println(Cor.VERMELHO.getHex()); // #FF0000

        // iterando enum
        for (Cor c : Cor.values()) {
            System.out.println(c + " = " + c.getHex());
        }
    }
}