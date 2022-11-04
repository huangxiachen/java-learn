package com.chx.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //设置宽高
        jFrame.setSize(603, 688);
        //设置标题
        jFrame.setTitle("拼图小游戏单机版 V1.0");
        //设置置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(3);
        //取消默认居中的方式
        jFrame.setLayout(null);

        //创建按钮对象
        JButton jButton = new JButton("点击");
        //设置位置和宽高
        jButton.setBounds(0,0,100,50);
        //给按钮设置动作监听(鼠标左键点击，空格)，这个按钮事件只用了一次，所以可以直接用匿名内部类
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击");
            }
        });

        //把按钮添加到界面当中，
        jFrame.getContentPane().add(jButton);

        //显示
        jFrame.setVisible(true);
    }
}
