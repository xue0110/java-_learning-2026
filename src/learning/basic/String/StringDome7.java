package learning.basic.String;

public class StringDome7 {
    public static void main(String[] args) {
       /* String s1 = "132753562346";
        String start = s1.substring(0, 3);
        String end = s1.substring(7);
        System.out.println(start + "****" + end);
        String m = "cnm";
        String n = m.replace("cnm", "***");
        System.out.println(n);
*/
        StringBuilder sb = new StringBuilder("123456789");
        sb.append("qadad");
        sb.append("flose");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String a = sb.toString();
        System.out.println(a);

    }
}