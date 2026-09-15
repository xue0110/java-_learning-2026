package learning.basic;

public class MethodDemo {
    public static void main(String[] args) {
        GItSum(2, 4);
        GItlength(2.3, 4.5);
        gityuan(3.5);
        //int ass=add(1,2,2,4);
        //System.out.println("一共是"+ass);
        System.out.println(add(3,4,7,8));
        System.out.println(Sum(1,2));
        System.out.println(Sum(1,2,3));
        int[] arr ={3,6,2,76,25,24,24,234,435,455,};
        int[] quu = copyarr(arr,2,5);
        for(int i=0;i<quu.length;i++){
            System.out.print(quu[i]+"  ");
        }
    }

    public static void GItSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        int ass=add(1,2,2,4);
        System.out.println("一共是"+ass);

    }

    public static void GItlength(double q, double w) {
        double length = q + w;
        System.out.println(length);
    }
    public static void gityuan(double r){
        double yuan=r*r*3.14;
        System.out.println("圆的面积是"+yuan);
    }
    //带返回值的方法
    public static int add(int one,int two,int three,int four){
        return one+two+three+four;
    }
    //方法的重载
    public static int Sum(int a,int b){
        return a+b;
    }
    public static int Sum(int a,int b,int c){
        return a+b+c;
    }
    public static int[] copyarr(int[] arr,int from,int to) {
        int[] arr1 = new int[to - from + 1];
        for (int i = from-1; i <= to-1; i++) {
            arr1[i - from+1] = arr[i];

        }
        return arr1;

    }
}

