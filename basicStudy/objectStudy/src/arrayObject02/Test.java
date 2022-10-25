/**
 * 案例
 * 对象数组1
 * 定义数组存储3个商品对象。
 * 商品的属性：商品的id,名字，价格，库存。
 * 创建三个商品对象，并把商品对象存入到数组当中。
 */

package arrayObject02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Good goods[] = new Good[3];
        Scanner indexNum = new Scanner(System.in);
        System.out.printf("请输入要添加的商品索引[0,%d)：\n",goods.length);
        int index = indexNum.nextInt();
        addGood(index,goods);
        traverse(goods);
    }
    //添加方法
    public static void addGood(int index,Good goods[]){
        Good good = new Good();
        System.out.println("请输入商品的属性(id,name,price,repertory)：");
        Scanner id = new Scanner(System.in);
        good.setId(id.nextInt());
        Scanner name = new Scanner(System.in);
        good.setGName(name.next());
        Scanner price = new Scanner(System.in);
        good.setPrice(price.nextDouble());
        Scanner repertory = new Scanner(System.in);
        good.setRepertory(repertory.nextLong());
        goods[index] = good;
    }
    //遍历
    public static void traverse(Good goods[]){
        for (int i = 0; i < goods.length; i++) {
            Good good = goods[i];
            if (good != null){
                System.out.println(good);
            }
        }
    }
}
