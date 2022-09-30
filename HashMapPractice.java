import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        var hm = new HashMap<Integer, String>();
        hm.put(1, "January");
        hm.put(2, "Febuary");
        hm.put(3, "March");
        hm.put(4, "April");
        hm.put(5, "May");
        hm.put(6, "June");
        hm.put(7, "July");
        hm.put(8, "August");
        hm.put(9, "September");
        hm.put(10, "October");
        hm.put(11, "November");
        hm.put(12, "December");
        int month = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("請輸入1~12?");
            month = sc.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("輸入錯誤\n");
            }
        } while (month < 1 || month > 12);
        System.out.printf("第%d月的英文單字為%s\n", month, hm.get(month));
    }
}