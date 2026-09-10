package learning.basic;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            System.out.println("成年人");
        } else {
            System.out.println("未成年人");
        }

        int score = 85;

        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
        //练习
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age1 = sc.nextInt();
        if (age1 >= 0 && age1 <= 12) {
            System.out.println("儿童");
        } else if (age1 >= 13 && age1 <= 17) {
            System.out.println("青少年");
        } else if (age1 >= 18 && age1 <= 59) {
            System.out.println("成年人");
        } else if (age1 >= 60) {
            System.out.println("老年人");
        } else {
            System.out.println("年龄输入不合法");
        }
        System.out.print("请输入温度：");
        int temperature = sc.nextInt();

        if (temperature >= 35) {
            System.out.println("高温");
        } else if (temperature >= 25 && temperature <= 34) {
            System.out.println("温暖");
        } else if (temperature >= 15 && temperature <= 24) {
            System.out.println("凉爽");
        } else if (temperature < 15) {
            System.out.println("寒冷");
        }
        sc.close();
    }
}
