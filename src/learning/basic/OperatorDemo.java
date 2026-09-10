package learning.basic;

public class OperatorDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        boolean x = true;
        boolean y = false;

        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));git add .
        System.out.println("!x = " + (!x));
        //练习
        double principal = 10000.0; // 本金
        double rate = 0.035;        // 年利率 3.5%
        int year = 1;               // 存一年

        double interest = principal * rate * year; // 利息
        double total = principal + interest;       // 本息合计

        System.out.println("本金：" + principal);
        System.out.println("年利率：" + (rate * 100) + "%");
        System.out.println("一年利息：" + interest);
        System.out.println("一年后本息合计：" + total);
    }
}
