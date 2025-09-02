import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Runnable task = () -> System.out.println("Running in " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            executor.submit(task);
        }

        executor.shutdown();
    }
}