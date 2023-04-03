//验证码测试
/**
 *验证码规则：
 *长度为5
 *由4位大写或者小写字母和1位数字组成，同一个字母可重复
 *数字可以出现在任意位置
 */

package studyManage;

import java.util.ArrayList;
import java.util.Random;

public class CodeTest {
    public static void main(String[] args) {

        showCode();
    }
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
}
