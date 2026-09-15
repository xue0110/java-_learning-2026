package learning.basic;

public class ArrayDemo {
    public static void main(String[] args) {


        int[] scores = {80, 90, 75, 88, 95};

        System.out.println("数组长度：" + scores.length);

        System.out.println("第一个成绩：" + scores[0]);
        System.out.println("第二个成绩：" + scores[1]);

        System.out.println("===== 遍历数组 =====");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        System.out.println("===== 求和 =====");

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        System.out.println("总成绩：" + sum);
        System.out.println("平均成绩：" + (double) sum / scores.length);

        System.out.println("===== 最大值 =====");

        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        System.out.println("最高成绩：" + max);
    }
}