package exercises;



class MyMethods {
    
    static long myFactorial(int myNum) {
        long result = 1;
        for (int i = 1; i <= myNum; i++) {
            result = result * i;
            
        }
        return result;
    }
    
    static int calculateFibonacci(int myNum) {
        int prev = 0;
        int next = 1;
        int result = 0;
        if (myNum == 1 || myNum == 0) {
            return myNum;
        }
        for (int i = 2; i < myNum; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }
        return result;
    }
    
    static boolean isPrime(int myNum) {
        boolean numIsPrime;
        if (myNum < 2) {
            numIsPrime = false;
        } else {
            numIsPrime = true;
        }

        for (int i = 2; i < myNum; i++) {
            if ((myNum % i) == 0) {
                numIsPrime = false;
                break;
            }
        }
        
        if (numIsPrime == false) {
            return false;
        } else {
            return true;
        }
    }
}

public class MyMathMethods {
    public static void main(String[] args) {
        MyMethods m = new MyMethods();
        System.out.println(MyMethods.myFactorial(5));

        System.out.println(MyMethods.calculateFibonacci(1));

        System.out.println(MyMethods.isPrime(17));
    }
}
