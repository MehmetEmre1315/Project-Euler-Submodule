import java.util.*;

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
        for (int i = 0; i < abundantNumbers.size(); i++) {
            for (int j = i; j < abundantNumbers.size(); j++) {
                if (abundantNumbers.get(i) + abundantNumbers.get(j) > 28123) break;
                sumOfTwoAbundantNumbers.add(abundantNumbers.get(i) + abundantNumbers.get(j));
            }
        }

        //To remove multiple occurrences of the same number
        Set<Integer> uniqueSet = new HashSet<>(sumOfTwoAbundantNumbers);
        List<Integer> uniqueSumOfTwoAbundantNumbers = new ArrayList<>(uniqueSet);

        long answer = 0;
        for (int i = 1; i < 28124; i++) {
            if (!uniqueSumOfTwoAbundantNumbers.contains(i)) {
                answer += i;
            }
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - beginTime;
        System.out.println("Execution Time: " + ((double) elapsedTime) / 1000000000 + " seconds");

        System.out.println("Answer: " + answer);
    }
}