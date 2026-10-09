package learning.basic.ClassText3;

public class GoodsText {
    public static void main(String[] args) {
        Goods arr[] = new Goods[3];
        Goods g1 = new Goods("001", "电脑", 10000.0, 2999);
        Goods g2 = new Goods("002", "手机", 3000.0, 299);
        Goods g3 = new Goods("003", "电视", 100000.0, 29);


        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods good=arr[i];
            System.out.println(good.getId()+" "+good.getName()+" "+good.getPrice()+" "+good.getPrice()+" "+good.getCount());

        }
    }
}