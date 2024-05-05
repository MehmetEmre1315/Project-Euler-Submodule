import java.util.ArrayList;

class PrimeNumberFinder {
    static ArrayList<Long> primeNumberFinder(long n){
        ArrayList<Long> primeNumbers = new ArrayList<>();
        for (long i = 2; i <= n; i++) {
            if (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
                i = 1;
            }
        }
        return primeNumbers;
    }
}

class Sample {
    static void sample() {
        long n = 13195L;
        ArrayList<Long> primeNumbers = PrimeNumberFinder.primeNumberFinder(n);
        System.out.println("The prime factors of 13195 are:");
        System.out.println(primeNumbers);
    }
}

class Answer {
    static void answer(){
        long n = 600851475143L;
        ArrayList<Long> primeNumbers = PrimeNumberFinder.primeNumberFinder(n);
        System.out.println("Largest prime factor of 600851475143 is:");
        System.out.println(primeNumbers.get(primeNumbers.size()-1));
    }
}

public class Main {
    public static void main(String[] args) {
        Sample.sample();
        Answer.answer();
    }
}