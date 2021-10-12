package Oct_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Description:
 *             实验1-小数的小数部分、整数部分分别打印
 *
 * @author Xiongjie
 * @data Created on 2021/10/12
 */
public class findNum {

    // NumberFormatException:当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常。
    // BufferedReader:
    // try catch:

    public static void main(String[] args) throws IOException {
        String s;
        double d;
        int i;
        boolean b = false;
        do {
            try {
                System.out.println("请输入一个浮点数：");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                // 以字符串方式读入
                s = br.readLine();
                // 找到小数点的位置
                i = s.indexOf('.');
                // 将String转化为double
                d = Double.parseDouble(s);
                // 打印
                System.out.println(d + "整数部分为：" + (long) d);
                if (i == -1) {
                    System.out.println(d + "小数部分为：0.0");
                } else {
                    System.out.println(d + "小数部分为：" + Double.parseDouble((s.charAt(0) == '-') ? "-" : "") + "0." + s.substring(i + 1, s.length()));
                }
                b = false;
            } catch (NumberFormatException nfe) {
                System.out.println("您输入的浮点数格式有误，请重新输入！");
                b = true;
            }
        }while (b);
    }
}
