package com.chx.ptGame.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //登录界面

    //初始化
    public LoginJFrame(){
        this.setSize(488,430);
        this.setVisible(true);
        //设置标题
        this.setTitle("拼图小游戏单机版 登录");
        //设置置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
    }
}
