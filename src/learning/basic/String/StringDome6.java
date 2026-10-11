package learning.basic.String;

import java.util.Scanner;

public class StringDome6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额：");
            money = sc.nextInt();
            if (money > 0) {
                System.out.println("输入正确");
                break;
            } else
                System.out.println("输入错误");
        }
        String moneystr = "";
        while (true) {
            int ge = money % 10;
            String str = changbig(ge);
            moneystr = str + moneystr;
            money = money / 10;
            if (money == 0) {
                break;
            }
        }
        int count = 7 - moneystr.length();
        for (int i = 0; i < count; i++) {
            moneystr = "零" + moneystr;
        }
        String[] arr = {"白", "氏", "万", "千", "白", "氏", "元"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(moneystr.charAt(i) + arr[i] );
        }
    }
    public static String changbig(int num) {
        String[] arr = {"零", "一", "贰", "杉", "拭", "悟", "刘", "漆", "霸", "酒", "氏"};
        return arr[num];


    }
}
