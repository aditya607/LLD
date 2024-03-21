package interview;

public class Main2 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 34, 3, 98, 9, 76, 45, 4};

        int size = 8;
        for(int i=0; i<8; i++) {
            for(int j=i+1; j<8;j++) {
                if(isGreater(arr[i], arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        for (int x: arr) {
            System.out.println(x);
        }
        System.out.println();
        for(int x:arr) {
            System.out.print(x);
        }
    }

    private static boolean isGreater(int left, int right) {
        int digitLeft = calcualeDigits(left);
        int digitRight = calcualeDigits(right);
        if(digitLeft == digitRight) {
            return left < right;
        } else {
            //return left < right;
            //make number of same digit
            if(digitLeft> digitRight) {
                return left < increaseDigit(right, digitLeft-digitRight);
            } else {
                return increaseDigit(left, digitLeft-digitRight) <right;
            }
        }
    }

    private static int increaseDigit(int right , int count) {
        int lastdigit = right%10;
        for(int i=0; i<count ; i++) {
            right =right*10 + lastdigit;
        }
        return right;

    }

    private static int calcualeDigits(int x) {
        int count = 1;
        while(x>10 ){
            count = count+1;
            x = x/10;
        }
        return count;
    }

}
