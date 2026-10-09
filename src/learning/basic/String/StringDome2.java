package learning.basic.String;

import java.util.Scanner;

public class StringDome2 {
    public static void main(String[] args) {
        String str = new String("qwer");
        String str2 = "qwer";
        String str3 = new String("qwer");
        System.out.println(str==str2);
        System.out.println(str==str3);
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str3));
        String str4 =new String("qweR");
        System.out.println(str.equalsIgnoreCase(str4));
        Scanner sc = new Scanner(System.in);
        String str5 = sc.next();
        System.out.println(str5.equalsIgnoreCase(str2));
        System.out.println(str5==str2);

    }

}
