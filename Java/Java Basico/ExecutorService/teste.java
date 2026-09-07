import java.util.concurrent.*;

public class Executors {

    public static void main(String[] args) throws InterruptedException {

        // pool de 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // submetendo tarefas
        for (int i = 1; i <= 5; i++) {
            int tarefa = i;
            executor.submit(() -> {
                System.out.println("Executando tarefa " + tarefa
                    + " na thread " + Thread.currentThread().getName());
            });
        }

        executor.shutdown(); // para aceitar novas tarefas
        executor.awaitTermination(5, TimeUnit.SECONDS); // espera terminar
        System.out.println("Todas as tarefas concluidas!");
    }
}