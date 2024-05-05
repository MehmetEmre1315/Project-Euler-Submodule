class Test {
    static void test(){
        int ans = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
class Answer {
    static void ans(){
        int ans1 = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                //System.out.println(i);
                ans1 += i;
            }
        }
        System.out.println(ans1);
    }
}
public class Main {
    public static void main(String[] args) {
        Test.test();
        Answer.ans();
    }
}