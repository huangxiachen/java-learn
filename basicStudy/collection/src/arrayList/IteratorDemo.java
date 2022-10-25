package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    //迭代器的使用，迭代器不依赖索引,依赖指针的移动，迭代器移动到最后不会复位
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        //添加几个元素
        lists.add("hello");
        lists.add("world");
        lists.add("you");
        lists.add("are");
        lists.add("beautiful");
        //获取迭代器对象
        Iterator<String> it = lists.iterator();
        //判断有没有下一个元素
        while (it.hasNext()) {
                //有元素的话就获取
            String next = it.next();
            if ("you".equals(next)){
                it.remove();
            }
            /**
             * 注意
             * 迭代器指针不会复位
             * 循环中只能用一次next()方法
             * 迭代器遍历的时候不能用集合的方法增加或者删除,只能用迭代器的remove()方法
             */
        }
        System.out.println(lists);

    }
}
