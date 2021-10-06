package Sep_30;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/30
 */
public class Demo1 {
    public static void main(String[] args) {
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            sum1 += i;
        }
        int sum2 = 0;
        int j = 0;
        while (j < 100) {
            j++;
            sum2 += j;
        }
        int sum3 = 0;
        int k = 0;
        do {
            k++;
            sum3 += k;
        } while (k < 100);
        System.out.println("sum1的值为：" + sum1);
        System.out.println("sum2的值为：" + sum2);
        System.out.println("sum3的值为：" + sum3);
    }
}
