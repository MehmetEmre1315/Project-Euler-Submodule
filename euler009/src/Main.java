import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < 1000; i++) numbers.add(i);

        for (int i : numbers) {
            for (int j : numbers) {
                if (i < j) {
                    a = i;
                    b = j;
                    c = (int) Math.sqrt(a * a + b * b);
                }

                if ((a < b && b< c) && (a + b + c == 1000) && (a * a + b * b == c * c)) {
                    System.out.println(a + " " + b + " " + c);
                    System.out.println(a * b * c);
                }
            }
        }
    }
}