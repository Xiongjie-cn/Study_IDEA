package Sep_30;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/30
 */
public class Demo2 {
    public static void main(String[] args) {
        double d1 = 0.999;
        double d2 = 1.001;
        double sum1 = 1;
        double sum2 = 1;
        for (int i = 0; i < 365; i++) {
            sum1 *= d1;
            sum2 *= d2;
        }
        System.out.println("每天输出99.9999%，一年后值为：" + sum1);
        System.out.println("每天输出100.0001%，一年后值为：" + sum2);
        sum1 = 1;
        int v = (int) (365 * 0.6);
        for (int i = 0; i < v; i++) {
            sum1 *= d2;
        }
        for (int i = 0; i < 365 - v; i++) {
            sum1 *= d1;
        }
        System.out.println(sum1);
    }
}
