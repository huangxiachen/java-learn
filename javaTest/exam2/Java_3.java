import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//**********found**********
public class Java_3 extends JFrame {
    private JTextField username;
    private JPasswordField password;
    private JLabel jl1;
    private JLabel jl2;
    private JLabel jl3;
    private JLabel jl4;
    private JButton bu1;
    private JButton bu2;
    private JButton bu3;
    private JCheckBox jc1;
    private JCheckBox jc2;
    private JComboBox jcb;
    
    public Java_3() {
        this.setTitle("QQ2022正式版");
        //**********found**********
        this.set
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置布局方式为绝对定位
        this.setLayout(null);

        this.setBounds(0, 0, 355, 265);
        // 设置窗体的标题图标
        Image image = new ImageIcon("a.png").getImage();
        this.setIconImage(image);
        // 窗体大小不能改变
        this.setResizable(false);
        // 居中显示
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void init() {
        //**********found**********
        Container con = this.getParent();
        jl1 = new JLabel();
        // 设置背景图片
        Image image1 = new ImageIcon("background.jpg").getImage();
        jl1.setIcon(new ImageIcon(image1));
        jl1.setBounds(0, 0, 355, 265);

        jl2 = new JLabel();
        Image image2 = new ImageIcon("a.gif").getImage();
        jl2.setIcon(new ImageIcon(image2));
        jl2.setBounds(40, 95, 50, 60);

        username = new JTextField();
        username.setBounds(50, 50, 150, 20);
        jl3 = new JLabel("注册账号");
        jl3.setBounds(210, 50, 70, 20);
        password = new JPasswordField();
        password.setBounds(50, 80, 150, 20);
        jl4 = new JLabel("找回密码");
        jl4.setBounds(210, 80, 70, 20);
        jc1 = new JCheckBox("记住密码");
        jc1.setBounds(125, 135, 80, 15);
        jc2 = new JCheckBox("自动登录");
        jc2.setBounds(215, 135, 80, 15);
        jcb = new JComboBox();
        jcb.addItem("在线");
        jcb.addItem("隐身");
        jcb.addItem("离开");
        jcb.setBounds(40, 135, 55, 20);
        //**********found**********
        bu1 = new JButton("登录");
        bu1.setBounds(250, 200, 65, 20);
        //**********found**********
        bul1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str=e.getActionCommand();
                if("登录".equals(str)){
                     String getName =username.getText();
                     JOptionPane.showConfirmDialog(null, "您输入的用户名是"+getName);
                }
            }
        });
        bu2 = new JButton("多账号");
        bu2.setBounds(25, 200, 75, 20);
        bu3 = new JButton("设置");
        bu3.setBounds(140, 200, 65, 20);
        // 所有组件用容器装载
        jl1.add(jl2);
        jl1.add(jl3);
        jl1.add(jl4);
        jl1.add(jc1);
        jl1.add(jc2);
        jl1.add(jcb);
        jl1.add(bu1);
        jl1.add(bu2);
        jl1.add(bu3);
        con.add(jl1);
        con.add(username);
        con.add(password);
    }
    public static void main(String[] args) {
        Java_3 qq = new Java_3();
    }
}
