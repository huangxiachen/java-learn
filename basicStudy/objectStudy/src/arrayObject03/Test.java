package arrayObject03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Phone phones[] = new Phone[3];
        //输入添加的索引
        for (int i = 0; i < phones.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入添加索引：");
            int index = scanner.nextInt();
            addPhones(index, phones);
        }
        traverse(phones);

        double avgPrice = avg(phones);
        System.out.println(avgPrice);

    }
    //添加
    public static void addPhones(int index,Phone phones[]){
       Phone phone = new Phone();
       System.out.println("请输入phone的id,brand,color,price");
       Scanner id = new Scanner(System.in);
       phone.setId(id.nextInt());
       Scanner brand = new Scanner(System.in);
       phone.setBrand(brand.next());
       Scanner color = new Scanner(System.in);
       phone.setBrand(color.next());
       Scanner price = new Scanner(System.in);
       phone.setPrice(price.nextDouble());
       phones[index] = phone;
    }
    //遍历
    public static void traverse(Phone phones[]){
        Phone phone = new Phone();
        for (int i = 0; i < phones.length ; i++) {
            phone = phones[i];
            if(phone!=null){
                String s = phone.toString();
                System.out.println(s);
            }
        }
    }
    //计算平均价格
    public static double avg(Phone phones[]){
        double avgPrice = 0,sum = 0;
        for (int i = 0; i < phones.length; i++) {
            sum += phones[i].getPrice();
        }
        avgPrice = sum/phones.length;
        return avgPrice;
    }
}
