package learning.basic;
import java.util.Scanner;
/**
 * SwitchDemo 类展示了Java中switch语句的使用方法
 * 包含两个示例：1. 根据数字输出对应的星期 2. 简单的银行菜单系统
 */
public class SwitchDemo {
    public static void main(String[] args) {



        // 第一个示例：根据数字输出对应的星期
        int day = 3;  // 定义一个变量day，赋值为3

        // 使用switch语句根据day的值输出对应的星期
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;  // 结束当前case

            case 2:
                System.out.println("星期二");
                break;

            case 3:
                System.out.println("星期三");
                break;

            case 4:
                System.out.println("星期四");
                break;

            case 5:
                System.out.println("星期五");
                break;

            case 6:
                System.out.println("星期六");
                break;

            case 7:
                System.out.println("星期日");
                break;

            default:  // 处理所有不匹配的情况
                System.out.println("输入错误");
        }
        //练习
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 银行菜单 =====");
        System.out.println("1 -> 查询余额");
        System.out.println("2 -> 存钱");
        System.out.println("3 -> 取钱");
        System.out.println("4 -> 转账");
        System.out.println("5 -> 退出");
        System.out.print("请输入您的选择：");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("正在执行：查询余额");
                break;

            case 2:
                System.out.println("正在执行：存钱");
                break;
            case 3:
                System.out.println("正在执行：取钱");
                break;
            case 4:
                System.out.println("正在执行：转账");
                break;
            case 5:
                System.out.println("正在执行：退出系统");
                break;
            default:
                System.out.println("输入错误：请重新输入 1~5 之间的数字");
                break;
        }

        sc.close();
    }
}
