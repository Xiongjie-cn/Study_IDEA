//  01编写Java应用程序，分别利用while循环、do-while循环和for循环求100~200的自然数的和
package Work_10;

/**
 * Description:
 *             求100~200自然数求和
 *
 * @author Xiongjie
 * @data Created on 2021/10/12
 */
public class work01Sum {
    public static void main(String[] args) {

        //while方法参数
        int sum1 = 0;
        int i1 = 100;

        //do-while方法参数
        int sum2 = 0;
        int i2 = 100;

        //for方法参数
        int sum3 = 0;
        int i3;

        //while方法求解
        while (i1 < 201) {
            sum1 += i1;
            i1++;
        }
        System.out.println("while方法的结果为：" + sum1);

        //do-while方法求解
        do {
            sum2 += i2;
            i2++;
        } while (i2 < 201);
        System.out.println("do-while方法的结果为：" + sum2);

        //for方法求解
        for (i3 = 100; i3 < 201; i3++) {
            sum3 += i3;
        }
        System.out.println("for方法的结果为：" + sum3);
    }
}
