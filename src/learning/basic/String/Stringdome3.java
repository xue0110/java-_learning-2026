package learning.basic.String;

import java.util.Scanner;

public class Stringdome3 {
    public static void main(String[] args) {
        /*String name = "newade";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        boolean isSuccess = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");

            String userName = sc.next();
            System.out.println("请输入密码");
            String userPassword = sc.next();
            if (userName.equals(name) && userPassword.equals(password)) {
                System.out.println("登录成功");
                isSuccess = true;
                break;
            } else {
                System.out.println("登录失败还有" + (2 - i) + "次机会");
            }

        }
        if (!isSuccess) {
            System.out.println("3次机会已用尽，账号已被锁定！");}

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String arr =sc.next();
        for (int i = 0; i < arr.length(); i++) {
            System.out.println(arr.charAt(i));

        }
    }
}