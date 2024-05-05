import java.util.ArrayList;
import java.util.List;

public class Main {

    static boolean palindrome(int n0, int n1 ) {
        int n2;
        boolean isLenghtEven;
        boolean isPalindrome = false;
        ArrayList<Character> arrayCharacter = new ArrayList<>();

        n2 = n0 * n1;
        String s0 = String.valueOf(n2);
        for (int i = 0; i < s0.length(); i++) {
            arrayCharacter.add(s0.charAt(i));
        }

        if (s0.length() % 2 == 0) {
            isLenghtEven = true;
        }
        else {
            isLenghtEven = false;
        }

        if (isLenghtEven) {
            for (int i = 0; i < arrayCharacter.size() / 2; i++) {
                if (arrayCharacter.get(i) == arrayCharacter.get(arrayCharacter.size() - i - 1)) {
                    isPalindrome = true;
                }
                else {
                    isPalindrome = false;
                    break;
                }
            }
        }
        else {
            isPalindrome = false;
        }

//        System.out.println("isLenghtEven " + isLenghtEven);
//        System.out.println("isPalindrome " + isPalindrome);
//        System.out.println(s0);
//        System.out.println(arrayCharacter);
//        System.out.println(s0.length());
        return isPalindrome;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                if (palindrome(i, j)) {
                    //System.out.println(i + " * " + j + " = " + i * j);
                    list.add(i * j);
                    break;
                }
            }
        }
        int max = list.stream().max(Integer::compare).get();
        System.out.println("Largest palindrome made from the product of two 3-digit numbers is :" + max);

    }
}