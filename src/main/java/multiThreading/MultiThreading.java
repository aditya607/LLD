package multiThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreading {

    private static Printing printing = new Printing(new Temp());
    public static void main(String[] args) {

        //printMultipleThread();
        //printSingleThreadOnly();
        printSynchronisedBlock();
    }

    private static void printMultipleThread() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<?> ans1 = executorService.submit(() -> printing.normalPrinting("1st thread"));
        Future<?> ans2 = executorService.submit(() -> printing.normalPrinting("2nd thread"));
        Future<?> ans3 =executorService.submit(() -> printing.normalPrinting("3rd thread"));

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

        Future<?> ans1 = executorService.submit(() -> printing.sunchronisedPrint("1st thread"));
        Future<?> ans2 = executorService.submit(() -> printing.sunchronisedPrint("2nd thread"));
        Future<?> ans3 =executorService.submit(() -> printing.sunchronisedPrint("3rd thread"));

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

        Future<?> ans1 = executorService.submit(() -> printing.syncronisedBlockPrinting("1st thread"));
        Future<?> ans2 = executorService.submit(() -> printing.syncronisedBlockPrinting("2nd thread"));
        Future<?> ans3 =executorService.submit(() -> printing.syncronisedBlockPrinting("3rd thread"));

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
