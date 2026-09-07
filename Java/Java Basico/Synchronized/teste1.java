public class Sincronizacao {

    static int contador = 0;

    // synchronized garante que so uma thread executa por vez
    static synchronized void incrementar() {
        contador++;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) incrementar();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) incrementar();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Contador: " + contador); // 2000 sempre!
    }
}