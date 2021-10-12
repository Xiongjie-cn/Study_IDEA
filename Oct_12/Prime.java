package Oct_12;

/**
 * Description:
 *             输出区间[200,300]上的所有素数
 *
 * @author Xiongjie
 * @data Created on 2021/10/12
 */
public class Prime {
    public static void main(String[] args) {
        int i, j;
        System.out.println("区间[200,300]上的素数有：");
        outer:
        for (i = 200; i < 300; i++) {
            for (j = 2; j < (int) i / 2 + 1; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.print(i + " ");
        }
    }
}
