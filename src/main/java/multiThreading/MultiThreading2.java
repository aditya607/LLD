package multiThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreading2 {

    private static Printing printing1 = new Printing(new Temp());
    private static Printing printing2 = new Printing(new Temp());
    private static Printing printing3 = new Printing(new Temp());
    public static void main(String[] args) {

        //printMultipleThread();
        //printSingleThreadOnly();
        printSynchronisedBlock();
    }

    private static void printMultipleThread() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<?> ans1 = executorService.submit(() -> printing1.normalPrinting("1st thread"));
        Future<?> ans2 = executorService.submit(() -> printing2.normalPrinting("2nd thread"));
        Future<?> ans3 =executorService.submit(() -> printing3.normalPrinting("3rd thread"));

        try {
            ans1.get();
            ans2.get();
            ans3.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
        return;
    }
    private static void printSingleThreadOnly() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<?> ans1 = executorService.submit(() -> printing1.normalPrinting("1st thread"));
        Future<?> ans2 = executorService.submit(() -> printing2.normalPrinting("2nd thread"));
        Future<?> ans3 =executorService.submit(() -> printing3.normalPrinting("3rd thread"));

        try {
            ans1.get();
            ans2.get();
            ans3.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
        return;
    }

    private static void printSynchronisedBlock() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<?> ans1 = executorService.submit(() -> printing1.syncronisedBlockPrinting("1st thread"));
        Future<?> ans2 = executorService.submit(() -> printing2.syncronisedBlockPrinting("2nd thread"));
        Future<?> ans3 =executorService.submit(() -> printing3.syncronisedBlockPrinting("3rd thread"));

        try {
            ans1.get();
            ans2.get();
            ans3.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
        return;
    }
}
