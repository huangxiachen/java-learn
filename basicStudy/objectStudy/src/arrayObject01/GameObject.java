/**
 文字版格斗游戏
  格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候（new对象的时候)，这些信息
 就应该被确定下来。
**/

package arrayObject01;

import java.util.Random;

public class GameObject {

    private String c_Name;
    private int blood;

    public GameObject() {
    }

    public GameObject(String c_Name, int blood) {
        this.c_Name = c_Name;
        this.blood = blood;
    }


    @Override
    public String toString() {
        return "GameObject{" +
                "c_Name='" + c_Name + '\'' +
                ", blood=" + blood +
                '}';
    }

    /**
     * 获取
     * @return c_Name
     */
    public String getC_Name() {
        return c_Name;
    }

    /**
     * 设置
     * @param c_Name
     */
    public void setC_Name(String c_Name) {
        this.c_Name = c_Name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }
    //攻击
    public void  hit (GameObject role){
            int injury_Blood;
            Random rd = new Random();
            injury_Blood = rd.nextInt(20)+1;
            role.blood = role.blood - injury_Blood;
            role.blood = role.blood <= 0 ? 0 : role.blood;
            System.out.println(this.c_Name+"攻击了"+role.c_Name+",造成了"
                    +injury_Blood+"伤害,"+role.c_Name+"还剩"+role.blood+"伤害");



    }
}
