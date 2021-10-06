package Sep_23;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/23
 */
public class Train1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = (int) (100 * Math.random());
        int sum = 0;
        int x2 = -1;
        while (x2 != x) {
            System.out.println("请输入一个0~100的数字：");
            sum = sum + 1;
            x2 = sc.nextInt();
            if (x2 > x) {
                System.out.println("输入的数比答案大");
            } else if (x2 < x) {
                System.out.println("输入的数比答案小");
            } else {
                System.out.println("恭喜你答对了！");
                System.out.println("你总共猜测了" + sum + "次");
                sc.close();
            }
        }
    }
}
