package com.chx.ptGame.ui;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_GREENPeer;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJframe extends JFrame implements KeyListener, ActionListener {

    //把打乱的图片数据装进二维数组中(4行4列)对应图片在界面中的坐标位置
    private int[][] data = new int[4][4];
    //记录图片在界面上的行列位置
    private int x = 0;//行
    private int y = 0;//列
    //共同路径部分
    private String path = "image\\animal\\";
    //定义正确拼图图片的数据
    private int [][] win = {
            {1,2,3,4},
            {5,6,7,8,},
            {9,10,11,12},
            {13,14,15,0}
    };
    //记录移动步数
    private int step = 0;

    //创建选项上面的条目对象(重新游戏 重新登录 关闭游戏)
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    //公众号
    JMenuItem accountItem = new JMenuItem("公众号");


    public GameJframe() {

        //初始化界面
        initJM();
        //初始化菜单
        initJMBar();
        //打乱图片数据
        disorderImage();
        //添加图片
        initImage();
        //让界面显示
        this.setVisible(true);
    }

    //打乱图片

    private void disorderImage() {
        //把图片装在数组中(对应每张图片的名称)
        int[] dataIndex = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //遍历数组元素，拿着随机下标跟数组原有下标上的值进行交换，防止随机到重复的值
        Random r = new Random();
        int temp;
        int index;
        for (int i = 0; i < dataIndex.length; i++) {
            //随机下标
            index = r.nextInt(dataIndex.length);
            temp = dataIndex[i];
            dataIndex[i] = dataIndex[index];
            dataIndex[index] = temp;
        }
        //把打乱的数据装进二维数组中
        for (int i = 0; i < dataIndex.length; i++) {
            //在添加图片在界面同时记录空白格的坐标位置
            if (dataIndex[i] == 0){
                x = i/4;
                y = i%4;
            }
            data[i / 4][i % 4] = dataIndex[i];
        }

    }

    //初始化图片，添加图片到界面上
    private void initImage() {
        //清空原本已经出现的图片
        this.getContentPane().removeAll();
        //如果拼图成功，显示胜利
        if (victory()){
            JLabel jLabel = new JLabel(new ImageIcon("image\\win.png"));
            jLabel.setBounds(203,283,197,93);
            this.getContentPane().add(jLabel);
        }
        //加载步数
        JLabel stepjb = new JLabel("步数：" + step);
        stepjb.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepjb);

        int num = 0;//获取图片下标
        //4行4列
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                num = data[i][j];
                //创建一个图片ImageIcon的对象
                //创建一个JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon(path+"animal1\\" + num + ".jpg"));
                //添加之前设置位置
                jLabel.setBounds(105 * j+83, 105 * i+124, 105, 105);
                //设置边框,让图片凹下去
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));

                //获取真正的容器,添加图片
                this.getContentPane().add(jLabel);
            }
        }

        //添加背景图片，先添加的图片在上层，后添加的图片在下层
        JLabel jbg = new JLabel(new ImageIcon("image\\background.png"));
        //设置背景宽高，位置
        jbg.setBounds(40,40, 508, 560);
        //添加在当前界面中
        this.getContentPane().add(jbg);

        //刷新图片
        this.getContentPane().repaint();


    }


    //初始化界面
    private void initJM() {
        //设置宽高
        this.setSize(603, 688);
        //设置标题
        this.setTitle("拼图小游戏单机版 V1.0");
        //设置置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认居中的方式
        this.setLayout(null);
        //给界面添加键盘监听事件
        this.addKeyListener(this);
    }

    //初始化菜单
    private void initJMBar() {

        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项对象(功能 关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

      

        //把选项以及条目添加到菜单选项里面
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);



        //将菜单功能选项添加到菜单里
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下A不松展示完整图片
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == 65){
            //把界面中所有图片删掉
            this.getContentPane().removeAll();
            //加载一张完整图片
            JLabel jLabel = new JLabel(new ImageIcon(path+"animal1\\all.jpg"));
            //设置位置和宽高
            jLabel.setBounds(83,134,420,420);
            //添加到界面
            this.getContentPane().add(jLabel);
            //添加背景图片，先添加的图片在上层，后添加的图片在下层
            JLabel jbg = new JLabel(new ImageIcon("image\\background.png"));
            //设置背景宽高，位置
            jbg.setBounds(40,40, 508, 560);
            //添加在当前界面中
            this.getContentPane().add(jbg);
            //刷新界面
            this.getContentPane().repaint();

        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        //如果游戏胜利，不能再移动图片了
        if (victory()){
            return;
        }

        //对按下键盘上下左右进行逻辑判断，实现图片移动
        //获得键盘的对象
        int keyCode = e.getKeyCode();
        //左上右下：37,38,39,40
        if (keyCode == 37){
            //判断边界
            if(y==3){
                return;
            }
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            //y往上移动了记录y的值
            y++;
            step++;
            //重新初始化图片
            initImage();
            System.out.println("左"+keyCode);
        }else if (keyCode == 38){
            if(x==3){
                return;
            }
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            //x往上移动了记录x的值
            x++;
            step++;
            //重新初始化图片
            initImage();
            System.out.println("上"+keyCode);
        }else if (keyCode == 39){
            if(y==0){
                return;
            }
            data[x][y] = data[x][y-1];
            data[x][y-1] = 0;
            //y往上移动了记录y的值
            y--;
            step++;
            //重新初始化图片
            initImage();
            System.out.println("右"+keyCode);
        }else if (keyCode == 40){
            if(x==0){
                return;
            }
            data[x][y] = data[x-1][y];
            data[x-1][y] = 0;
            //x往上移动了记录x的值
            x--;
            step++;
            //重新初始化图片
            initImage();
            System.out.println("下"+keyCode);
        }else if(keyCode == 65){
            initImage();

        }else if(keyCode == 87){
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0},

            };
            initImage();
        }

    }

   // 判断是否拼图成功
    public Boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] != win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == replayItem){
            System.out.println("重新游戏");
            //记步数清零
            step = 0;
            //重新打乱图片顺序
            disorderImage();
            //重新加载图片
            initImage();

        }else if (obj == reLoginItem) {
            //关闭当前游戏界面
            this.setVisible(false);
            //打开登录界面
            LoginJFrame loginJFrame = new LoginJFrame();
            System.out.println("重新登录");
        }else if (obj == closeItem) {
            //直接关闭虚拟机
            System.exit(0);
            System.out.println("关闭游戏");
        }else if (obj == accountItem) {
            //创建一个弹框对象、
            JDialog jDialog = new JDialog();
            //创建一个管理图片对象
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.jpg"));
            //设置位置何宽高
            jLabel.setBounds(0, 0, 258,261 );
            //添加
            jDialog.getContentPane().add(jLabel);
            //设置弹框大小
            jDialog.setSize(344,344);
            //置顶弹框
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //设置弹框不关闭则无法操作
            jDialog.setModal(true);
            //让弹框显示
            jDialog.setVisible(true);

            System.out.println("公众号");
        }
    }
}
