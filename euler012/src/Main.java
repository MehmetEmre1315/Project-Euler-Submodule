import java.util.ArrayList;

public class Main {
    static long triangularNumberFormula(long n) {
        return (n * (n + 1)) / 2;
    }

    static ArrayList<Long> getFactors(long n) {
        ArrayList<Long> factors = new ArrayList<>();
        for(long i = 1L; i<= Math.sqrt(n); i++ ) {
            if (n % i == 0) {
                if (n / i == i) {
                    factors.add(i);
                } else {
                    factors.add(i);
                    factors.add(n / i);
                }
            }
        }
        return factors;
    }
    public static void main(String[] args) {
        long i = 0L;
        while (true) {
            int factorCount = getFactors(triangularNumberFormula(i)).size();
            if (factorCount >= 500) {
                System.out.println("Answer: " + triangularNumberFormula(i));
                break;
            }
            i++;
        }
    }
}