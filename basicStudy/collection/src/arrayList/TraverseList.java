package arrayList;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 增强for循环底层原理就是迭代器，为了简化代码的书写
 * 所有的单列集合才能用增强for进行遍历
 * 格式
 * for(元素数据类型 变量名:数组或集合名){
 *
 * }
 * 快速生成方式：集合或数组.for
 */
public class TraverseList {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        //添加几个元素
        lists.add("hello");
        lists.add("world");
        lists.add("you");
        lists.add("are");
        lists.add("beautiful");
        //增强for
        for (String str : lists){
            //str是一个第三方变量，不会改变集合中的变量
            System.out.print(str+" ");
        }
        System.out.println();
        //普通for
        for (int i = 0; i < lists.size(); i++) {
            System.out.print(lists.get(i)+" ");
        }
        System.out.println();

        //利用匿名内部类的方式遍历集合
        //底层原理：普通for循环遍历每一个元素交个accept方法
        lists.forEach(new Consumer<String>() {
            @Override
            //s依次表示集合中的每一个数据
            public void accept(String s) {
                System.out.print(s+" ");
            }
        });
        System.out.println();

        /**
         * lambda表达式遍历集合
         *()->{}
         *
         */
        lists.forEach((String s) ->{
                System.out.print(s+" ");
        });

        /**
         * 总结：
         * 仅仅是遍历使用增强for或者lambda表达式
         * 想在遍历的时候删除元素就使用迭代器
         *
         */

    }
}
