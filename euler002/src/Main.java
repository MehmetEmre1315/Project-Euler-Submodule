import java.util.ArrayList;

class Answer {
    static void answer() {
        long n0 = 1L;
        long n1 = 2L;
        long ans = 0L;
        ArrayList<Long> fibonacciList = new ArrayList<>();

        for (long i = 0; i < 100 ; i++) {
            fibonacciList.add(n0);
            long n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

            if (n0 >= 4* Math.pow(10, 6)) {
                break;
            }
        }

        for (Long i : fibonacciList) {
            if (i % 2 == 0) {
                ans += i;
            }
        }
        System.out.println("Answer:");
        System.out.println(ans);
    }
}

class Sample {
    static void first10FibonacciNumbers() {
        long n0 = 1L;
        long n1 = 2L;
        ArrayList<Long> fibonacciList = new ArrayList<>();

        for (long i = 0; i < 10 ; i++) {
            fibonacciList.add(n0);
            long n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }

        System.out.println("First 10 Fibonacci Numbers:");
        for (Long i: fibonacciList) {
            System.out.print(i + ","+" ");
        }
        System.out.println("");
    }
}

public class Main {
    public static void main(String[] args) {
        Sample.first10FibonacciNumbers();
        Answer.answer();
    }
}