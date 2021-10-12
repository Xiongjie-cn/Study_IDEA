// 03使用算术运算符得到一个4位十进制的各位数字并输出，然后输出该数的逆序数和各位数字平方后相加的和
package Work_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/10/12
 */
public class work03Math {
    public static void main(String[] args) throws IOException {
        //
        StringBuilder s;
        System.out.print("请输入一个4位十进制数：");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //
        s = new StringBuilder(br.readLine());
        System.out.println("千位为：" + s.charAt(0));
        System.out.println("百位为：" + s.charAt(1));
        System.out.println("十位为：" + s.charAt(2));
        System.out.println("个位为：" + s.charAt(3));
        System.out.println("逆序数为：" + s.reverse());
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result += Math.pow(Character.getNumericValue(s.charAt(i)), 2);
        }
        System.out.println("各位数字平方后相加的和为:" + result);
    }
}
