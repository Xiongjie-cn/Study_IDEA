// 02编写Java应用程序，选择合适的数据类型，利用循环求2的40次方的结果并输出
package Work_10;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/10/12
 */
public class work02Calculate {
    public static void main(String[] args) {
        //定义long型数据result，最终结果
        long result = 1;
        for (int i = 0; i < 40; i++) {
            result *= 2;
        }
        System.out.println("2的40次方的结果为：" + result);
    }
}
