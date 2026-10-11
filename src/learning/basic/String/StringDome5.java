package learning.basic.String;

public class StringDome5 {
    public static void main(String[] args)
    {
        String str="abcdefg";
        System.out.println(change(str));
    }
    public static String change(String str)
    {
        String a="";
        for (int i = str.length()-1; i >=0; i--) {
            a+=str.charAt(i);
        }
        return a;
    }


}
