package learning.basic.ClassText3;

import java.util.Scanner;

public class CarText {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car car = new Car();
            System.out.println("请输入品牌");
            String brand = sc.next();
            car.setBrand(brand);
            System.out.println("请输入价格");
            int price = sc.nextInt();
            car.setPrice(price);
            System.out.println("请输入颜色");
            String color = sc.next();
            car.setColor(color);
            arr[i] = car;

        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(arr[i].getBrand()+" "+car.getPrice()+" "+car.getColor());

        }

    }
}
