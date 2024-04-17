import java.util.ArrayList;
import java.util.List;

public class Main {
    // firt
    //second
    //third
    //fourth
    //fifth
    //sixth
    public static void main(String[] args) {
        List<Long> bigList = new ArrayList<>();
        List<Long> primeList = new ArrayList<>();
        bigList.add(2L);

        for (long i = 3L; i < 10000000; i += 2) {
            if ((i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)) {
                continue;
            }
            else {
                bigList.add((long) i);
            }
        }
//        System.out.println(bigList);
//        System.out.println(bigList.size());


        primeList.add(2L);
        primeList.add(3L);
        primeList.add(5L);
        primeList.add(7L);

        boolean isPrime = true;
        for (Long i : bigList) {
            if (i % 2 == 0) {
                continue;
            }

            for (Long j = 3L; j<=i; j +=2) {
                if (i % j == 0) {
                    if (i == j && isPrime){
                        continue;
                    }
                    isPrime = false;
                    break;
                }
                if (i == j && isPrime) {
                    primeList.add(i);
                }

            if (primeList.size() == 10001) {
                System.out.println(primeList.get(10000));
                break;
            }
            }
        }
    }
}
