import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int sumOfDividers (int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int abundantNumber (int number) {
        if (sumOfDividers(number) > number) {
            return number;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        long beginTime = System.nanoTime();
        List<Integer> abundantNumbers = new ArrayList<>();
        for (int i = 1; i < 28124; i++) {
            if (abundantNumber(i) != 0) abundantNumbers.add(abundantNumber(i));
        }

        List<Integer> sumOfTwoAbundantNumbers = new ArrayList<>();
        for (Integer abundantNumber1 : abundantNumbers) {
            for (Integer abundantNumber2 : abundantNumbers) {
                if (abundantNumber1 + abundantNumber2 > 28123) break;
                sumOfTwoAbundantNumbers.add(abundantNumber1 + abundantNumber2);
            }
        }
        Arrays.sort(sumOfTwoAbundantNumbers.toArray());

        long answer = 0;
        List<Integer> notSumOfTwoAbundantNumbers = new ArrayList<>();
        for (int i = 1; i < 28124; i++) {
            if (!sumOfTwoAbundantNumbers.contains(i)) {
                notSumOfTwoAbundantNumbers.add(i);
                answer += i;
            }
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - beginTime;
        System.out.println("Execution Time: " + ((double) elapsedTime) / 1000000000 + " seconds");

        System.out.println("Answer: " + answer);



    }
}