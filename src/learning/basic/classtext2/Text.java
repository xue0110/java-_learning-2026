package learning.basic.classtext2;

import learning.basic.classtext.Role;

import java.util.Random;

public class Text {
    private String name;
    private int blood;
private char gender;
private String face;
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    public Text() {
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
//长相是随机的
        if(gender == '男'){
            //从boyfaces里面随机长相
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if(gender == '女'){
            //从girlfaces里面随机长相
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else{
            this.face = "面目狰狞";
        }
    }

    public Text(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
    public void attack(Role role) {
        //计算造成的伤害 1 ~ 20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //剩余血量
        int remainBoold = role.getBlood() - hurt;
        //对剩余血量做一个验证，如果为负数了，就修改为0
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        //修改一下挨揍的人的血量
        role.setBlood(remainBoold);

        //this表示方法的调用者
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害，" + role.getName() + "还剩下了" + remainBoold + "点血");
    }
    public void show()
    {
        System.out.println("姓名"+getName());
        System.out.println("血量"+getBlood());
        System.out.println("性别"+getGender());
        System.out.println("样貌"+getFace());
    }

}
