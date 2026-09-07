public class PatternMatching {

    public static void main(String[] args) {

        // jeito antigo
        Object obj = "Teste";
        if (obj instanceof String) {
            String s = (String) obj; // cast manual
            System.out.println(s.toUpperCase());
        }

        // jeito novo - cast automatico!
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase()); // TESTE
        }

        // com switch
        Object valor = 42;

        String resultado = switch (valor) {
            case Integer i -> "Inteiro: " + i;
            case String s  -> "String: " + s;
            case Double d  -> "Double: " + d;
            default        -> "Outro: " + valor;
        };

        System.out.println(resultado); // Inteiro: 42
    }
}