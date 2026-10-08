package learning.basic.classtext;

public class phoneText {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "小米";
        p.price = 1999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playGame();
        //可以nwe多个类，只要名字不同就

    }

}
