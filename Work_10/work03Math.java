// 03使用算术运算符得到一个4位十进制的各位数字并输出，然后输出该数的逆序数和各位数字平方后相加的和
package Work_10;

import org.omg.CORBA.StringHolder;

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
        // StringBuilder s;
        // System.out.print("请输入一个4位十进制数：");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // s = new StringBuilder(br.readLine());
        // System.out.println("千位为：" + s.charAt(0));
        // System.out.println("百位为：" + s.charAt(1));
        // System.out.println("十位为：" + s.charAt(2));
        // System.out.println("个位为：" + s.charAt(3));
        // System.out.println("逆序数为：" + s.reverse());
        // int result = 0;
        // for (int i = 0; i < 4; i++) {
        //     result += Math.pow(Character.getNumericValue(s.charAt(i)), 2);
        // }
        // System.out.println("各位数字平方后相加的和为:" + result);

        StringBuilder s;
        boolean b = false;
        do {
            try {
                System.out.print("请输入一个4位十进制数：");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                s = new StringBuilder(br.readLine());
                if (s.length() == 4) {
                    int num = Integer.parseInt(s.toString());
                    int[] numList = new int[4];
                    numList[0] = num / 1000;
                    numList[1] = num / 100 - 10 * numList[0];
                    numList[2] = num / 10 - 100 * numList[0] - 10 * numList[1];
                    numList[3] = num - 1000 * numList[0] - 100 * numList[1] - 10 * numList[2];
                    System.out.println("千位为：" + numList[0]);
                    System.out.println("百位为：" + numList[1]);
                    System.out.println("十位为：" + numList[2]);
                    System.out.println("个位为：" + numList[3]);
                    System.out.println("逆序数为：" + s.reverse());
                    int result = 0;
                    for (int i = 0; i < 4; i++) {
                        result += Math.pow(numList[i], 2);
                    }
                    System.out.println("各位数字平方后相加的和为:" + result);
                    b = false;
                } else {
                    b = true;
                    System.out.println("您输入的4位十进制数格式有误！");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("您输入的4位十进制数格式有误！");
                b = true;
            }
        } while (b);
    }
}
