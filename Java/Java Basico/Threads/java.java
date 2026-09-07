public class Threads {

    public static void main(String[] args) throws InterruptedException {

        // jeito 1 - extendendo Thread
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread 1: " + i);
                }
            }
        };

        // jeito 2 - Runnable (mais comum)
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        t1.start();
        t2.start();

        // espera terminar
        t1.join();
        t2.join();

        System.out.println("Ambas terminaram!");
    }
}