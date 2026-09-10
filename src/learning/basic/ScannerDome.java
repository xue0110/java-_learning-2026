package learning.basic;
import java.util.Scanner;
public class ScannerDome {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入你的姓名：");
            String name = scanner.nextLine();

            System.out.print("请输入你的年龄：");
            int age = scanner.nextInt();

            System.out.print("请输入你的身高：");
            double height = scanner.nextDouble();

            System.out.println();
            System.out.println("===== 个人信息 =====");
            System.out.println("姓名：" + name);
            System.out.println("年龄：" + age);
            System.out.println("身高：" + height);

            //scanner.close();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的学校：");
            String school = sc.nextLine();
            System.out.println("学校：" + school);
            //最好不要定义两个scanner类

        }
}
