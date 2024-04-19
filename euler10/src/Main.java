import java.util.ArrayList;
import java.util.List;

public class Main {
    static boolean isPrime (long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        for (long i = 2L; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        long answer;
        List<Long> bigList = new ArrayList<>();
        List<Long> primeList = new ArrayList<>();
        bigList.add(2L);

        for (long i = 3L;  i <= 2000000L; i+=2) {
            bigList.add(i);
        }
        for (long i : bigList) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        answer = primeList.stream().mapToLong(Long::longValue).sum();
        System.out.println(answer);

    }
}