package multiThreading;

public class Printing {

    private Temp temp;

    Printing(Temp temp) {
        this.temp = temp;
    }

    public void normalPrinting(String id) {
        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(id + " " + i);
        }
    }

    public void printingWithSleep (String id) throws InterruptedException {
        Thread.sleep(5000);
        for (int i=0; i<10; i++) {
            System.out.println(id + " " + i);
        }
    }

    public synchronized void sunchronisedPrint (String id) {
        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(id + " " + i);
        }
    }

    public  void syncronisedBlockPrinting (String id) {

        synchronized (temp) {
            System.out.println("not in temp - id = " + id );
            temp.printbac("id");
        }
    }


}
