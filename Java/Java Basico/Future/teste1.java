import java.util.concurrent.*;

public class Futures {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        // submete tarefa que retorna valor
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(1000); // simula processamento
            return 42;
        });

        System.out.println("Fazendo outras coisas...");

        // get() bloqueia ate terminar
        Integer resultado = future.get();
        System.out.println("Resultado: " + resultado); // 42

        executor.shutdown();
    }
}