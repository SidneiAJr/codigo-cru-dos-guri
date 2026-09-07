import java.util.concurrent.*;

public class CompletableFutures {

    public static void main(String[] args) throws Exception {

        // executa async
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Buscando dados...");
            return "Dados encontrados!";
        });

        // encadeia operacoes
        CompletableFuture<String> resultado = future
            .thenApply(dados -> dados.toUpperCase())
            .thenApply(dados -> "Resultado: " + dados);

        System.out.println(resultado.get());
        // Resultado: DADOS ENCONTRADOS!

        // combinando dois futures
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<String> combinado = f1.thenCombine(f2,
            (r1, r2) -> r1 + " " + r2);

        System.out.println(combinado.get()); // Hello World

        // tratando erro
        CompletableFuture<Integer> comErro = CompletableFuture
            .supplyAsync(() -> {
                throw new RuntimeException("Deu ruim!");
            })
            .exceptionally(ex -> {
                System.out.println("Erro: " + ex.getMessage());
                return -1; // valor padrao
            });

        System.out.println(comErro.get()); // -1
    }
}