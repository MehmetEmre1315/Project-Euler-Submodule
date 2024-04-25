import java.util.ArrayList;
import java.util.List;

public class Main {
    static void smallestMultiple (int dividerLimit ) {
        long x = dividerLimit;
        long ans;
        List<Integer> tallyCounter = new ArrayList<>();

        while(true) {
            for (int i = 1; i <= dividerLimit; i++) {
                if (x % i == 0) {
                    tallyCounter.add(i);
                } else {
                    tallyCounter.clear();
                    break;
                }
            }

            if (tallyCounter.size() == dividerLimit) {

                System.out.println("Answer: " + x);
                ans = x;
                break;
            }
            x += 10;
        }

        for (int i = 1; i <= dividerLimit; i++) {
            System.out.println(ans + "/" + i + "=" + ans / i);
        }
    }

    public static void main(String[] args) {
        smallestMultiple(20);
    }
}