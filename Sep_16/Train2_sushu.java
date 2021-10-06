package Sep_16;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/16
 */
public class Train2_sushu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数,输入0结束程序");
            int x = sc.nextInt();
            if (x == 0) break;
            int i = 2;
            pb:
            {
                for (; i < (x / 2 + 1); i++) {
                    if (x % i == 0) {
                        System.out.println(x + "不是质数");
                        break pb;
                    }
                }
                System.out.println(x + "是质数");
            }
        }
    }
}

