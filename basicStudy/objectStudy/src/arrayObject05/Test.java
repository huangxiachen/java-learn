/**
 * 要求1：计算出四个女朋友的平均年龄
 * 要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。
 */
package arrayObject05;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GirlFriend girlFriends[] = new GirlFriend[4];
        //添加数据
        addGirlF(girlFriends);
        //遍历
        traverse(girlFriends);
        //要求1：计算出四女朋友的平均年龄
        int avg = computerAvg(girlFriends);
        System.out.println("平均年龄为："+avg);
        //要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。
        for (int i = 0; i < girlFriends.length; i++) {
            if(girlFriends[i].getAge() < avg){
                String s = girlFriends[i].toString();
                System.out.println(s);
            }
        }
    }
    //添加4个女朋友
    public static void addGirlF(GirlFriend girlFriends[]){
        for (int i = 0; i < girlFriends.length ; i++) {
            GirlFriend girlFriend = new GirlFriend();
            System.out.println("请输入第"+(i+1)+"个女朋友的姓名、年龄、性别、爱好：");
            Scanner name = new Scanner(System.in);
            girlFriend.setName(name.next());
            Scanner age = new Scanner(System.in);
            girlFriend.setAge(age.nextInt());
            Scanner gender = new Scanner(System.in);
            girlFriend.setGender(gender.next());
            Scanner habby = new Scanner(System.in);
            girlFriend.setHobby(gender.next());
            girlFriends[i] = girlFriend;
        }
    }
    //遍历输出信息
    public static void traverse(GirlFriend girlFriends[]){
        GirlFriend girlFriend = new GirlFriend();
        for (int i = 0; i < girlFriends.length; i++) {
            girlFriend = girlFriends[i];
            String s = girlFriend.toString();
            System.out.println(s);
        }
    }
    //要求1：计算出四女朋友的平均年龄
    public static int computerAvg(GirlFriend girlFriends[]){
        int sum = 0,avg = 0;
        for (int i = 0; i < girlFriends.length; i++) {
            sum+=girlFriends[i].getAge();
        }
        avg = sum/girlFriends.length;
        return avg;
    }
}
