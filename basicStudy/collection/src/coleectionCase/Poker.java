package coleectionCase;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        //1.定义一个集合存储所有的牌
        ArrayList<String> arrlist = new ArrayList<>();

        //四种花色
        String[] colorPoker = new String[]{"♥", "♠", "♣", "♦"};

        //扑克牌的数字
        String[] numPoker = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        //生成扑克牌
        for (String color : colorPoker) {
            for (String num : numPoker) {
                //添加花色
                arrlist.add(color + num);

            }
        }
        //添加大小王
        arrlist.add("♛King");
        arrlist.add("♕Queen");

        //洗牌打乱元素顺序
        Collections.shuffle(arrlist);
        System.out.println("洗牌后的牌型：" + arrlist);

        //玩家牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> bottom = new ArrayList<>();

        //发牌
        for (int i = 0; i < arrlist.size(); i++) {
            if (i < 3) {
                bottom.add(arrlist.get(i));
            } else {
                if (i % 3 == 0) {
                    player1.add(arrlist.get(i));
                }
                if (i % 3 == 1) {
                    player2.add(arrlist.get(i));
                }
                if (i % 3 == 2) {
                    player3.add(arrlist.get(i));
                }
            }

        }

        //看底牌
        look("周润发", player1);
        look("刘德华", player2);
        look("周星驰", player3);
        look("底牌", bottom);


    }

    private static void look(String name, ArrayList<String> player) {
        System.out.println(name + "底牌是：");
        for (String s : player) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }


}
