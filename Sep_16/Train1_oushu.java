package Sep_16;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/16
 */
public class Train1_oushu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数，输入0结束程序");
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            int y = x % 2;
            if (y == 0) {
                System.out.println(x + "是偶数");
            }else {
                System.out.println(x + "是奇数");
            }
        }
    }
}