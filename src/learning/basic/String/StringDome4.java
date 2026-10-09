package learning.basic.String;
import java.util.Scanner;
public class StringDome4 {


    public class CharCount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入一个字符串：");
            // 使用 nextLine() 可以读取包含空格的整行字符串
            String str = sc.nextLine();

            // 定义三个计数器，初始值都为0
            int upperCount = 0; // 大写字母个数
            int lowerCount = 0; // 小写字母个数
            int otherCount = 0; // 其他字符个数

            // 遍历字符串中的每一个字符
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i); // 获取当前位置的字符

                // 使用 Character 类的静态方法进行判断
                if (Character.isUpperCase(c)) {
                    upperCount++;
                } else if (Character.isLowerCase(c)) {
                    lowerCount++;
                } else {
                    // 既不是大写也不是小写，都属于其他字符（包括数字、空格、标点符号等）
                    otherCount++;
                }
            }

            // 输出统计结果
            System.out.println("大写字母个数：" + upperCount);
            System.out.println("小写字母个数：" + lowerCount);
            System.out.println("其他字符个数：" + otherCount);

            sc.close(); // 关闭扫描器，释放资源
        }
    }
}