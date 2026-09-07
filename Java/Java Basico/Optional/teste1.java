import java.util.Optional;

public class Optionals {

    static Optional<String> buscarUsuario(int id) {
        if (id == 1) return Optional.of("Teste");
        return Optional.empty();
    }

    public static void main(String[] args) {

        // sem optional - perigoso!
        // String user = buscar(2);
        // user.length(); // NullPointerException!

        // com optional - seguro!
        Optional<String> user = buscarUsuario(1);

        // isPresent
        if (user.isPresent()) {
            System.out.println(user.get()); // Teste
        }

        // ifPresent - mais elegante
        user.ifPresent(u -> System.out.println("Achou: " + u));

        // orElse - valor padrao
        String resultado = buscarUsuario(99)
            .orElse("Usuario nao encontrado");
        System.out.println(resultado);

        // orElseThrow
        try {
            String u = buscarUsuario(99)
                .orElseThrow(() -> new RuntimeException("Nao achou!"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // map no optional
        buscarUsuario(1)
            .map(String::toUpperCase)
            .ifPresent(System.out::println); // TESTE
    }
}