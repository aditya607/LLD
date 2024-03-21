package multiThreading;

public class Temp {

    public void printbac(String id) {
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(id + " " + i);
        }
    }
}
