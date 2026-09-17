package learning.basic;

import java.util.Scanner;
import java.util.Random;

public class Text {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char) (i + 'A');
            } else
                chs[i] = (char) (i - 26 + 'a');
        }
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int ran = r.nextInt(chs.length);
            result = result + chs[ran];
        }
        int a = r.nextInt(10);
        result = result + a;
        System.out.println(result);


        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入学生的成绩");
            scores[i] = sc.nextInt();
        }
        int max = Gitmax(scores);
        int min = Gitmin(scores);
        System.out.println("最高分是" + max);
        System.out.println("最低分是" + min);
        int num = 0;
        for (int i = 0; i < scores.length; i++) {
            num += scores[i];
        }
        num = (num - min - max) / scores.length;
        System.out.println("平均分是" + num);

    }


    public static int Gitmax(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int Gitmin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static void reverse(int[] arr) {
        // 防御性判空
        if (arr == null || arr.length <= 1) {
            return;
        }

        int left = 0;
        int right = arr.length - 1;

        // 左右指针向中间靠拢，交换对应元素
        while (left < right) {
            // 交换 arr[left] 和 arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
