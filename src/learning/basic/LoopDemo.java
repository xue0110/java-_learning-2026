package learning.basic;

public class LoopDemo {
    public static void main(String[] args) {

        System.out.println("===== for =====");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("===== while =====");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("===== do while =====");

        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
        //练习
        for (int m = 1; m <= 9; m++) {

            for (int n = 1; n <= m; n++) {
                System.out.print(n + " x " + m + " = " + (n * m) + "\t");
            }

            System.out.println();
        }
        }
    }
