package Test;

import java.util.Scanner;

public class Test02 {
        public static void main(String[] args) {
		/*
		大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出 一定的条件：高：180cm以上；富：财富1千万以上；帅：是。
        如果这三个条件同时满足，则：“我一定要嫁给他!!!”
		如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
		如果三个条件都不满足，则：“不嫁！”
		*/
            Scanner scan=new Scanner(System.in);
            double height=scan.nextDouble();
            double money=scan.nextDouble();
            //方式1
            boolean isHandsome=scan.nextBoolean();
            if((height>180)&&(money>10000000)&&(isHandsome)){
                System.out.println("我一定要嫁给他!!!");
            }else if((height>180)||(money>10000000)||(isHandsome)){
                System.out.println("嫁吧，比上不足，比下有余");
            }else{
                System.out.println("不嫁！");
            }
            scan.close();



        }
    }

