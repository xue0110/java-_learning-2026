package learning.basic.String;

public class StringDome {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);

        String s2 = new String();
        System.out.println("111" + s2 + "222");

        String s3 = new String("abc");
        System.out.println(s3);


        char[] arr = {'a', 'b', 'c', 'd'};
        String s4 = new String(arr);
        System.out.println(s4);


        byte[] arr1 = {97, 98, 99};
        String s5 = new String(arr1);
        System.out.println(s5);
    }
}
