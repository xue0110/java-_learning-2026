package learning.basic.classtext2;

import learning.basic.classtext.Role;

public class Text1 {
    public static void main(String[] args) {
        Text r1 = new Text("乔峰", 100, '男');
        //2.创建第二个角色
        Text r2 = new Text("鸠摩智", 100, '女');
        r1.show();
        r2.show();
    }
}