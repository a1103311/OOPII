import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        var ts = new TreeSet<Integer>();
        for (int i = 0; i < 10; i++) {
            SecureRandom sr = new SecureRandom();
            int srnum = 0;

            if (i == 0) {
                srnum = sr.nextInt(100) + 1;
            } else if (ts.size() > 0) {
                do {
                    srnum = sr.nextInt(100) + 1;
                } while (checkNumbers(srnum, ts));
            }
            ts.add(srnum);
            System.out.printf("第%d個號碼是:%d\n", i,srnum);
        }
        System.out.printf("物件內元素個數為:%d\n", ts.size());
        System.out.print("物件內元素的內容:");
        System.out.println(ts);
        System.out.printf("第一個元素內容為:%d\n", ts.first());
        System.out.printf("最後一個元素內容為:%d\n", ts.last());
        var ts2 = new TreeSet<Integer>();
        for (int toGetNumbers : ts) {
            if (toGetNumbers < 70 && toGetNumbers > 30) {
                ts2.add(toGetNumbers);
            }
        }
        System.out.printf("內容介於30~70者:");
        System.out.println(ts2);
    }

    public static boolean checkNumbers(int i, TreeSet<Integer> ts) {
        for (int toCheckNumbers : ts) {
            if (i == toCheckNumbers) {
                return true;
            }
        }
        return false;
    }

}
