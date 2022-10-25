package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**5种遍历方式
 * 1.迭代器
 * 2.列表迭代器
 * 3.增强for
 * 4.lambda表达式
 * 5.普通for
 *
 */
public class TraverseList {
    public static void main(String[] args) {
        //list的5种遍历方式
        List<String> lists = new ArrayList<>();

        //列表迭代器
        //添加几个元素
        lists.add("hello");
        lists.add("world");
        lists.add("you");
        lists.add("are");
        lists.add("beautiful");
        //获取列表迭代器
        ListIterator<String> it = lists.listIterator();
        while (it.hasNext()) {
            String next = it.next();
            if ("are".equals(next)) {
                it.add("very");
            }
        }
        System.out.println(lists);
        /**总结
         * 五种遍历方式对比
         * 迭代器遍历
         * 在遍历的过程中需要删除元素，请使用迭代器。
         * 列表迭代器
         * 在遍历的过程中需要添加元素，清使用列表迭代器。
         * 增强for遍历
         * 仅仅想遍历，那么使用增强for或Lambda表达式。
         * Lambda表达式
         * 普通for
         * 如果遍历的时候想操作索引，可以用普通for。
         */

    }
}
