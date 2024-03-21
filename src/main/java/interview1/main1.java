package interview1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class main1 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int kthLargestElement = doTheComputation(5,2);
        System.out.println("answer " + kthLargestElement);

    }

    public static int doTheComputation(int n, int k) {
        if(k == 0) {
            throw new RuntimeException("sorry k can't be 0");
        }
        //getting the steam
        PriorityQueue<Integer> integerStream = new PriorityQueue<>();
        int count = 0;
        int start = 0;
        while(start != n) {
            // getting all the element
            int inputInteger = scanner.nextInt();
            count++;

            //pushing the data to priority queue
            pushlishThelementToQueue(integerStream, inputInteger, count, k);
            start++;
        }

       //getting the kth largest element
       validateThePriorityQueue(integerStream, k);
       return getKthLargestElement(integerStream);

    }

    private static void validateThePriorityQueue(PriorityQueue<Integer> integerStream, int count) {

        int size = integerStream.size();
        if(size != count) {
            throw new RuntimeException("sorry, element inserted is less than required " + count);
        }
    }

    private static int getKthLargestElement(PriorityQueue<Integer> integerStream) {
        int lastElement = 0;
        while(integerStream.size()!= 0) {
            lastElement = integerStream.poll();
        }
        return lastElement;
    }

    private static void pushlishThelementToQueue(PriorityQueue<Integer> integerStream, int inputInteger, int count, int k) {

        if(count > k) {
            synchronized (integerStream) {
                if (inputInteger > integerStream.peek()) {
                    integerStream.poll();
                    integerStream.add(inputInteger);
                }
            }
        } else {
            integerStream.add(inputInteger);
        }
    }
}
