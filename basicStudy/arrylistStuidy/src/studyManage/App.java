package studyManage;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            System.out.println("--------------欢迎来到学生管理系统---------------");
            System.out.println("请选择操作: 1.登录  2.注册  3.忘记密码   4.退出");
            System.out.println("请输入您的选择:");
            int choose = sc.nextInt();
            //功能界面
            switch (choose) {
                case 1:
                    login(users);
                    break;
                case 2:
                    register(users);
                    break;
                case 3:
                    findPassw(users);
                    break;
                case 4:
                    System.out.println("退出");
                    System.exit(0);
                default:
                    System.out.println("没有这个选项，请重新输入选择");
            }
        }
    }

    //注册
    public static int register(ArrayList<User> users) {
        User user = new User();
        //1.(1)判断用户名是否符合要求，(2)再判断是否存在
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String uname = sc.next();
            boolean flag1 = checkUname(uname);
            if (!flag1) {
                continue;
            }
            //判断用户名是否存在
            boolean flag2 = exitUser(users, uname);
            if (flag2) {
                System.out.println("用户名" + "已经存在，请重新输入");
                continue;
            } else {
                System.out.println(uname + "可用！");
            }
            user.setUname(uname);
            //3.用户名合格，输入密码,
            while (true) {
                System.out.println("请输入密码：");
                String upassw1 = sc.next();
                System.out.println("请再次输入密码：");
                String upassw2 = sc.next();
                //4.判断密码是否符合要求
                if (upassw1 == null) {
                    System.out.println("密码不能为空！请重新输入");
                    continue;
                } else if (upassw1.equals(upassw2)) {
                    System.out.println("密码设置成功！");
                    user.setUpassw(upassw1);
                    break;
                }
                System.out.println("两次密码不一致");
            }
            //5.输入用户信息(身份证号,手机号)判断身份证号和手机号是否符合要求

            //判断身份证号码
            while (true) {
                System.out.println("请输入身份证号码：");
                String identityId = sc.next();
                boolean flag3 = checkIdentityId(identityId);
                if (!flag3) {
                    System.out.println("身份证格式错误，请重新输入");
                    continue;
                }
                System.out.println("身份证号码可用！");
                user.setIdentity_id(identityId);
                break;
            }

            //判断手机号
            while (true) {
                System.out.println("请输入手机号码：");
                String phoneNumber = sc.next();
                boolean flag4 = checkphoneNumber(phoneNumber);
                if (!flag4) {
                    System.out.println("手机号码格式错误，请重新输入");
                    continue;
                }
                System.out.println("手机号码可用！");
                user.setPhone_id(phoneNumber);
                break;
            }


            //7.都符合要求提示用户注册成功
            System.out.println("注册成功！！！");
            users.add(user);
            return 1;
        }
    }


    //判断用户名是否符合要求，
    public static boolean checkUname(String uname) {
        // * 用户名长度必须在3~15位之间
        if (uname.length() < 3 || uname.length() > 15) {
            System.out.println("用户名长度需要在3~15的范围内，请重新输入");
            return false;
        }
        // * 只能是字母加数字的组合，但是不能是纯数字
        int num = 0, letter = 0;
        for (int i = 0; i < uname.length(); i++) {
            char c = uname.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                letter++;
            } else if (c >= '0' && c <= '9') {
                num++;
            } else {
                System.out.println("用户名只能包含数字和字母！");
                return false;
            }
        }
        if (num == 0 || letter == 0) {
            System.out.println("用户名需要数字和字母的组合！");
            return false;
        }
        return true;
    }

    //1.判断用户名是否存在
    public static boolean exitUser(ArrayList<User> users, String uname) {
        for (int i = 0; i < users.size(); i++) {
            String name = users.get(i).getUname();
            if (name != null && name.equals(uname)) {
                return true;
            }
        }
        return false;
    }


    //验证身份证号码
    private static boolean checkIdentityId(String identityId) {
        /**
         *验证要求：
         *长度为18位
         *不能以0为开头
         *前17位，必须都是数字
         * 最为一位可以是数字，也可以是大写X或小写×
         */
        if (identityId.length() != 18) {
            return false;
        }
        char first = identityId.charAt(0);
        if (first == '0') {
            return false;
        }
        for (int i = 0; i < identityId.length() - 1; i++) {
            char c = identityId.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        char last = identityId.charAt(17);
        if ((last >= '0' && last <= '9') || last == 'X' || last == 'x') {
            return true;
        }

        return false;
    }

    //验证手机号码
    private static boolean checkphoneNumber(String phoneNumber) {

        if (phoneNumber.length() == 11) {
            for (int i = 0; i < phoneNumber.length(); i++) {
                char c = phoneNumber.charAt(i);
                if (c >= '0' && c <= '9') {
                    return true;
                }
            }
        }
        return false;
    }

    //显示验证码
    private static String showCode() {
        //1.定义用来随机生成字母的集合
        ArrayList<Character> letters = new ArrayList<>();
        char letter;
        for (int i = 0; i < 26; i++) {
            letter = (char) (97 + i);
            letters.add(letter);
            letter = (char) (65 + i);
            letters.add(letter);
        }
        //        System.out.println(letters);
        //随机生成每一位验证码的下标
        Random r = new Random();
        int index;
        //拼接验证码字母部分
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            index = r.nextInt(letters.size());
            sb.append(letters.get(index));
        }
//        System.out.println(sb.toString());
        //随机生成一个数字添加在字母验证码后面,把拼接的验证码变成字符串
        int num = r.nextInt(10);
        char chnum = (char) (num + 48);
        String s = sb.append(chnum).toString();
//        System.out.println(s);
        //把验证码放进数组中随机生成数字的下标位置然后通过交换位置插入字母中
        char code[] = new char[5];
        for (int i = 0; i < code.length; i++) {
            code[i] = s.charAt(i);
        }
        int indexnum = r.nextInt(5);
        char temp = code[indexnum];
        code[indexnum] = chnum ;
        code[code.length-1] = temp;
        String newcode = new String(code);
        System.out.println(newcode);
        return newcode;
    }

    //登录
    public static boolean login(ArrayList<User> users) {
        //输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String passw = sc.next();
        //显示验证码
        String code = showCode();
        //输入验证码然后验证
        System.out.println("请输入验证码：");
        String s = sc.next();
        while (true){
            if (s.equalsIgnoreCase(code)){
                break;
            }else {
                code = showCode();
                System.out.println("验证码输入错误，请重新输入：");
                s = sc.next();
            }
        }

        while (true) {
            //1.判断用户名格式是否正确
            boolean flag1 = checkUname(name);
            boolean flag2 = exitUser(users, name);
            //2.判断用户名是否存在，不存在就提示用户需要注册
            if (!flag1) {
                System.out.println("用户名格式错误，请重新输入");
                name = sc.next();
                continue;
            }

            if (!flag2) {
                System.out.println("用户名不存在，请注册");
                register(users);
                return false;
            }


            break;
        }

        //3.用户名存在就判断密码是否正确
        //输入密码

        while (true) {

            int index = findUser(users, name);
            if (index == -1){
                continue;
            }
            String upassw = users.get(index).getUpassw();
            //4.用户名密码都正确就登陆成功
            int i = 0;
            for ( i = 1; i < 3;i++) {
                if (upassw.equals(passw)) {
                    System.out.println("登录成功！！！");
                    break;
                }else {
                    System.out.println("密码错误，请重新输入密码");
                    passw = sc.next();
                }
            }
            if (i == 3){
                System.out.println("密码错误超过3次，账号已锁定");
                return false;
            }
            break;

        }
        return true;
    }



    //根据uname查找有没有这个用户
    public static int findUser(ArrayList<User> users, String name){
        //查找到就返回用户的索引
        for (int i = 0; i < users.size(); i++) {
            if (name.equals(users.get(i).getUname())) {

                return i;
            }
        }

        return  -1;
    }

    //忘记密码
    public static void findPassw(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        //1.判断用户名存不存在，不存在就提示不存在,存在就找到用户的索引
        System.out.println("请输入用户名：");
        String name = sc.next();
        boolean flag1 = exitUser(users, name);
        int index;
        if (!flag1) {
            System.out.println("用户名不存在！");
            return;
        }else {
            index = findUser(users, name);
        }
        User user = users.get(index);
        while (true) {

            //2.用户存在就判断身份证号码和手机号
            System.out.println("请输入身份证号码：");
            String identityId = sc.next();
            System.out.println("请输入手机号码：");
            String phonenumb = sc.next();
            String uid = user.getIdentity_id();
            String uphone = user.getPhone_id();
            if (uid.equals(identityId)){
                System.out.println("身份证号码正确！");
            }else {
                System.out.println("身份号码错误，请重新输入");
                continue;
            }
            if (uphone.equals(phonenumb)){
                System.out.println("手机号码正确！");
            }else {
                continue;
            }
            System.out.println("用户信息正确，请重置密码");
            break;
        }
        //3.如果信息都判断成功，就修改密码
        while (true) {
            System.out.println("请输入新密码：");
            String p1 = sc.next();
            System.out.println("请再次输入新密码：");
            String p2 = sc.next();
            if (p1.equals(p2)){
                System.out.println("密码重置成功");
                user.setUpassw(p1);
                break;
            }else {
                System.out.println("两次密码不一致，请重新输入");
            }
        }
    }

}
